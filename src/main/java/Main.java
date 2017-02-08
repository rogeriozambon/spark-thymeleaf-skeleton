package com.spark.skeleton.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.after;
import static spark.Spark.before;
import static spark.Spark.threadPool;

public class Main {
  public static void main(String[] args) {
    port(getPort());
    threadPool(5, 5, 30000);

    before((request, response) -> {
      response.header("X-Frame-Options", "SAMEORIGIN");
      response.header("X-XSS-Protection", "1; mode=block");
      response.header("X-Content-Type-Options", "nosniff");
      response.type("text/html");
    });

    after((request, response) -> {
      response.header("Content-Encoding", "gzip");
    });

    get("/:name", (request, response) -> {
      Template template = new Template("index");
      template.setVariable("title", "HelloWorld");
      template.setVariable("message", "Hello World, " + request.params(":name"));

      return template.render();
    });
  }

  public static int getPort() {
    ProcessBuilder processBuilder = new ProcessBuilder();

    if (processBuilder.environment().get("PORT") != null) {
      return Integer.parseInt(processBuilder.environment().get("PORT"));
    }

    return 5000;
  }
}
