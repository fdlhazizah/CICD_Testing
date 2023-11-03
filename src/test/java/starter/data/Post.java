package starter.data;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {
    protected String url = "https://reqres.in/api/";

    @Step("I set POST endpoints")
    public String setPostApiEndpoint(){
        return url + "users";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "morpheus");
        requestBody.put("job", "leader");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I send POST HTTP request with invalid format request body")
    public void sendPostHttpRequestInvalid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("job", "leader");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(setPostApiEndpoint());
    }
}
