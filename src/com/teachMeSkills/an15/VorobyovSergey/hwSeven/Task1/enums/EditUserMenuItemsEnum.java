package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.enums;

public enum EditUserMenuItemsEnum {
    TO_MAIN_MENU(0),
    EDIT_FIRST_NAME(1),
    EDIT_LAST_NAME(2),
    EDIT_EMAIL(3),
    EDIT_LOGIN(4),
    EDIT_PASSWORD(5),
    EDIT_BLOG(6);

    int menuItemNumber;

    EditUserMenuItemsEnum(int menuItemNumber) {
        this.menuItemNumber = menuItemNumber;
    }

    public int getMenuItemNumber() {
        return menuItemNumber;
    }
}
