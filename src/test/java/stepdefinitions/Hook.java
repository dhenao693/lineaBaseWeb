package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import userinterface.HomePage;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static utils.constants.ActorConstans.ACTOR_DEFAULT;

public class Hook {

    @Before
    public static void inicializar(){
        setTheStage(new OnlineCast());
        theActor(ACTOR_DEFAULT);
    }

    @Given("the {string} stay in page")
    public void queDanielSeEncuentraEnLaPaginaDeAvianca(String actor) throws InterruptedException {
        theActor(actor).attemptsTo(Open.browserOn(new HomePage()));
    }
}
