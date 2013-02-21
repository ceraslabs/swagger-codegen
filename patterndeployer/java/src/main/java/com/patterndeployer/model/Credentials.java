package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Credential;
public class Credentials {
  /* The information of the credentials */
  private List<Credential> all = new ArrayList<Credential>();
  public List<Credential> getAll() {
    return all;
  }
  public void setAll(List<Credential> all) {
    this.all = all;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credentials {\n");
    sb.append("  all: ").append(all).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

