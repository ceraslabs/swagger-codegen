package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Node;
public class Nodes {
  /* The information of the nodes */
  private List<Node> all = new ArrayList<Node>();
  public List<Node> getAll() {
    return all;
  }
  public void setAll(List<Node> all) {
    this.all = all;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nodes {\n");
    sb.append("  all: ").append(all).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

