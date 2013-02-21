package com.patterndeployer.model;

public class UploadedFile {
  /* The name of the uploaded file */
  private String fileName = null;
  /* The type of the uploaded file */
  private String fileType = null;
  /* The cloud that the identity file belongs to */
  private String forCloud = null;
  /* The id of the uploaded file */
  private Integer id = null;
  /* The key pair id of the identity file */
  private String keyPairId = null;
  /* The link of the uploaded file */
  private String link = null;
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
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

  public String getKeyPairId() {
    return keyPairId;
  }
  public void setKeyPairId(String keyPairId) {
    this.keyPairId = keyPairId;
  }

  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedFile {\n");
    sb.append("  fileName: ").append(fileName).append("\n");
    sb.append("  fileType: ").append(fileType).append("\n");
    sb.append("  forCloud: ").append(forCloud).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  keyPairId: ").append(keyPairId).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

