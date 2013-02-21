package com.patterndeployer.model;

public class Application {
  /* The name of the server which host the application */
  private String inServer = null;
  /* The name of the application */
  private String name = null;
  /* The url of the application */
  private String url = null;
  public String getInServer() {
    return inServer;
  }
  public void setInServer(String inServer) {
    this.inServer = inServer;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    sb.append("  inServer: ").append(inServer).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

