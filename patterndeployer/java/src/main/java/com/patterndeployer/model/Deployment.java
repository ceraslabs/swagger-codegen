package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Application;
import com.patterndeployer.model.Database;
import com.patterndeployer.model.Server;
public class Deployment {
  /* The list of applications that being deployed */
  private List<Application> applications = new ArrayList<Application>();
  /* The list of databases that being deployed */
  private List<Database> databases = new ArrayList<Database>();
  /* The error message of the deployment */
  private String error = null;
  /* The message of the deployment */
  private String message = null;
  /* The list of nodes that being deployed */
  private List<Server> servers = new ArrayList<Server>();
  /* The status of the deployment of topology */
  private String status = null;
  public List<Application> getApplications() {
    return applications;
  }
  public void setApplications(List<Application> applications) {
    this.applications = applications;
  }

  public List<Database> getDatabases() {
    return databases;
  }
  public void setDatabases(List<Database> databases) {
    this.databases = databases;
  }

  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  public List<Server> getServers() {
    return servers;
  }
  public void setServers(List<Server> servers) {
    this.servers = servers;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deployment {\n");
    sb.append("  applications: ").append(applications).append("\n");
    sb.append("  databases: ").append(databases).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  servers: ").append(servers).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

