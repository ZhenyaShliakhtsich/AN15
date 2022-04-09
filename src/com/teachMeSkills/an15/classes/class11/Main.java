package com.teachMeSkills.an15.classes.class11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a3");
        strings.add("a2");
        strings.add("a12");

        Stream<String> stream = strings.stream();

        Stream<String> stream1 = Stream.of("a1", "a2", "a3");

        String[] strings1 = {"a1", "a2", "a3"};

        Stream<String> stream2 = Arrays.stream(strings1);
        Stream<String> stream3 = Stream.of(strings1);

//        Stream<String> stream4 = Files.lines(Paths.get("/ff"));

//        System.out.println(stream.filter("a1"::contains).count());

       System.out.println(stream.distinct().collect(Collectors.toList()));

//        System.out.println(stream.map((s -> s + "_postfix")).collect(Collectors.toList()));

    /*    System.out.println(stream.limit(4).collect(Collectors.toList()));

        System.out.println(stream.sorted().collect(Collectors.toList()));*/

//        System.out.println(stream.max(Comparator.comparingInt(String::length)).stream().collect(Collectors.toList()));

//        System.out.println(stream.findFirst().stream().collect(Collectors.toList()));

//        System.out.println(stream.findAny().stream().collect(Collectors.toList()));

      //  System.out.println(stream.filter((s -> s.contains("a"))).collect(Collectors.toList()));


//        System.out.println(stream.filter((s -> s.contains("1"))).count());



      /*  ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("1"); //0
        arrayList.add("2"); //1
        arrayList.add("3"); //2
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");



        System.out.println(arrayList.stream().skip(2).findFirst().get());
        System.out.println(arrayList.stream().skip(1).limit(2).toList());
        System.out.println(arrayList.stream().filter("5"::equals).findFirst().get());
        System.out.println(arrayList.stream().skip(arrayList.size() - 1).findFirst().get());


        ArrayList<String> strings2 = new ArrayList<>();

        System.out.println(strings2.stream().skip(arrayList.size() - 1).findFirst().orElse("100"));*/
    }
}
