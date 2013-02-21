package com.patterndeployer.model;

public class Service {
  /* The id of the service */
  private Integer id = null;
  /* The link of the service */
  private String link = null;
  /* The name of the service */
  private String name = null;
  /* The pattern of the service */
  private String pattern = null;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  pattern: ").append(pattern).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

