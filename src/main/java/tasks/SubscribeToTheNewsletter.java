package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.HomePage.BTN_SUBMIT;
import static userinterface.HomePage.INP_EMAIL;

public class SubscribeToTheNewsletter implements Task {
    private String email;

    public SubscribeToTheNewsletter(String email) {
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(email).into(INP_EMAIL));
        actor.attemptsTo(Click.on(BTN_SUBMIT));
    }

    public static SubscribeToTheNewsletter inBlog(String email){
        return Tasks.instrumented(SubscribeToTheNewsletter.class,email);
    }
}
