package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom1to2;


import com.teachMeSkills.an15.VorobyovSergey.hwThree.ReaderHw3;

//1. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//        Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
//        А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//        Вывести в консоль конечную сумму.
class MainTaskOne {
    public static void main(String[] args) {
        ReaderHw3 reader = new ReaderHw3();

        int depositValue = inputUserBankData(reader, "Введите сумму вклада");
        int depositTerm = inputUserBankData(reader, "Введите срок вклада");
        double finalDepositValueFor = depositCounterFor(depositValue, depositTerm);
        double finalDepositValueWhile = depositCounterFor(depositValue, depositTerm);

        System.out.println("DepositValue - " + depositValue);
        System.out.println("DepositTerms - " + depositTerm);
        System.out.println("FinalDepositValueFor - " + finalDepositValueFor);
        System.out.println("FinalDepositValueWhile - " + finalDepositValueWhile);
    }

    static int inputUserBankData(ReaderHw3 reader, String message) {
        return reader.readPleas(message);
    }

    static double depositCounterFor(int value, int term) {
        double depositValueWithPercents = value;
        for (int i = 1; i <= term; i++) {
            depositValueWithPercents = depositValueWithPercents * 1.07;
        }
        return depositValueWithPercents;
    }

    static double depositCounterWhile(int value, int term) {
        double depositValueWithPercents = value;
        while (term != 0) {
            term--;
            depositValueWithPercents = depositValueWithPercents * 1.07;
        }
        return depositValueWithPercents;
    }
}
