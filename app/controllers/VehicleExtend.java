package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.VehicleExtendInformationModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by jessicacotrina on 4/6/17.
 */
public class VehicleExtend  extends Controller{
    @Inject
    private FormFactory formFactory;

    public Result insertVehicleExtend(){

        try {

            VehicleExtendInformationModel vehicleExtendInformationModel = new VehicleExtendInformationModel();
            vehicleExtendInformationModel = formFactory.form(VehicleExtendInformationModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            int operation = vehicleExtendInformationModel.addVehicleExtendInformationModel(vehicleExtendInformationModel);
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
