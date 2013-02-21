package com.patterndeployer.model;

import java.util.*;
public class Server {
  /* The name of the server */
  private String name = null;
  /* The IP address of the server */
  private String serverIp = null;
  /* A list of services deployed/deploying to the server */
  private List<String> services = new ArrayList<String>();
  /* The status of the server */
  private String status = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getServerIp() {
    return serverIp;
  }
  public void setServerIp(String serverIp) {
    this.serverIp = serverIp;
  }

  public List<String> getServices() {
    return services;
  }
  public void setServices(List<String> services) {
    this.services = services;
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
    sb.append("class Server {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  serverIp: ").append(serverIp).append("\n");
    sb.append("  services: ").append(services).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

