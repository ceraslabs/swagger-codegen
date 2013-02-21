package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Topology;
public class Topologies {
  /* The information of the topology */
  private List<Topology> all = new ArrayList<Topology>();
  public List<Topology> getAll() {
    return all;
  }
  public void setAll(List<Topology> all) {
    this.all = all;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topologies {\n");
    sb.append("  all: ").append(all).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

