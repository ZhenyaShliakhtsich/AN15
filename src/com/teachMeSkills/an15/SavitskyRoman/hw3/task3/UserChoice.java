package com.teachMeSkills.an15.SavitskyRoman.hw3.task3;

import java.io.IOException;
import java.util.Scanner;

public class UserChoice {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double firstNumber = sc.nextDouble();
        System.out.println("Введите второе число:");
        double secondNumber = sc.nextDouble();
        System.out.println("Введите арифметическое дейсвтие в виде +, -, * или /");
        char action = (char) System.in.read();
        sc.close();
        Calculator calculator = new Calculator(firstNumber, secondNumber, action);
        System.out.println(calculator.getResult());
    }
}
