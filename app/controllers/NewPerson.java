package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.NewPersonModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by jessicacotrina on 10/12/16.
 */
public class NewPerson extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result insertNewPerson(){

        try {

            NewPersonModel newPersonModel = new NewPersonModel();
            newPersonModel = formFactory.form(NewPersonModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            long operation = newPersonModel.addNewPersonModel(newPersonModel);
            if(operation > 0){
                result.put("message", "Agregado con éxito");
                result.put("NewPersonId", operation);
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

    public Result listPersonByLicencieNumber(int para){
        String ps = String.valueOf(para);
        //String ps = "2345678";
        NewPersonModel p = new NewPersonModel();
        List<NewPersonModel> personC = p.searchByLicencieNPerson(ps);
        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        if(personC != null) {
            msg.set("PersonList", toJson(personC));
            wrapper.set("success", msg);
            return ok(wrapper);
        }else{
            msg.put("error", "There are no vehicles with the plate number");
            wrapper.set("error", msg);
            return badRequest(wrapper);
        }
    }

    public Result NewPersonUpdate(){

        NewPersonModel newPersonM =  formFactory.form(NewPersonModel.class).bindFromRequest().get();
        //crashBasicInformation.idCrashBasicInformation = Integer.valueOf(session().get("idCrashBasicInformation"));


        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        int result = newPersonM.updatePersonModel(newPersonM);

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
