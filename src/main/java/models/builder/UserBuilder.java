package models.builder;

import models.UserData;


public class UserBuilder {
    public static UserData createUserDefault() {
        return UserData.builder().name("Daniel").lastName("Henao").cardNumber("1234567890").email("daniel@yopmail.com").build();
    }
}
