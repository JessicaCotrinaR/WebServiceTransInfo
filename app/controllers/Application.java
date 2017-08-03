package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

/**
 * Created by jessicacotrina on 9/27/16.
 */
public class Application extends Controller {

    public  Result index() {
        return ok(index.render("Your new application is ready."));
    }
}
