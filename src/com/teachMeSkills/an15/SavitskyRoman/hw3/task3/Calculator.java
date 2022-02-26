package com.teachMeSkills.an15.SavitskyRoman.hw3.task3;

public class Calculator {
    double firstNumber;
    double secondNumber;
    char action;

    public Calculator(double firstNumber, double secondNumber, char action) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.action = action;
    }

    public double getResult() {
        double result = 0;
        return switch (action) {
            case ('+') -> result = firstNumber + secondNumber;
            case ('-') -> result = firstNumber - secondNumber;
            case ('*') -> result = firstNumber * secondNumber;
            case ('/') -> result = firstNumber / secondNumber;
            default -> result;
        };
    }
}
