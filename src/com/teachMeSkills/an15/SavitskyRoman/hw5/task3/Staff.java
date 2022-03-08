package com.teachMeSkills.an15.SavitskyRoman.hw5.task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Staff {
    public static void main(String[] args) {
        Worker[] staff = new Worker[10];
        staff[0] = new Coder("Ivan", "Zero", "android developer", 25, "male",
                true, "middle");
        staff[0].setSalary(15, 20);
        staff[1] = new Security("Fedor", "First", "senior guard", 35, "male",
                false, true);
        staff[1].setSalary(10, 20);
        staff[2] = new Coder("Roman", "Second", "idler of the year", 29, "male",
                true, "junior");
        staff[2].setSalary(11, 0);
        staff[3] = new Coder("Ivan", "Third", "ios developer", 27, "male",
                true, "middle");
        staff[3].setSalary(15, 10);
        staff[4] = new Security("Viktor", "Fourth", "guard", 20, "male",
                false, false);
        staff[4].setSalary(10, 10);
        staff[5] = new Coder("Ivan", "Fifth", "android developer", 27, "male",
                false, "middle");
        staff[5].setSalary(15, 20);
        staff[6] = new Security("Andrei", "Sixth", "senior guard", 45, "male",
                false, true);
        staff[6].setSalary(10, 20);
        staff[7] = new Security("Fedor", "Seventh", "guard", 25, "male",
                true, true);
        staff[7].setSalary(10, 20);
        staff[8] = new Coder("Anna", "Eighth", "ios developer", 27, "female",
                true, "middle");
        staff[8].setSalary(15, 20);
        staff[9] = new Coder("Oleg", "Ninth", "ios developer", 28, "male",
                true, "middle");
        staff[9].setSalary(15, 10);

        // Для проверки все же выведем неотсорт. масссив.. надо было с зп поигарть, достал дабл километровый
        StringBuilder randomListOne = new StringBuilder();
        for (Worker ob : staff) {
            randomListOne.append("Имя: ").append(ob.getFirstName()).append(", hashCode: ").
                    append(ob.hashCode()).append(", зарплата: ").append(ob.getSalary()).append(" | ");
        }
        System.out.println(randomListOne);

        Worker w;
        for (int a = 1; a < staff.length; a++) {
            for (int b = staff.length - 1; b >= a; b--) {
                if (staff[b - 1].getSalary() == staff[b].getSalary()) {
                    if (staff[b - 1].getFirstName().charAt(0) > staff[b].getFirstName().charAt(0)) {
                        w = staff[b - 1];
                        staff[b - 1] = staff[b];
                        staff[b] = w;
                    }
                }
                if (staff[b - 1].getSalary() < staff[b].getSalary()) {
                    w = staff[b - 1];
                    staff[b - 1] = staff[b];
                    staff[b] = w;
                }
            }
        }

        StringBuilder randomListTwo = new StringBuilder();
        for (Worker ob : staff) {
            randomListTwo.append("Имя: ").append(ob.getFirstName()).append(", hashCode: ").
                    append(ob.hashCode()).append(", зарплата: ").append(ob.getSalary()).append(" | ");
        }
        System.out.println(randomListTwo);

        StringBuilder randomListThree = new StringBuilder();
        for (int x = 0; x < staff.length; x++) {
            if (x >= 5 && x < staff.length - 3) continue;
            randomListThree.append("Имя: ").append(staff[x].getFirstName()).append(" | ");
        }
        System.out.println(randomListThree);

        // проверяем какой полный список имен перед обнулением
        StringBuilder randomListFourth = new StringBuilder();
        for (Worker ob : staff) {
            randomListFourth.append("Имя: ").append(ob.getFirstName()).append(" | ");
        }
        System.out.println(randomListFourth);

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("staff.ser"));
            for (Worker ob : staff) {
                os.writeObject(ob);
            }
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //проверяем что массив стал null
        Arrays.fill(staff, null);
        System.out.println(Arrays.toString(staff));

        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream("staff.ser"));
            for (int x = 0; x < staff.length; x++) {
                staff[x] = (Worker) os.readObject();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //проверяем что массив стал как был
        StringBuilder randomListFifth = new StringBuilder();
        for (Worker ob : staff) {
            randomListFifth.append("Имя: ").append(ob.getFirstName()).append(" | ");
        }
        System.out.println(randomListFifth);

    }

}
