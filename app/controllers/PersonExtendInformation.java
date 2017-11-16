package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.PersonExtendInformationModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 4/5/17.
 */
public class PersonExtendInformation extends Controller {
    @Inject
    private FormFactory formFactory;

    public Result insertPersonExtendInformation(){

        try {

            PersonExtendInformationModel personExtendInformationModel = new PersonExtendInformationModel();
            personExtendInformationModel = formFactory.form(PersonExtendInformationModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            long operation = personExtendInformationModel.addPersonExtendInformationModel(personExtendInformationModel);
            if(operation > 0){
                result.put("message", "Agregado con éxito");
                result.put("IdPersonExtendInformation", operation);
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


    public Result PersonExtendInformationUpdate(){

        PersonExtendInformationModel personExtendInformationUpdate = new PersonExtendInformationModel();

        personExtendInformationUpdate = formFactory.form(PersonExtendInformationModel.class).bindFromRequest().get();
        //editNarrativa.idnarrative = Integer.valueOf(session().get("idNarrative"));

        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        int result = personExtendInformationUpdate.updatePersonExtendInformationModel(personExtendInformationUpdate);

        if(result > 0){
            msg.put("message","updated sucessfully");
            msg.put("IdNewPersonExtend", result);
            wrapper.set("success", msg);
            return ok(wrapper);
        }else{
            msg.put("message","can not update");
            wrapper.set("error", msg);
            return badRequest(wrapper);
        }
    }
}
