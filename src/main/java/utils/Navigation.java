package utils;

import static utils.constants.NavigationConstants.BLOG_SUBMENU_OPTION;
import static utils.constants.NavigationConstants.INSIGHTS_MENU_OPTION;
import static utils.constants.NavigationConstants.NEWS_SUBMENU_OPTION;

public enum Navigation {
    BLOG(INSIGHTS_MENU_OPTION, BLOG_SUBMENU_OPTION),
    NEWS(INSIGHTS_MENU_OPTION, NEWS_SUBMENU_OPTION);

    private final String menuOption;
    private final String subMenuOption;

    Navigation(String menuOption, String subMenuOption) {
        this.menuOption = menuOption;
        this.subMenuOption = subMenuOption;
    }

    public String getMenuOption() {
        return this.menuOption;
    }

    public String getSubMenuOption() {
        return this.subMenuOption;
    }

}
