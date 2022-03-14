package com.teachMeSkills.an15.TuskalSergey.hw5.Task3;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class WorkerPayment {
    public static void main(String[] args) {
        int id = 0;

        Set<Workers> workers = new TreeSet<>(new Comparator<Workers>() {
            public int compare(Workers a, Workers b) {
                double diff = a.calculateAveragePayment() - b.calculateAveragePayment();
                if ( diff > 0.0 )
                    return -1;
                else if ( diff < 0.0 )
                    return 1;
                else {
                    int n = a.getName().compareTo(b.getName());
                    return ( n == 0 ) ? 1 : n;
                }
            }
        });

        workers.add(new FixPaymentWorkers(++id,"Ivan",5000));
        workers.add(new FixPaymentWorkers(++id,"John",5000));
        workers.add(new HourlyEmployees(++id,"Andrew", 70));
        workers.add(new HourlyEmployees(++id,"James", 80));
        workers.add(new FixPaymentWorkers(++id, "David", 5000));

        for (Workers w : workers)
            System.out.println(w);
    }
}
