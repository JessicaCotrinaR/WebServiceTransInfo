package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.Person;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Inject
    private FormFactory formFactory;


    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file m eans that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok("Your new application is ready.");
    }


    public Result storePerson(){

        try {
            Person person = new Person();
            person = formFactory.form(Person.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            int operation = person.addPerson(person);
            if(operation == 1){
                result.put("message", "Agregado con éxito");
                wrapper.set("success", result);
                return ok(wrapper);
            }else{
                result.put("message", "No se pudo agregar la persona");
                wrapper.set("error", result);
                return ok(wrapper);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
            return badRequest("Error interno de operación");
        }
    }
}
