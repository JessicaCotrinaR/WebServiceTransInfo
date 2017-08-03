package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.NewVehicleModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by jessicacotrina on 10/12/16.
 */
public class NewVehicle extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result insertNewVehicle(){

        try {

            NewVehicleModel newVehicleModel = new NewVehicleModel();
            newVehicleModel = formFactory.form(NewVehicleModel.class).bindFromRequest().get();
            ObjectNode result = Json.newObject();
            ObjectNode wrapper = Json.newObject();
            long operation = newVehicleModel.addNewVehicleModel(newVehicleModel);
            if(operation > 0){
                result.put("message", "Agregado con éxito");
                result.put("NewVehicleId", operation);
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

    //BUSQUEDA

    public Result listVehicleByPlateNumber(int para){
        String p = String.valueOf(para);
        NewVehicleModel v = new NewVehicleModel();
        List<NewVehicleModel> vehiclesC = v.searchByPlateVehicle(p);
        //List<NewVehicleModel> vehiclesC = v.searchByPlateVehicle("plateNumber");
        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        //comentado
        if(vehiclesC != null) {
            msg.set("VehicleList", toJson(vehiclesC));
            wrapper.set("success", msg);
            return ok(wrapper);
        }else{
            msg.put("error", "There are no vehicles with the plate number");
            wrapper.set("error", msg);
            return badRequest(wrapper);
        }
    }

}

