package com.spark.skeleton.app.config;

import static spark.Spark.after;
import static spark.Spark.before;

public class HeadersConfig {
  public void init() {
    this.beforeHeaders();
    this.afterHeaders();
  }

  private void beforeHeaders() {
    before((request, response) -> {
      response.header("X-Frame-Options", "SAMEORIGIN");
      response.header("X-XSS-Protection", "1; mode=block");
      response.header("X-Content-Type-Options", "nosniff");
      response.type("text/html");
    });
  }

  private void afterHeaders() {
    after((request, response) -> {
      response.header("Content-Encoding", "gzip");
    });
  }
}
