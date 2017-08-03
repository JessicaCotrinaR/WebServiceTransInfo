package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.listVehicleOfPersonModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by jessicacotrina on 4/18/17.
 */
public class listVehicleOfPerson extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result listVehicleOfPerson(int para){

        //  String ps = String.valueOf(para);
        listVehicleOfPersonModel p = new listVehicleOfPersonModel();
        List<listVehicleOfPersonModel> personC = p.GetVehiclePerson(para);
        ObjectNode wrapper = Json.newObject();
        ObjectNode msg = Json.newObject();
        if(personC != null) {
            msg.set("VehicleOfPersonList", toJson(personC));
            wrapper.set("success", msg);
            return ok(wrapper);
        }else{
            msg.put("error", "There are no vehicles with the plate number");
            wrapper.set("error", msg);
            return badRequest(wrapper);
        }
    }
}
