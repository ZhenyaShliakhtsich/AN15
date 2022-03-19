package com.teachMeSkills.an15.VorobyovSergey.hwSeven.enums;

public enum MainMenuItemsEnum {
    END_PROGRAM(0),
    SHOW_USER_ACCOUNT(1),
    EDIT_USER_ACCOUNT(2),
    ADD_POST(3),
    SHOW_POSTS(4);

    int menuItemNumber;

    MainMenuItemsEnum(int menuItemNumber) {
        this.menuItemNumber = menuItemNumber;
    }

    public int getMenuItemNumber() {
        return menuItemNumber;
    }
}
