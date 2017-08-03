package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.ActionCollisionTimeSModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 9/29/16.
 */
public class ActionCollisionTimeS extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result insertActionCollisionTimeS(){

        try {

            ActionCollisionTimeSModel actionCollisionS = new ActionCollisionTimeSModel();
            actionCollisionS = formFactory.form(ActionCollisionTimeSModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            int operation = actionCollisionS.addActionCollisionTimeS(actionCollisionS);
            if(operation == 1){
                result.put("message", "Agregado con éxito");
                wrapper.set("success", result);
                return ok(wrapper);
            }else{
                result.put("message", "No se pudo agregar");
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
