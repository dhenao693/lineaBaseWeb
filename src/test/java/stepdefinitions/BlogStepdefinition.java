package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import questions.PrintFindResult;
import questions.SeeText;
import questions.SeeUrl;
import tasks.FindBlog;
import tasks.SubscribeToTheNewsletter;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static userinterface.HomePage.LBL_SUSCRIBE_CONFIRM;
import static userinterface.HomePage.LBL_TAGLIST;
import static userinterface.HomePage.LBL_TITLE_PAGE;

public class BlogStepdefinition {


    @When("^find the blog (.*)$")
    public void findTheBlog(String blogName) {
        theActorInTheSpotlight().attemptsTo(FindBlog.inPage(blogName));
    }

    @When("^subscribe to the newsletter$")
    public void subscribeToTheNewsletter() {
        theActorInTheSpotlight().attemptsTo(SubscribeToTheNewsletter.inBlog("daniel@yopmail.com"));
    }

    @Then("^see the blog page$")
    public void seeTheBlogPage(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(seeThat(SeeUrl.onPage(), equalTo(data.get(0).get("url"))));
        theActorInTheSpotlight().should(seeThat(SeeText.on(LBL_TITLE_PAGE), equalTo(data.get(0).get("blogName"))));
    }

    @Then("^the user see the message (.*)$")
    public void theUserSeeTheConfirmMessage(String message) {
        theActorInTheSpotlight().should(seeThat(SeeText.on(LBL_SUSCRIBE_CONFIRM), equalTo(message)));
    }

    @When("^find related links$")
    public void findRelatedLinks() {
        theActorInTheSpotlight().attemptsTo(Click.on(LBL_TAGLIST));
    }

    @Then("^the user see a list of all post titles with related links$")
    public void theUserSeeAListOfAllPostTitlesWithRelatedLinks() {
        theActorInTheSpotlight().should(seeThat(PrintFindResult.ofBlogs()));
    }

}
