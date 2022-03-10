package com.teachMeSkills.an15.PilyushinYuri.hw5.Workers;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Worker {
    public static void main(String[] args) {
        Set<Workers> workers = new TreeSet(new Comparator<Workers>() {
            public int compare(Workers o1, Workers o2) {
                double diff = o1.getAveragePayment() - o2.getAveragePayment();
                if (diff > 0.0)
                    return -1;
                else if (diff < 0.0)
                    return 1;
                else {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
            }
        });
            {

                workers.add(new FixPay("Sergei", "Ivanov", 10000));
                workers.add(new FixPay("Petr", "Petrov", 20000));
                workers.add(new FixPay("Ivan", "Sergeev", 30000));
                workers.add(new HourPay("Ivan", "Ivanov", 100));
                workers.add(new HourPay("Andrey", "Petrov", 150));

                for (Object w : workers) System.out.println(w.toString());
            }
        }
}



