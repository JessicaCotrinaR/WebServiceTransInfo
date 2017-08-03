package controllers;

import com.google.inject.Inject;
import play.data.FormFactory;
import play.mvc.Controller;

/**
 * Created by jessicacotrina on 2/15/17.
 */
public class Login extends Controller {

    @Inject
    private FormFactory formFactory;

//    public Result insertNewPerson(){
//
//        try {
//
//            NewPersonModel newPersonModel = new NewPersonModel();
//            newPersonModel = formFactory.form(NewPersonModel.class).bindFromRequest().get();
//            ObjectNode result = Json.newObject();
//            ObjectNode wrapper = Json.newObject();
//            long operation = newPersonModel.addNewPersonModel(newPersonModel);
//            if(operation == 1){
//                result.put("message", "Agregado con éxito");
//                wrapper.set("success", result);
//                return ok(wrapper);
//            }else{
//                result.put("message", "No se pudo agregar");
//                wrapper.set("error", result);
//                return ok(wrapper);
//            }
//        }catch(Exception e){
//            System.out.println("Error: "+e.getMessage());
//            e.printStackTrace();
//            return badRequest("Error interno de operación");
//        }
//    }

}
