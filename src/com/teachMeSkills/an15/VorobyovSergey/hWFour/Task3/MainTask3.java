package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task3;

class MainTask3 {
    public static void main(String[] args) {
        fibonacciNumbers(5);
    }

    static void fibonacciNumbers(int maxNumber) {
        //Int Отработает только наверное до 41 значения, далее будет смещение и будут отрицательные числа
        int previousNumber = 0;
        int nextNumber = 1;
        //подобные методы стоит писать рекурсией
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
