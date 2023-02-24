package questions.hexacta;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

@AllArgsConstructor
public class ValidateText implements Question<Boolean> {
    private final String text;

    public static ValidateText inScreen(String text) {
        return new ValidateText(text);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }
}
