package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.SeeElement;
import questions.SeeText;
import questions.SeeUrl;
import tasks.google.FindPage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static userinterface.GoogleHomePage.PUBLICATION_INPUT;

public class GoogleStepDefinition {
    @When("find the page {string}")
    public void findThePage(String blogName) {
        theActorInTheSpotlight().attemptsTo(FindPage.of(blogName));
    }

    @Then("^see the page$")
    public void seeTheBlogPage(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(seeThat(SeeUrl.onPage(), equalTo(data.get(0).get("url"))));
        theActorInTheSpotlight().should(seeThat(SeeElement.of(data.get(0).get("pageInfo"))));
    }

    @Then("the user see the message {string}")
    public void theUserSeeTheConfirmMessage(String message) {
        theActorInTheSpotlight().should(seeThat(SeeText.on(PUBLICATION_INPUT), equalTo(message)));
    }

}
