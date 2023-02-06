package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.conditions.Check;
import utils.Navigation;

import static userinterface.HomePage.BTN_ACCEPT;
import static userinterface.HomePage.BTN_MENU_OPTION;
import static userinterface.HomePage.BTN_SUBMENU_OPTION;
import static utils.MenuOptionUtils.selectOption;

public class Navigate implements Interaction {
    public Navigation submenuOption;

    public Navigate(String submenuOption) {
        this.submenuOption = selectOption(submenuOption);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(BTN_ACCEPT.resolveFor(actor).isPresent()).andIfSo(Click.on(BTN_ACCEPT)));
        actor.attemptsTo(MoveMouse.to(BTN_MENU_OPTION.of(submenuOption.getMenuOption())),
                Check.whether((!submenuOption.getSubMenuOption().isEmpty())
                                && (submenuOption.getSubMenuOption()!=null))
                .andIfSo(Click.on(BTN_SUBMENU_OPTION.of(submenuOption.getSubMenuOption()))));
    }


    public static Navigate to(String submenuOption){
        return Tasks.instrumented(Navigate.class, submenuOption);
    }
}
