package com.spark.skeleton.app.routes;

import java.util.HashMap;
import static spark.Spark.get;

import com.spark.skeleton.app.template.Render;

public class HelloRoute {
  public void init() {
    get("/hello/:name", (request, response) -> {
      Render render = new Render("hello");
      render.setVariables(new HashMap<String, Object>() {
        {
          put("title", "Hello world page");
          put("message", "Hello " + request.params(":name"));
        }
      });

      return render.render();
    });
  }
}
