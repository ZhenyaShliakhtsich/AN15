package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task1.enums;

public enum StartMenuItemsEnum {
    END_PROGRAM(0),
    AUTHENTICATION(1),
    AUTHORISATION(2);

    int menuItemNumber;

    StartMenuItemsEnum(int menuItemNumber) {
        this.menuItemNumber = menuItemNumber;
    }

    public int getMenuItemNumber() {
        return menuItemNumber;
    }
}
