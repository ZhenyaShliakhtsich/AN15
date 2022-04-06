package com.teachMeSkills.an15.VorobyovSergey.hwLast.one;

public enum SexEnum {
    MAN ("man"),
    WOMAN("woman");

    String item;

    SexEnum(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
