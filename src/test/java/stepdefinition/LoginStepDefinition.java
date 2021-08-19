package stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.LoginQuestion;
import tasks.LoginTask;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinition {
    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^the user opens the web page$")
    public void theUserOpensTheWebPage() {
        theActorCalled("user").attemptsTo(Open.url("https://www.demoblaze.com/"));

    }

    @When("^insert credentials$")
    public void insertCredentials(List<String> data) {
        theActorInTheSpotlight().attemptsTo(LoginTask.loginSuccessFul(data));
    }

    @Then("^visualize the home of the page web$")
    public void visualizeTheHomeOfThePageWeb() {
        theActorInTheSpotlight().should(seeThat(LoginQuestion.ThisPresentTheElement()));
    }

}
