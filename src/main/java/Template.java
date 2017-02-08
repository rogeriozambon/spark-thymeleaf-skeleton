package com.spark.skeleton.app;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.io.StringWriter;

public class Template {
  private String templateName;
  private Context context = new Context();
  private TemplateEngine engine = new TemplateEngine();

  public Template(String templateName) {
    this.templateName = "templates/" + templateName;

    ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
    resolver.setTemplateMode("HTML5");
    resolver.setSuffix(".html");

    this.engine.setTemplateResolver(resolver);
    this.engine.clearTemplateCache();
  }

  public void setVariable(String name, Object object) {
    context.setVariable(name, object);
  }

  public String render() {
    StringWriter writer = new StringWriter();
    engine.process(this.templateName, this.context, writer);

    return writer.toString();
  }
}
