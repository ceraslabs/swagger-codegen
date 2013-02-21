package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Service;
public class Node {
  /* The id of the node */
  private Integer id = null;
  /* The link of the node */
  private String link = null;
  /* The name of the node */
  private String name = null;
  /* The pattern of the node */
  private String pattern = null;
  /* The list of services of the node */
  private List<Service> services = new ArrayList<Service>();
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

  public List<Service> getServices() {
    return services;
  }
  public void setServices(List<Service> services) {
    this.services = services;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  pattern: ").append(pattern).append("\n");
    sb.append("  services: ").append(services).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

