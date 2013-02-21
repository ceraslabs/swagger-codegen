package com.patterndeployer.model;

public class Database {
  /* The host of the database */
  private String host = null;
  /* The name of the server which host the database server */
  private String inServer = null;
  /* The password of the database's user */
  private String password = null;
  /* The password of the root user */
  private String rootPassword = null;
  /* The database management system */
  private String system = null;
  /* The username of the database */
  private String user = null;
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  public String getInServer() {
    return inServer;
  }
  public void setInServer(String inServer) {
    this.inServer = inServer;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String getRootPassword() {
    return rootPassword;
  }
  public void setRootPassword(String rootPassword) {
    this.rootPassword = rootPassword;
  }

  public String getSystem() {
    return system;
  }
  public void setSystem(String system) {
    this.system = system;
  }

  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Database {\n");
    sb.append("  host: ").append(host).append("\n");
    sb.append("  inServer: ").append(inServer).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  rootPassword: ").append(rootPassword).append("\n");
    sb.append("  system: ").append(system).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

