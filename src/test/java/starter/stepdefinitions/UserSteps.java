package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.data.Delete;
import starter.data.Get;
import starter.data.Post;
import starter.data.Put;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;

    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){
        get.setApiEndpoint();
      }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        get.validateHttpResponseCode200();
    }

    @Given("I set POST endpoints")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();

    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();
    }

    @Given("I set PUT endpoints")
    public void setPutEndpoint(){
        put.setPutEndpoint();
    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        delete.setDeleteEndpoint();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void validHttpResponseCode204(){
        delete.validHttpresponseCode204();
    }
}

