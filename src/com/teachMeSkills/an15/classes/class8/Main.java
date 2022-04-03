package com.teachMeSkills.an15.classes.class8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("World");
        arrayList2.add("Hello");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Hello"));
        System.out.println(arrayList.contains("hello"));
        System.out.println(arrayList.equals("Hello"));
        System.out.println(arrayList.equals(arrayList2));
        System.out.println(arrayList.indexOf("World"));
        System.out.println(arrayList.lastIndexOf("World"));
        System.out.println(arrayList.remove("Hello"));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.addAll(arrayList2));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());


        HashSet<String> hashSet = new HashSet<>();

        System.out.println(hashSet.isEmpty());

        hashSet.add("TMS");

        System.out.println(hashSet);
        System.out.println(hashSet.size());
        hashSet.add("TMS");
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.add("tms"));
        System.out.println(hashSet);
        System.out.println(hashSet.toArray());
        String[] strings = hashSet.toArray(new String[hashSet.size()]);


        // в сет кладет два объекта с разными хешкодами в процессе работы хешкоды становятся равны

        HashSet<String> strings1 = new HashSet<>();
        strings1.add("TMS");
        strings1.add("tms");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Ali");
        System.out.println(hashMap.get("1"));
        System.out.println(hashMap.isEmpty());
        hashMap.put("1", "2");
        hashMap.put("2", "2");

        System.out.println(hashMap.get("1"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey("1"));
        System.out.println(hashMap.containsValue("2"));
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.putIfAbsent("2", "5"));
        System.out.println(hashMap.putIfAbsent("3", "5"));
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.keySet());

        // hashCode    value

    }
}
