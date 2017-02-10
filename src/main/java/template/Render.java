package com.spark.skeleton.app.template;

import java.util.HashMap;
import java.util.Collections;

import org.thymeleaf.context.Context;

public class Render {
  private Context context;
  private String templateName;

  public Render(String templateName) {
    this.context = new Context();
    this.templateName = "templates/" + templateName;
  }

  public void setVariable(String name, Object object) {
    this.context.setVariable(name, object);
  }

  public void setVariables(HashMap<String, Object> items) {
    items.forEach((name, value) -> {
      this.context.setVariable(name, value);
    });
  }

  public String render() {
    return new Engine().process(this.templateName, this.context);
  }
}
