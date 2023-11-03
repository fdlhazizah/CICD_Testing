package starter.data;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;


public class Put {

    protected String url = "https://reqres.in/api/";

    @Step("I set PUT endpoints")
    public String setPutEndpoint(){
        return url + "users/2";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "zion resident");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(setPutEndpoint());
    }

}
