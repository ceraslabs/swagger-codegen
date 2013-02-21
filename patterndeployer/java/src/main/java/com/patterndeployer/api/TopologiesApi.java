package com.patterndeployer.api;

import com.patterndeployer.ApiException;
import com.patterndeployer.ApiInvoker;
import java.io.File;
import com.patterndeployer.model.Node;
import com.patterndeployer.model.Nodes;
import com.patterndeployer.model.Service;
import com.patterndeployer.model.Container;
import com.patterndeployer.model.Templates;
import com.patterndeployer.model.Template;
import com.patterndeployer.model.Topology;
import com.patterndeployer.model.Topologies;
import com.patterndeployer.model.Containers;
import com.patterndeployer.model.Services;
import java.util.*;

public class TopologiesApi {
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

  public Services getServicesInTemplate (Integer topology_id, Integer template_id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates/{template_id}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "template_id" + "\\}", apiInvoker.escapeString(template_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || template_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Services) ApiInvoker.deserialize(response, "", Services.class);
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
  public Services getServicesInNode (Integer topology_id, Integer node_id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes/{node_id}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || node_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Services) ApiInvoker.deserialize(response, "", Services.class);
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
  public Services getServicesInNode (Integer topology_id, Integer container_id, Integer node_id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes/{node_id}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null || node_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Services) ApiInvoker.deserialize(response, "", Services.class);
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
  public Service createServiceInTemplate (Integer topology_id, Integer template_id, String name, String definition) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates/{template_id}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "template_id" + "\\}", apiInvoker.escapeString(template_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || template_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Service createServiceInNode (Integer topology_id, Integer node_id, String name, String definition) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes/{node_id}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || node_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Service createServiceInNode (Integer topology_id, Integer container_id, Integer node_id, String name, String definition) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes/{node_id}/services".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null || node_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Service getServiceInTemplateById (Integer topology_id, Integer template_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates/{template_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "template_id" + "\\}", apiInvoker.escapeString(template_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || template_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Service getServiceInNodeById (Integer topology_id, Integer node_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes/{node_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || node_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Service getServiceInNodeById (Integer topology_id, Integer container_id, Integer node_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes/{node_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null || node_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Services deleteServiceInTemplateById (Integer topology_id, Integer template_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates/{template_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "template_id" + "\\}", apiInvoker.escapeString(template_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || template_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Services) ApiInvoker.deserialize(response, "", Services.class);
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
  public Services deleteServiceInNodeById (Integer topology_id, Integer node_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes/{node_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || node_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Services) ApiInvoker.deserialize(response, "", Services.class);
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
  public Services deleteServiceInNodeById (Integer topology_id, Integer container_id, Integer node_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes/{node_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null || node_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Services) ApiInvoker.deserialize(response, "", Services.class);
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
  public Service modifyServiceInTemplateById (Integer topology_id, Integer template_id, Integer id, String operation, String name, String definition) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates/{template_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "template_id" + "\\}", apiInvoker.escapeString(template_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || template_id == null || id == null || operation == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Service modifyServiceInNodeById (Integer topology_id, Integer node_id, Integer id, String operation, String name, String definition) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes/{node_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || node_id == null || id == null || operation == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Service modifyServiceInNodeById (Integer topology_id, Integer container_id, Integer node_id, Integer id, String operation, String name, String definition) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes/{node_id}/services/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString())).replaceAll("\\{" + "node_id" + "\\}", apiInvoker.escapeString(node_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null || node_id == null || id == null || operation == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Service) ApiInvoker.deserialize(response, "", Service.class);
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
  public Nodes getNodes (Integer topology_id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Nodes) ApiInvoker.deserialize(response, "", Nodes.class);
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
  public Nodes getNodes (Integer topology_id, Integer container_id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Nodes) ApiInvoker.deserialize(response, "", Nodes.class);
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
  public Node createNode (Integer topology_id, String definition, String name) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Node) ApiInvoker.deserialize(response, "", Node.class);
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
  public Node createNode (Integer topology_id, Integer container_id, String definition, String name) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Node) ApiInvoker.deserialize(response, "", Node.class);
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
  public Node getNodeById (Integer topology_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Node) ApiInvoker.deserialize(response, "", Node.class);
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
  public Node getNodeById (Integer topology_id, Integer container_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Node) ApiInvoker.deserialize(response, "", Node.class);
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
  public Nodes deleteNodeById (Integer topology_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Nodes) ApiInvoker.deserialize(response, "", Nodes.class);
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
  public Nodes deleteNodeById (Integer topology_id, Integer container_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Nodes) ApiInvoker.deserialize(response, "", Nodes.class);
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
  public Node modifyNodeById (Integer topology_id, Integer id, String operation, String name, String template, String attribute_key, String attribute_value) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/nodes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null || operation == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(template)))
      queryParams.put("template", String.valueOf(template));
    if(!"null".equals(String.valueOf(attribute_key)))
      queryParams.put("attribute_key", String.valueOf(attribute_key));
    if(!"null".equals(String.valueOf(attribute_value)))
      queryParams.put("attribute_value", String.valueOf(attribute_value));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Node) ApiInvoker.deserialize(response, "", Node.class);
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
  public Node modifyNodeById (Integer topology_id, Integer container_id, Integer id, String operation, String name, String template, String attribute_key, String attribute_value) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{container_id}/nodes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "container_id" + "\\}", apiInvoker.escapeString(container_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || container_id == null || id == null || operation == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(template)))
      queryParams.put("template", String.valueOf(template));
    if(!"null".equals(String.valueOf(attribute_key)))
      queryParams.put("attribute_key", String.valueOf(attribute_key));
    if(!"null".equals(String.valueOf(attribute_value)))
      queryParams.put("attribute_value", String.valueOf(attribute_value));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Node) ApiInvoker.deserialize(response, "", Node.class);
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
  public Containers getContainers (Integer topology_id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Containers) ApiInvoker.deserialize(response, "", Containers.class);
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
  public Container createContainer (Integer topology_id, String definition, String name, Integer num_of_copies) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(num_of_copies)))
      queryParams.put("num_of_copies", String.valueOf(num_of_copies));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Container) ApiInvoker.deserialize(response, "", Container.class);
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
  public Container getContainerById (Integer topology_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Container) ApiInvoker.deserialize(response, "", Container.class);
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
  public Containers deleteContainerById (Integer topology_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Containers) ApiInvoker.deserialize(response, "", Containers.class);
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
  public Container modifyContainerById (Integer topology_id, Integer id, String operation, String name, Integer num_of_copies) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/containers/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null || operation == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(num_of_copies)))
      queryParams.put("num_of_copies", String.valueOf(num_of_copies));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Container) ApiInvoker.deserialize(response, "", Container.class);
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
  public Templates getTemplates (Integer topology_id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Templates) ApiInvoker.deserialize(response, "", Templates.class);
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
  public Template createTemplate (Integer topology_id, String definition, String name) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Template) ApiInvoker.deserialize(response, "", Template.class);
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
  public Template getTemplateById (Integer topology_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Template) ApiInvoker.deserialize(response, "", Template.class);
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
  public Templates deleteTemplateById (Integer topology_id, Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Templates) ApiInvoker.deserialize(response, "", Templates.class);
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
  public Template modifyTemplateById (Integer topology_id, Integer id, String operation, String name, String base_template, String attribute_key, String attribute_value) throws ApiException {
    // create path and map variables
    String path = "/topologies/{topology_id}/templates/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "topology_id" + "\\}", apiInvoker.escapeString(topology_id.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(topology_id == null || id == null || operation == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(operation)))
      queryParams.put("operation", String.valueOf(operation));
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(base_template)))
      queryParams.put("base_template", String.valueOf(base_template));
    if(!"null".equals(String.valueOf(attribute_key)))
      queryParams.put("attribute_key", String.valueOf(attribute_key));
    if(!"null".equals(String.valueOf(attribute_value)))
      queryParams.put("attribute_value", String.valueOf(attribute_value));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Template) ApiInvoker.deserialize(response, "", Template.class);
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
  public Topologies getTopologies () throws ApiException {
    // create path and map variables
    String path = "/topologies".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Topologies) ApiInvoker.deserialize(response, "", Topologies.class);
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
  public Topology createTopology (File file, String definition, String name, String description) throws ApiException {
    // create path and map variables
    String path = "/topologies".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, Object> bodyParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(description)))
      queryParams.put("description", String.valueOf(description));
    bodyParams.put("file", file);
    bodyParams.put("definition", definition);
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Topology) ApiInvoker.deserialize(response, "", Topology.class);
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
  public Topology getTopologyById (Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (Topology) ApiInvoker.deserialize(response, "", Topology.class);
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
  public Topologies deleteTopologyById (Integer id) throws ApiException {
    // create path and map variables
    String path = "/topologies/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (Topologies) ApiInvoker.deserialize(response, "", Topologies.class);
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
  public Topology modifyTopologyById (Integer id, String operation, String name, String description) throws ApiException {
    // create path and map variables
    String path = "/topologies/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
    if(!"null".equals(String.valueOf(name)))
      queryParams.put("name", String.valueOf(name));
    if(!"null".equals(String.valueOf(description)))
      queryParams.put("description", String.valueOf(description));
    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, bodyParams, headerParams);
      if(response != null){
        return (Topology) ApiInvoker.deserialize(response, "", Topology.class);
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

