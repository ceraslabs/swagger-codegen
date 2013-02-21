package com.patterndeployer.model;

public class SupportingService {
  /* The availability of the supporting service */
  private Boolean available = null;
  /* The error message about deployment */
  private String deploymentError = null;
  /* The message about deployment */
  private String deploymentMessage = null;
  /* The deployment status of the supporting service */
  private String deploymentStatus = null;
  /* The id of the supporting service */
  private Integer id = null;
  /* The link of the supporting service */
  private String link = null;
  /* The name of the supporting service */
  private String name = null;
  public Boolean getAvailable() {
    return available;
  }
  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public String getDeploymentError() {
    return deploymentError;
  }
  public void setDeploymentError(String deploymentError) {
    this.deploymentError = deploymentError;
  }

  public String getDeploymentMessage() {
    return deploymentMessage;
  }
  public void setDeploymentMessage(String deploymentMessage) {
    this.deploymentMessage = deploymentMessage;
  }

  public String getDeploymentStatus() {
    return deploymentStatus;
  }
  public void setDeploymentStatus(String deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
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

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportingService {\n");
    sb.append("  available: ").append(available).append("\n");
    sb.append("  deploymentError: ").append(deploymentError).append("\n");
    sb.append("  deploymentMessage: ").append(deploymentMessage).append("\n");
    sb.append("  deploymentStatus: ").append(deploymentStatus).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

