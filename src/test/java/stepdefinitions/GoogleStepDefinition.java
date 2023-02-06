package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.SeeElement;
import questions.SeeUrl;
import tasks.FindBlog;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class GoogleStepDefinition {
    @When("find the page {string}")
    public void findThePage(String blogName) {
        theActorInTheSpotlight().attemptsTo(FindBlog.inPage(blogName));
    }

    @Then("^see the page$")
    public void seeTheBlogPage(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(seeThat(SeeUrl.onPage(), equalTo(data.get(0).get("url"))));
        theActorInTheSpotlight().should(seeThat(SeeElement.of(data.get(0).get("blogName"))));
    }
}
