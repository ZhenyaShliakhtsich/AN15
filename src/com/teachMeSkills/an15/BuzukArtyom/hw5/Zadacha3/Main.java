package com.teachMeSkills.an15.BuzukArtyom.hw5.Zadacha3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int id = 0;
        Set<Worker> workers = new TreeSet<>(new Comparator<Worker>() {
            public int compare(Worker a, Worker b) {
                double diff = a.getAveragePayment() - b.getAveragePayment();
                if (diff > 0.0)
                    return -1;
                else if (diff < 0.0)
                    return 1;
                else {
                    return a.getFirstName().compareTo(b.getFirstName());
                }
            }
        });

        workers.add(new FixZP(1, "Sergei", "Ivanov", 10000));
        workers.add(new FixZP(2, "Ihar", "Petrov", 20000));
        workers.add(new FixZP(3, "Dima", "Sergeev", 30000));
        workers.add(new OnTimeZP(4, "Ivan", "Ivanov", 100));
        workers.add(new OnTimeZP(5, "Peter", "Petrov", 150));

        for (Worker w : workers)
            System.out.println(w);
    }
}
// id не используется