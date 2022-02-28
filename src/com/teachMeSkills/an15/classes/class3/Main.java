package com.teachMeSkills.an15.classes.class3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        array[0] = 0;
        System.out.println(Arrays.toString(array));

        Gruppa gruppa = createGruppa();
        System.out.println(gruppa);

        for (int i = 1; i < 13; i++) {
            System.out.println(whoWerePresent(i, gruppa));
        }
    }

    private static Gruppa createGruppa() {
        Student[] students = new Student[14];
        Posechaemost[] posechaemostIvanov = new Posechaemost[12];
        posechaemostIvanov = calculateRandomPosechaemostArray();
        Posechaemost[] posechaemostsPetrov = calculateRandomPosechaemostArray();

        Student student = new Student("Ivan", "Ivanov", 19, posechaemostIvanov);
        Student student2 = new Student("Ivan1", "Petrov", 20, posechaemostsPetrov);

        students[0] = student;
        students[1] = student2;


        Gruppa gruppa = new Gruppa(students, "AN15");

        int i = Float.compare(12.5f, 12.5f);
        System.out.println("i = " + i);
        return gruppa;

    }

    private static Posechaemost[] calculateRandomPosechaemostArray() {
        Posechaemost[] posechaemosts = new Posechaemost[12];
        for (int i = 0; i < posechaemosts.length; i++) {
            posechaemosts[i] = new Posechaemost(i + 1, new Random().nextBoolean());
        }
        return posechaemosts;
    }

    private static String whoWerePresent(int numberOfClass, Gruppa gruppa) {
        Student[] students = gruppa.student;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                Posechaemost[] posechaemosts = students[i].posechaemost;
                for (int j = 0; j < posechaemosts.length; j++) {
                    if (posechaemosts[j] != null && posechaemosts[j].numberOfClass == numberOfClass && posechaemosts[j].isPresent) {
                        stringBuilder.append(students[i].firstName).append(" ").append(students[i].secondName).append(" ");
                    }
                }
            }
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("Никого не было!");
        }

        return stringBuilder.toString();
    }

    private static int calculateDiff(int num1, int num2) {
        return (num1 - num2) % 2 == 0 ? num1 - num2 : num1 - num2 - 1;
    }

    private static int calculateSum(int num1, int num2) {
        int num3 = (num1 + num2) % 2 == 0 ? num1 + num2 : num1 + num2 + 1;
        return num3;
    }


}
