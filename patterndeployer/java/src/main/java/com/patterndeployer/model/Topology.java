package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Node;
import com.patterndeployer.model.Container;
import com.patterndeployer.model.Template;
import com.patterndeployer.model.Deployment;
public class Topology {
  /* The list of containers of the topology */
  private List<Container> containers = new ArrayList<Container>();
  /* The deployment of the topology */
  private Deployment deployment = null;
  /* The description of the topology */
  private String description = null;
  /* The id of the topology */
  private Integer id = null;
  /* The link of the topology */
  private String link = null;
  /* The name of the topology */
  private String name = null;
  /* The list of nodes that is not in any containers */
  private List<Node> nodes = new ArrayList<Node>();
  /* The pattern of the topology */
  private String pattern = null;
  /* The list of templates of the topology */
  private List<Template> templates = new ArrayList<Template>();
  public List<Container> getContainers() {
    return containers;
  }
  public void setContainers(List<Container> containers) {
    this.containers = containers;
  }

  public Deployment getDeployment() {
    return deployment;
  }
  public void setDeployment(Deployment deployment) {
    this.deployment = deployment;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

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

  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public List<Template> getTemplates() {
    return templates;
  }
  public void setTemplates(List<Template> templates) {
    this.templates = templates;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topology {\n");
    sb.append("  containers: ").append(containers).append("\n");
    sb.append("  deployment: ").append(deployment).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  nodes: ").append(nodes).append("\n");
    sb.append("  pattern: ").append(pattern).append("\n");
    sb.append("  templates: ").append(templates).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

