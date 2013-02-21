package com.patterndeployer.model;

public class Credential {
  /* The EC2 access key id */
  private String awsAccessKeyId = null;
  /* The cloud that the credential is for */
  private String forCloud = null;
  /* The id of the credential */
  private Integer id = null;
  /* The link of the credential */
  private String link = null;
  /* The name of the credential */
  private String name = null;
  /* The OpenStack endpoint */
  private String openstackEndpoint = null;
  /* The OpenStack tenant */
  private String openstackTenant = null;
  /* The OpenStack username */
  private String openstackUsername = null;
  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }
  public void setAwsAccessKeyId(String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
  }

  public String getForCloud() {
    return forCloud;
  }
  public void setForCloud(String forCloud) {
    this.forCloud = forCloud;
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

  public String getOpenstackEndpoint() {
    return openstackEndpoint;
  }
  public void setOpenstackEndpoint(String openstackEndpoint) {
    this.openstackEndpoint = openstackEndpoint;
  }

  public String getOpenstackTenant() {
    return openstackTenant;
  }
  public void setOpenstackTenant(String openstackTenant) {
    this.openstackTenant = openstackTenant;
  }

  public String getOpenstackUsername() {
    return openstackUsername;
  }
  public void setOpenstackUsername(String openstackUsername) {
    this.openstackUsername = openstackUsername;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    sb.append("  awsAccessKeyId: ").append(awsAccessKeyId).append("\n");
    sb.append("  forCloud: ").append(forCloud).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  openstackEndpoint: ").append(openstackEndpoint).append("\n");
    sb.append("  openstackTenant: ").append(openstackTenant).append("\n");
    sb.append("  openstackUsername: ").append(openstackUsername).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

