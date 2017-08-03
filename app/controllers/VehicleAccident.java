package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.VehicleAccidentModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 4/4/17.
 */
public class VehicleAccident extends Controller {
    @Inject
    private FormFactory formFactory;

    public Result insertVehicleAccident(){

        try {

            VehicleAccidentModel vehicleAccidentModel = new VehicleAccidentModel();
            vehicleAccidentModel = formFactory.form(VehicleAccidentModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            int operation = vehicleAccidentModel.addVehicleAccidentModel(vehicleAccidentModel);
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
