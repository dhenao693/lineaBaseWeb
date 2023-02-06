package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static userinterface.HomePage.LBL_SUBTITLES;
import static utils.FileUtils.createFile;

public class PrintFindResult implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> elements = LBL_SUBTITLES.resolveAllFor(actor);
        List<String> data = new ArrayList<>();
        for (WebElementFacade element:elements) {
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

    public static PrintFindResult ofBlogs(){
        return new PrintFindResult();
    }
}
