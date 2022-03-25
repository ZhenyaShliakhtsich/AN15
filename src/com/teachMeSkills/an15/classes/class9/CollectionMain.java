package com.teachMeSkills.an15.classes.class9;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        HashMap<Receipt, Receipt> receipts = new HashMap<>();

        System.out.println(new Receipt(10, "first").hashCode());
//        System.out.println(new Receipt().hashCode());

        receipts.put(new Receipt(11), new Receipt(11, "first"));

        System.out.println(receipts.get(new Receipt(11)));


        List<Receipt> receiptList = new ArrayList<>();

        receiptList.add(new Receipt(1, "1"));
        receiptList.add(new Receipt(2, "2"));
        receiptList.add(new Receipt(3, "3"));
        receiptList.add(new Receipt(4, "4"));
        receiptList.add(new Receipt(5, "5"));


//        Collections.sort(receiptList);

        //TODO: how to sort via Collections.sort()?


        HashSet<String> carNames = new HashSet<>();
        carNames.add("Audi");
        carNames.add("BMW");
        carNames.add("FORD");

        HashSet<String> duplicateCarNames = (HashSet<String>) carNames.clone();
        System.out.println(duplicateCarNames);


        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("1", "value1");

        System.out.println(hashMap.get("1"));
        hashMap.put("2", "value1");
        System.out.println(hashMap.get("1"));

        System.out.println(hashMap.entrySet());
        for (Map.Entry<String, String> set : hashMap.entrySet()) {
            if (set.getValue().equals("value1")) {
                System.out.println(set.getKey());
            }
        }

        for (String s : carNames) {
            System.out.println(s);
        }

    }

}
