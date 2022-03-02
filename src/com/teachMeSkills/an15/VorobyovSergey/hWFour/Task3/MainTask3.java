package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task3;

class MainTask3 {
    public static void main(String[] args) {
        fibonacciNumbers(5);
    }

    static void fibonacciNumbers(int maxNumber) {
        int previousNumber = 0;
        int nextNumber = 1;
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
