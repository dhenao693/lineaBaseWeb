package tasks.google;


import interactions.Wait;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.ENTER;
import static userinterface.GoogleHomePage.FIRTS_PAGE;
import static userinterface.GoogleHomePage.SEARCH_INPUT;


@AllArgsConstructor
public class FindPage implements Task {
    private final String blogName;

    public static FindPage of(String blogName) {
        return Tasks.instrumented(FindPage.class, blogName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(blogName).into(SEARCH_INPUT),
                Enter.keyValues(ENTER).into(SEARCH_INPUT));
        actor.attemptsTo(Click.on(FIRTS_PAGE));
        Wait.forSeconds(30);
    }
}
