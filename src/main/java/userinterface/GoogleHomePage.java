package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class GoogleHomePage extends PageObject {
    public static final Target SEARCH_INPUT = Target.the("Navigation button").located(By.name("q"));
    public static final Target BTN_SUBMIT = Target.the("Navigation button").located(By.id("form-newsletter-blog-submit-btn"));
    public static final Target HEADER_PAGE = Target.the("Navigation button").locatedBy("//div[@aria-label='{0}']");

}
