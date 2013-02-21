package com.patterndeployer.api;

import com.patterndeployer.ApiException;
import com.patterndeployer.ApiInvoker;
import java.io.File;
import com.patterndeployer.model.UploadedFile;
import com.patterndeployer.model.UploadedFiles;
import java.util.*;

public class Uploaded_filesApi {
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

  public UploadedFiles getFiles () throws ApiException {
    // create path and map variables
    String path = "/uploaded_files".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (UploadedFiles) ApiInvoker.deserialize(response, "", UploadedFiles.class);
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
  public UploadedFile createFile (File file, String file_type, String file_name, String key_pair_id, String for_cloud) throws ApiException {
    // create path and map variables
    String path = "/uploaded_files".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(file == null || file_type == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(file_type)))
      queryParams.put("file_type", String.valueOf(file_type));
    if(!"null".equals(String.valueOf(file_name)))
      queryParams.put("file_name", String.valueOf(file_name));
    if(!"null".equals(String.valueOf(key_pair_id)))
      queryParams.put("key_pair_id", String.valueOf(key_pair_id));
    if(!"null".equals(String.valueOf(for_cloud)))
      queryParams.put("for_cloud", String.valueOf(for_cloud));
    bodyParams.put("file", file);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (UploadedFile) ApiInvoker.deserialize(response, "", UploadedFile.class);
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
  public UploadedFile getFileById (Integer id) throws ApiException {
    // create path and map variables
    String path = "/uploaded_files/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (UploadedFile) ApiInvoker.deserialize(response, "", UploadedFile.class);
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
  public UploadedFiles deleteFileById (Integer id) throws ApiException {
    // create path and map variables
    String path = "/uploaded_files/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (UploadedFiles) ApiInvoker.deserialize(response, "", UploadedFiles.class);
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
  public UploadedFile modifyFileById (Integer id, String operation, File file, String file_name) throws ApiException {
    // create path and map variables
    String path = "/uploaded_files/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
    if(!"null".equals(String.valueOf(file_name)))
      queryParams.put("file_name", String.valueOf(file_name));
    bodyParams.put("file", file);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (UploadedFile) ApiInvoker.deserialize(response, "", UploadedFile.class);
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

