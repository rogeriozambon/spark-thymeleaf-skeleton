package com.spark.skeleton.app.template;

import java.io.StringWriter;

import org.thymeleaf.context.Context;
import org.thymeleaf.TemplateEngine;

public class Engine {
  private StringWriter writer;
  private TemplateEngine engine;

  public Engine() {
    this.writer = new StringWriter();
    this.engine = new TemplateEngine();
  }

  public String process(String templateName, Context context) {
    engine.setTemplateResolver(new Resolver().init());
    engine.clearTemplateCache();
    engine.process(templateName, context, this.writer);

    return this.writer.toString();
  }
}
