package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.enums;

public enum StartMenuEnum {
    END_PROGRAM(0),
    LOG_IN(1),
    REGISTRATION(2),
    ERASE_DB(3);

    int menuItemNumber;

    StartMenuEnum(int menuItemNumber) {
        this.menuItemNumber = menuItemNumber;
    }

    public int getMenuItemNumber() {
        return menuItemNumber;
    }
}
