package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Service;
public class Services {
  /* The information of the services */
  private List<Service> all = new ArrayList<Service>();
  public List<Service> getAll() {
    return all;
  }
  public void setAll(List<Service> all) {
    this.all = all;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Services {\n");
    sb.append("  all: ").append(all).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

