package com.spark.skeleton.app.template;

import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class Resolver {
  private ClassLoaderTemplateResolver resolver;

  public Resolver() {
    this.resolver = new ClassLoaderTemplateResolver();
  }

  public ClassLoaderTemplateResolver init() {
    resolver.setTemplateMode("HTML5");
    resolver.setSuffix(".html");

    return resolver;
  }
}
