package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.HomePage.BTN_BLOG;
import static userinterface.HomePage.BTN_LOAD_MORE;

public class FindElement implements Interaction {
    private String blogName;
    private int count;

    public FindElement(String blogName) {
        this.blogName = blogName;
        this.count = 0;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!BTN_BLOG.of(blogName).resolveFor(actor).isPresent()){
            actor.attemptsTo(Click.on(BTN_LOAD_MORE));
        }
        actor.attemptsTo(Click.on(BTN_BLOG.of(blogName)));
    }

    public static FindElement inBlogs(String blogName){
        return Tasks.instrumented(FindElement.class,blogName);
    }
}
