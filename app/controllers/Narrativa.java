package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.NarrativaModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 10/12/16.
 */
public class Narrativa extends Controller {
    @Inject
    private FormFactory formFactory;

    public Result insertNarrativa(){

        try {

            NarrativaModel narrativaModel = new NarrativaModel();
            narrativaModel = formFactory.form(NarrativaModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            long operation = narrativaModel.addNarrativa(narrativaModel);
            System.out.println("Valor de operation: " + operation);
            if(operation > 0){
                result.put("message", "Agregado con éxito");
                result.put("CrashId", operation);
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

    public Result narrativaUpdate(){

        NarrativaModel editNarrativa = new NarrativaModel();
        editNarrativa = formFactory.form(NarrativaModel.class).bindFromRequest().get();
        editNarrativa.idnarrative = Integer.valueOf(session().get("idNarrative"));

        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        int result = editNarrativa.updateNarrativa(editNarrativa);
        System.out.println("ya"+result);
        if(result == 1){
            msg.put("message","updated sucessfully");
            wrapper.set("success", msg);
            return ok(wrapper);
        }else{
            msg.put("message","can not update");
            wrapper.set("error", msg);
            return badRequest(wrapper);
        }
    }
}
