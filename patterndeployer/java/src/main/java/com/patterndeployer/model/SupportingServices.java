package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.SupportingService;
public class SupportingServices {
  /* The information of the supporting services */
  private List<SupportingService> all = new ArrayList<SupportingService>();
  public List<SupportingService> getAll() {
    return all;
  }
  public void setAll(List<SupportingService> all) {
    this.all = all;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportingServices {\n");
    sb.append("  all: ").append(all).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

