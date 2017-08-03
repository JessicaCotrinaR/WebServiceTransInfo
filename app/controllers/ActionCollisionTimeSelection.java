package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.ActionCollisionTimeSelectionModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 9/28/16.
 */

// FIXME: El nombre ActionCollisionTimeSelection el nombre de la base 
public class ActionCollisionTimeSelection extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result insertActionCollisionTimeSelection(){

        try {
            ActionCollisionTimeSelectionModel actionCollisionTi = new ActionCollisionTimeSelectionModel();
            actionCollisionTi = formFactory.form(ActionCollisionTimeSelectionModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            int operation = actionCollisionTi.addActionCollisionTimeSelection(actionCollisionTi);
            if(operation == 1){
                result.put("message", "Agregado con éxito");
                wrapper.set("success", result);
                return ok(wrapper);
            }else{
                result.put("message", "No se pudo agregar");
                wrapper.set("error", result);
                return badRequest(wrapper);
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
            return badRequest("Error interno de operación");
        }
    }
}
