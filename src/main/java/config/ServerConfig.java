package com.spark.skeleton.app.config;

import java.lang.ProcessBuilder;

import static spark.Spark.port;
import static spark.Spark.threadPool;

public class ServerConfig {
  private ProcessBuilder processBuilder;

  public ServerConfig() {
    this.processBuilder = new ProcessBuilder();
  }

  public void init() {
    port(this.getPort());
    threadPool(5, 5, 30000);
  }

  private int getPort() {
    if (processBuilder.environment().get("PORT") != null) {
      return Integer.parseInt(processBuilder.environment().get("PORT"));
    }

    return 5000;
  }
}
