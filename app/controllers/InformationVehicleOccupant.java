package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.InformationVehicleOccupantModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 10/12/16.
 */
public class InformationVehicleOccupant extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result insertInformationVehicleOccupant(){

        try {

            InformationVehicleOccupantModel informationVehicleOccupantModel = new InformationVehicleOccupantModel();
            informationVehicleOccupantModel = formFactory.form(InformationVehicleOccupantModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            int operation = informationVehicleOccupantModel.addInformationVehicleOccupantModel(informationVehicleOccupantModel);
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
