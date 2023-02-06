package questions;

import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class SeeText implements Question<String> {
    private Target target;

    public SeeText(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Wait.forSeconds(3));
        return Text.of(target).answeredBy(actor);
    }

    public static SeeText on(Target target){
        return new SeeText(target);
    }
}
