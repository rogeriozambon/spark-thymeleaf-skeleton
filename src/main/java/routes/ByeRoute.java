package com.spark.skeleton.app.routes;

import com.spark.skeleton.app.template.Render;
import static spark.Spark.get;

public class ByeRoute {
  public void init() {
    get("/bye/:name", (request, response) -> {
      Render render = new Render("bye");
      render.setVariable("title", "Bye bye page");
      render.setVariable("message", "Bye " + request.params(":name"));

      return render.render();
    });
  }
}
