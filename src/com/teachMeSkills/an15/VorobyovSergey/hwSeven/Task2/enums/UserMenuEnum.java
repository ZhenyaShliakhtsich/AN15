package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.enums;

public enum UserMenuEnum {
    END_PROGRAM(0),
    ADD_PRODUCT_TO_BASKET(1),
    DELETE_PRODUCT_FROM_BASKET(3),
    PAY_FOR_BASKET(2),
    RATE_PRODUCT(4),
    COMMENT_PRODUCT(5);



    int menuItemNumber;

    UserMenuEnum(int menuItemNumber) {
        this.menuItemNumber = menuItemNumber;
    }

    public int getMenuItemNumber() {
        return menuItemNumber;
    }
}
