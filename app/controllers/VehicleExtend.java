package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.VehicleExtendInformationModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

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
            long operation = vehicleExtendInformationModel.addVehicleExtendInformationModel(vehicleExtendInformationModel);
            if(operation > 0){
                result.put("message", "Agregado con éxito");
                result.put("IdVehicleExtend", operation);
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

    public Result VehicleExtendUpdate(){

        VehicleExtendInformationModel vehicleExtendInformationM = new VehicleExtendInformationModel();

        vehicleExtendInformationM = formFactory.form(VehicleExtendInformationModel.class).bindFromRequest().get();
        //editNarrativa.idnarrative = Integer.valueOf(session().get("idNarrative"));

        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        int result = vehicleExtendInformationM.updateVehicleExtendInformationModel(vehicleExtendInformationM);

        if(result > 0){
            msg.put("message","updated sucessfully");
            msg.put("IdVehicleExtend", result);
            wrapper.set("success", msg);
            return ok(wrapper);
        }else{
            msg.put("message","can not update");
            wrapper.set("error", msg);
            return badRequest(wrapper);
        }
    }


    public Result listVehicleExtendInformation(String newVehicleId){

        VehicleExtendInformationModel p = new VehicleExtendInformationModel();
        List<VehicleExtendInformationModel> reportC = p.vehicleExtendInformationByIdNewVehicle(newVehicleId);
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
