package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Container;
public class Containers {
  /* The information of the containers */
  private List<Container> all = new ArrayList<Container>();
  public List<Container> getAll() {
    return all;
  }
  public void setAll(List<Container> all) {
    this.all = all;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Containers {\n");
    sb.append("  all: ").append(all).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

