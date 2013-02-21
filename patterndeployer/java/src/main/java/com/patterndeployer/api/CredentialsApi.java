package com.patterndeployer.api;

import com.patterndeployer.ApiException;
import com.patterndeployer.ApiInvoker;
import com.patterndeployer.model.Credentials;
import com.patterndeployer.model.Credential;
import java.util.*;

public class CredentialsApi {
  String basePath = "http://ec2-23-20-202-151.compute-1.amazonaws.com/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  public Credentials getCredentials () throws ApiException {
    // create path and map variables
    String path = "/credentials".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Credentials) ApiInvoker.deserialize(response, "", Credentials.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public Credential createCredential (String name, String for_cloud, String access_key_id, String secret_access_key, String username, String password, String tenant, String endpoint) throws ApiException {
    // create path and map variables
    String path = "/credentials".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(name == null || for_cloud == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(for_cloud)))
      queryParams.put("for_cloud", String.valueOf(for_cloud));
    if(!"null".equals(String.valueOf(access_key_id)))
      queryParams.put("access_key_id", String.valueOf(access_key_id));
    if(!"null".equals(String.valueOf(secret_access_key)))
      queryParams.put("secret_access_key", String.valueOf(secret_access_key));
    if(!"null".equals(String.valueOf(username)))
      queryParams.put("username", String.valueOf(username));
    if(!"null".equals(String.valueOf(password)))
      queryParams.put("password", String.valueOf(password));
    if(!"null".equals(String.valueOf(tenant)))
      queryParams.put("tenant", String.valueOf(tenant));
    if(!"null".equals(String.valueOf(endpoint)))
      queryParams.put("endpoint", String.valueOf(endpoint));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Credential) ApiInvoker.deserialize(response, "", Credential.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public Credential getCredentialById (Integer id) throws ApiException {
    // create path and map variables
    String path = "/credentials/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Credential) ApiInvoker.deserialize(response, "", Credential.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public Credentials deleteCredentialById (Integer id) throws ApiException {
    // create path and map variables
    String path = "/credentials/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Credentials) ApiInvoker.deserialize(response, "", Credentials.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public Credential modifyCredentialById (Integer id, String operation, String name, String access_key_id, String secret_access_key, String username, String password, String tenant, String endpoint) throws ApiException {
    // create path and map variables
    String path = "/credentials/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(id == null || operation == null || name == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(access_key_id)))
      queryParams.put("access_key_id", String.valueOf(access_key_id));
    if(!"null".equals(String.valueOf(secret_access_key)))
      queryParams.put("secret_access_key", String.valueOf(secret_access_key));
    if(!"null".equals(String.valueOf(username)))
      queryParams.put("username", String.valueOf(username));
    if(!"null".equals(String.valueOf(password)))
      queryParams.put("password", String.valueOf(password));
    if(!"null".equals(String.valueOf(tenant)))
      queryParams.put("tenant", String.valueOf(tenant));
    if(!"null".equals(String.valueOf(endpoint)))
      queryParams.put("endpoint", String.valueOf(endpoint));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Credential) ApiInvoker.deserialize(response, "", Credential.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

