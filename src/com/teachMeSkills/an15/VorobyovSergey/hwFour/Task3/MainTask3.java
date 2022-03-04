package com.teachMeSkills.an15.VorobyovSergey.hwFour.Task3;

import com.teachMeSkills.an15.VorobyovSergey.MyClassLib.IsNumberInputChecker;

import java.math.BigInteger;

class MainTask3 {
    public static void main(String[] args) {
        IsNumberInputChecker isNumberInputChecker = new IsNumberInputChecker();
        int rowSize = isNumberInputChecker.readIntNumber("Введи размер ряда чисел Фибоначи");

        if (rowSize < 94) {
            fibonacciNumbersSmall(rowSize);
        } else {
            fibonacciNumbersBig(rowSize);
        }


    }

    static void fibonacciNumbersSmall(int maxNumber) {
        //Long отработает только наверное до 93 значения, далее будет смещение и будут отрицательные числа
        long previousNumber = 0;
        long nextNumber = 1;
        long sum;
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }

    static void fibonacciNumbersBig(int maxNumber) {
        BigInteger previousNumber = BigInteger.valueOf(0);
        BigInteger nextNumber = BigInteger.valueOf(1);
        BigInteger sum;

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            sum = previousNumber.add(nextNumber);
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
