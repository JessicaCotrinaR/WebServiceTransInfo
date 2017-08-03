package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.CrashConditionsModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 10/12/16.
 */
public class CrashConditions extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result insertCrashConditions(){

        try {

            CrashConditionsModel crashConditionsModel = new CrashConditionsModel();
            crashConditionsModel = formFactory.form(CrashConditionsModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            long operation = crashConditionsModel.addCrashConditions(crashConditionsModel);
            if(operation >0){
                result.put("message", "Agregado con éxito");
                result.put("NarrativaId", operation);
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
