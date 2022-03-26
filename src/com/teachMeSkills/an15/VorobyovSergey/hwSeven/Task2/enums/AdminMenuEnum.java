package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.enums;

public enum AdminMenuEnum {
    END_PROGRAM(0),
    ADD_PRODUCT(1),
    DELETE_PRODUCT(2),
    EDIT_PRODUCT(3);

    int menuItemNumber;

    AdminMenuEnum(int menuItemNumber) {
        this.menuItemNumber = menuItemNumber;
    }

    public int getMenuItemNumber() {
        return menuItemNumber;
    }
}
