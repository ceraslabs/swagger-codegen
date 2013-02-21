package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.UploadedFile;
public class UploadedFiles {
  /* The information of the uploaded files */
  private List<UploadedFile> all = new ArrayList<UploadedFile>();
  public List<UploadedFile> getAll() {
    return all;
  }
  public void setAll(List<UploadedFile> all) {
    this.all = all;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadedFiles {\n");
    sb.append("  all: ").append(all).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

