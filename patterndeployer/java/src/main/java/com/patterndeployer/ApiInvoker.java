package com.patterndeployer;

import com.wordnik.swagger.core.util.JsonUtil;

import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.multipart.file.FileDataBodyPart;
import com.sun.jersey.multipart.BodyPart;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.impl.MultiPartWriter;

import javax.ws.rs.core.MediaType;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ApiInvoker {
  private static ApiInvoker INSTANCE = new ApiInvoker();
  private Map<String, Client> hostMap = new HashMap<String, Client>();
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();

  public static ApiInvoker getInstance() {
    return INSTANCE;
  }
  
  public void addDefaultHeader(String key, String value) {
     defaultHeaderMap.put(key, value);
  }

  public String escapeString(String str) {
    return str;
  }

  public String encodeUrl(String url) {
    try {
      return URLEncoder.encode(url, "UTF-8");
    }
    catch (UnsupportedEncodingException ex) {
      return url;
    }
  }

  public static Object deserialize(String json, String containerType, Class cls) throws ApiException {
    try{
      if("List".equals(containerType)) {
        JavaType typeInfo = JsonUtil.getJsonMapper().getTypeFactory().constructCollectionType(List.class, cls);
        List response = (List<?>) JsonUtil.getJsonMapper().readValue(json, typeInfo);
        return response;
      }
      else if(String.class.equals(cls)) {
        if(json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1) {
          return json.substring(1, json.length() - 2);
        }
        else 
          return json;
      }
      else {
        return JsonUtil.getJsonMapper().readValue(json, cls);
      }
    }
    catch (IOException e) {
      throw new ApiException(500, e.getMessage());
    }
  }

  public static String serialize(Object obj) throws ApiException {
    try {
      if (obj != null) return JsonUtil.getJsonMapper().writeValueAsString(obj);
      else return null;
    }
    catch (Exception e) {
      throw new ApiException(500, e.getMessage());
    }
  }

  public String invokeAPI(String host, String path, String method, Map<String, String> queryParams, Map<String, Object> bodyParams, Map<String, String> headerParams) throws ApiException {
    Client client = getClient(host);

    StringBuilder b = new StringBuilder();
    
    for(String key : queryParams.keySet()) {
      String value = queryParams.get(key);
      if (value != null){
        if(b.toString().length() == 0) b.append("?");
        else b.append("&");
        b.append(encodeUrl(key)).append("=").append(encodeUrl(value));
      }
    }
    String querystring = b.toString();

    FormDataMultiPart form = new FormDataMultiPart();

    for(String key : bodyParams.keySet()) {
      Object value = bodyParams.get(key);
      if (value != null){
        if (value instanceof File) form.bodyPart(new FileDataBodyPart(key, (File)value));
        else if (value instanceof String) form.bodyPart(new FormDataBodyPart(key, (String)value));
        else throw new ApiException(400, "Unsupport type for parameter " + key);
      }
    }

    if (form.getBodyParts().isEmpty()) {
      form.bodyPart(new BodyPart("", MediaType.TEXT_PLAIN_TYPE));
    }

    Builder builder = client.resource(host + path + querystring).type(MediaType.MULTIPART_FORM_DATA);
    for(String key : headerParams.keySet()) {
      builder.header(key, headerParams.get(key));
    }
    
    for(String key : defaultHeaderMap.keySet()) {
      if(!headerParams.containsKey(key)) {
        builder.header(key, defaultHeaderMap.get(key));
      }
    }
    ClientResponse response = null;

    if("GET".equals(method)) {
      response = (ClientResponse) builder.get(ClientResponse.class);
    }
    else if ("POST".equals(method)) {
        response = builder.post(ClientResponse.class, form);
    }
    else if ("PUT".equals(method)) {
      response = builder.put(ClientResponse.class, form);
      }
    else if ("DELETE".equals(method)) {
        response = builder.delete(ClientResponse.class);
    }
    else {
      throw new ApiException(500, "unknown method type " + method);
    }
    if(response.getClientResponseStatus() == ClientResponse.Status.OK) {
      return (String) response.getEntity(String.class);
    }
    else {
      String strResponse = response.getEntity(String.class);
      Map<String, String> jsonResponse = null;
      try {
        ObjectMapper mapper = new ObjectMapper();
        jsonResponse = mapper.readValue(strResponse, Map.class);
      }
      catch (IOException ex) {
        jsonResponse = new HashMap<String, String>();
      }

      if (jsonResponse.containsKey("error_message")) {
        throw new ApiException(
                  response.getClientResponseStatus().getStatusCode(),
                  jsonResponse.get("error_message"),
                  jsonResponse.get("trace"));
      }
      else {
        throw new ApiException(
                  response.getClientResponseStatus().getStatusCode(),
                  strResponse);
      }
    }
  }

  private Client getClient(String host) {
  if(!hostMap.containsKey(host)) {
    ClientConfig cc = new DefaultClientConfig();
    cc.getClasses().add(MultiPartWriter.class);
    Client client = Client.create(cc);
    client.addFilter(new LoggingFilter());
        hostMap.put(host, client);
  }
  return hostMap.get(host);
  }
}

