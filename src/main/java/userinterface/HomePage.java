package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target BTN_ACCEPT = Target.the("Navigation button").located(By.xpath("//a[contains(text(),'Accept')]"));
    public static final Target BTN_MENU_OPTION = Target.the("Navigation button").locatedBy("//div[contains(@class,'desktop-nav')]/ul/li/a/span[contains(text(),'{0}')]");
    public static final Target BTN_SUBMENU_OPTION = Target.the("Navigation button").locatedBy("//div[@class='insights-pages']//p[contains(text(),'{0}')]");
    public static final Target BTN_LOAD_MORE = Target.the("Navigation button").locatedBy("//div[@class='load-more-btn-wrap']/button");
    public static final Target BTN_BLOG = Target.the("Navigation button").locatedBy("//a[text()='{0}']/parent::h2");
    public static final Target LBL_TITLE_PAGE = Target.the("Navigation button").locatedBy("//H1");

    public static final Target INP_EMAIL = Target.the("Navigation button").located(By.name("Email"));
    public static final Target BTN_SUBMIT = Target.the("Navigation button").located(By.id("form-newsletter-blog-submit-btn"));
    public static final Target LBL_SUSCRIBE_CONFIRM = Target.the("Navigation button").locatedBy("//form/div[contains(@class,'response')]");

    public static final Target LBL_TEXT_DIV = Target.the("Navigation button").locatedBy("//div[text()='{0}']");

    public static final Target LBL_TAGLIST = Target.the("Navigation button").located(By.xpath("(//div[@class='tag-list']/a)[1]"));

    public static final Target LBL_SUBTITLES = Target.the("Navigation button").located(By.xpath("//h2[contains(@class,'post-title')]"));


}
