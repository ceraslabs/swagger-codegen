package com.patterndeployer.api;

import com.patterndeployer.ApiException;
import com.patterndeployer.ApiInvoker;
import com.patterndeployer.model.SupportingService;
import com.patterndeployer.model.SupportingServices;
import java.util.*;

public class Supporting_servicesApi {
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

  public SupportingServices getSupportingServices () throws ApiException {
    // create path and map variables
    String path = "/supporting_services".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (SupportingServices) ApiInvoker.deserialize(response, "", SupportingServices.class);
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
  public SupportingService getSupportingServiceById (Integer id) throws ApiException {
    // create path and map variables
    String path = "/supporting_services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (SupportingService) ApiInvoker.deserialize(response, "", SupportingService.class);
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
  public SupportingService modifySupportingServiceById (Integer id, String operation) throws ApiException {
    // create path and map variables
    String path = "/supporting_services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(id == null || operation == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (SupportingService) ApiInvoker.deserialize(response, "", SupportingService.class);
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

