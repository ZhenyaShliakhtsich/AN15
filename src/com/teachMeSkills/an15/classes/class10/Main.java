package com.teachMeSkills.an15.classes.class10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String string = null;
        if ("1".equals(string)) {
            System.out.println("1");
        }

        String str = "1002";
        double a = 10.33121;
        double b = 122.344;
        if (Double.compare(a, b) > 0) {
            System.out.println(a);
        }

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");

        System.out.println(isNullOrEmpty(Collections.singleton(strings)));

    }

    public static boolean isNullOrEmpty(Collection<Object> collection) {
        return collection == null || collection.isEmpty();
    }
}
