package starter.data;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Get {
    protected static String url = "https://reqres.in/api/";

    @Step("I set GET endpoints")
    public String setApiEndpoint(){

        return url + "users/2";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given()
                .when()
                .get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200(){

        restAssuredThat(response -> response.statusCode(200));
    }
}
