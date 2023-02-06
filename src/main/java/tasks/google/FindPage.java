package tasks.google;


import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.GoogleHomePage;


@AllArgsConstructor
public class FindPage implements Task {
    private final String blogName;

    public static FindPage inPage(String blogName) {
        return Tasks.instrumented(FindPage.class, blogName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(blogName).into(GoogleHomePage.SEARCH_INPUT));
    }
}
