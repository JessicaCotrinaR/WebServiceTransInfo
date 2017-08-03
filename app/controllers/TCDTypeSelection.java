package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.TCDTypeSelectionModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 10/11/16.
 */
public class TCDTypeSelection extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result insertTCDTypeSelection(){

        try {

            TCDTypeSelectionModel tCDTypeSelectionModel = new TCDTypeSelectionModel();
            tCDTypeSelectionModel = formFactory.form(TCDTypeSelectionModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            int operation = tCDTypeSelectionModel.addTCDTypeSelection(tCDTypeSelectionModel);
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
