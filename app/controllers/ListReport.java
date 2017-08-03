package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;
import models.ListReportModel;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.libs.Json.toJson;

/**
 * Created by jessicacotrina on 4/18/17.
 */
public class ListReport extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result listReportByAccidentDate(String para){
       // String ps = String.valueOf(para);
        //String ps = "2345678";
        ListReportModel p = new ListReportModel();
        List<ListReportModel> reportC = p.searchByDateReporAccident(para);
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
