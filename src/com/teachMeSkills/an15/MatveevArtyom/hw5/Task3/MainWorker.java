package com.teachMeSkills.an15.MatveevArtyom.hw5.Task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWorker {
    public static void main(String[] args) {
        HourlyWorker hourlyWorker1 = new HourlyWorker("Иван иванов", 1, 20);
        HourlyWorker hourlyWorker2 = new HourlyWorker("Конев Александр", 2, 25);
        HourlyWorker hourlyWorker3 = new HourlyWorker("Чинов Алексей", 3, 15);
        FixWorker fixWorker1 = new FixWorker("Денисов Денис", 4, 800);
        FixWorker fixWorker2 = new FixWorker("Иванит Лютиков", 5, 1000);
        FixWorker fixWorker3 = new FixWorker("Аосолапов Михаил", 6, 800);
        ArrayList<Worker> list = new ArrayList<Worker>();
        list.add(hourlyWorker1);
        list.add(hourlyWorker2);
        list.add(hourlyWorker3);
        list.add(fixWorker1);
        list.add(fixWorker2);
        list.add(fixWorker3);
        System.out.println("До сортировки: ");
        for (Worker worker : list) {
            System.out.println(worker);
        }
        Comparator<Worker> sortByPayment = new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if (o2.paymentOfMonth() - o1.paymentOfMonth() != 0) {
                    return (int) (o2.paymentOfMonth() - o1.paymentOfMonth());
                } else return o1.name.compareTo(o2.name);
            }
        };
        Collections.sort(list, sortByPayment);
        System.out.println("После сортировки: ");
        for (Worker worker : list) {
            System.out.println(worker);
        }
        System.out.println("Вывод первых 5 имён работников:");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i).name);
        }
        System.out.println("Вывод последних 3 имён работников:");
        for (int i = list.size() - 1; i > list.size() - 4; i--) {
            System.out.println(list.get(i).name);
        }

        try (FileWriter writer = new FileWriter("HW5.txt")) {
            for (Worker worker : list) {
                writer.write(String.valueOf(worker));
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileReader reader = new FileReader("HW5.txt")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
