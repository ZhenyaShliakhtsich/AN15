package com.teachMeSkills.an15.AltievAli.hm10.condition1;

import java.util.Comparator;

public enum Sex implements Comparator<Sex> {
    MAN("MAN "), WOMAN("WOMAN");
    final String getItem;

    Sex(String getItem) {
        this.getItem = getItem;
    }


    public String getGetItem() {
        return getItem;
    }

    @Override
    public int compare(Sex o1, Sex o2) {
        return o1.compareTo(o2);
    }
}
