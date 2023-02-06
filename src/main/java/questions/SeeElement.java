package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.GoogleHomePage.HEADER_PAGE;

@AllArgsConstructor
public class SeeElement implements Question<Boolean> {
    private final String data;

    public static SeeElement of(String data) {
        return new SeeElement(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HEADER_PAGE.of(data).isVisibleFor(actor);
    }
}
