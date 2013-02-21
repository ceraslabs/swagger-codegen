package com.patterndeployer.model;

import java.util.*;
import com.patterndeployer.model.Template;
public class Templates {
  /* The information of the templates */
  private List<Template> all = new ArrayList<Template>();
  public List<Template> getAll() {
    return all;
  }
  public void setAll(List<Template> all) {
    this.all = all;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Templates {\n");
    sb.append("  all: ").append(all).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

