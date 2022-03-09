package com.teachMeSkills.an15.TuskalSergey.hw5.Task3;


public class Main {
    public static void main(String[] args) {
        Workers w1 = new FixPaymentWorkers(1, "Alex", 8000);
        Workers w2 = new FixPaymentWorkers(2, "Ivan", 7000);
        Workers w3 = new HourlyEmployees(3, "John", 50);
        Workers w4 = new HourlyEmployees(4, "Jack", 60);
        Workers w5 = new FixPaymentWorkers(5, "David", 7500);
        Workers w6 = new HourlyEmployees(6, "James", 70);

        Workers[] workers = {w1, w2, w3, w4, w5, w6};

        Double[] averagePayments = new Double[workers.length];

        for (int i = 0; i < workers.length; i++) {
            averagePayments[i] = workers[i].calculateAveragePayment();
            System.out.print(averagePayments[i] + ", ");
        }

        for (int i = 0; i < workers.length; i++) {
            System.out.println("ID = " + workers[i].id + ", имя = " + workers[i].name + ", средняя з/п = "
                    + averagePayments[i]);
        }
        // не сделал сортировку
    }
}
