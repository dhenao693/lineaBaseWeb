package utils;

import static utils.Navigation.BLOG;
import static utils.Navigation.NEWS;

public class MenuOptionUtils {

    public static Navigation selectOption(String submenuOption){
        switch (submenuOption.toUpperCase()){
            case "BLOG":
                return BLOG;
            case "NEWS":
                return NEWS;
            default:
                throw new IllegalStateException("Unexpected value: " + submenuOption);
        }
    }
}
