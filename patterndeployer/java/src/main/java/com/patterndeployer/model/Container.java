package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Node;
public class Container {
  /* The id of the container */
  private Integer id = null;
  /* The link of the container */
  private String link = null;
  /* The name of the container */
  private String name = null;
  /* The list of nodes of the container */
  private List<Node> nodes = new ArrayList<Node>();
  /* The number of copies of nodes inside the container */
  private Integer numOfCopies = null;
  /* The pattern of the container */
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

  public List<Node> getNodes() {
    return nodes;
  }
  public void setNodes(List<Node> nodes) {
    this.nodes = nodes;
  }

  public Integer getNumOfCopies() {
    return numOfCopies;
  }
  public void setNumOfCopies(Integer numOfCopies) {
    this.numOfCopies = numOfCopies;
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
    sb.append("class Container {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  nodes: ").append(nodes).append("\n");
    sb.append("  numOfCopies: ").append(numOfCopies).append("\n");
    sb.append("  pattern: ").append(pattern).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

