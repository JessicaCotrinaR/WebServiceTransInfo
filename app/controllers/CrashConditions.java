package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.CrashConditionsModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

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
                result.put("CrashConditionId", operation);
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

    public Result CrashConditionsUpdate(){

        CrashConditionsModel crashConditionsM =  formFactory.form(CrashConditionsModel.class).bindFromRequest().get();
        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        int result = crashConditionsM.updateCrashConditions(crashConditionsM);

        if(result > 0){
            msg.put("message","updated sucessfully");
            msg.put("CrashConditionId", result);
            wrapper.set("success", msg);
            return ok(wrapper);
        }else{
            msg.put("message","can not update");
            wrapper.set("error", msg);
            return badRequest(wrapper);
        }
    }


    public Result CrashConditionsByIdAccident(String idAccident){
        // String ps = String.valueOf(para);
        //String ps = "2345678";
        CrashConditionsModel p = new CrashConditionsModel();
        List<CrashConditionsModel> reportC = p.searchByIdAccident(idAccident);
        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        if(reportC != null) {
            msg.set("ReportList", toJson(reportC));
            wrapper.set("success", msg);
            return ok(wrapper);
        }else{
            msg.put("error", "There are no list report");
            wrapper.set("error", msg);
            return badRequest(wrapper);
        }
    }
}
