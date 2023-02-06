package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.FileUtils.createFile;

@AllArgsConstructor
public class PrintFindResult implements Question<Boolean> {
    private final Target target;

    public static PrintFindResult ofBlogs(Target target) {
        return new PrintFindResult(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> elements = target.resolveAllFor(actor);
        List<String> data = new ArrayList<>();
        for (WebElementFacade element : elements) {
            data.add(element.getText() + "\n");
        }
        try {
            createFile(data);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
