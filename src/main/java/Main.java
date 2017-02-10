package com.spark.skeleton.app;

import com.spark.skeleton.app.config.*;
import com.spark.skeleton.app.routes.*;

public class Main {
  public static void main(String[] args) {
    new ServerConfig().init();
    new HeadersConfig().init();

    new HelloRoute().init();
    new ByeRoute().init();
  }
}
