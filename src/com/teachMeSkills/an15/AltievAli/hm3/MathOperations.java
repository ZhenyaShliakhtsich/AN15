package com.teachMeSkills.an15.AltievAli.hm3;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println("Enter fist number!");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number!");
            int num2 = scanner.nextInt();
            System.out.println(stringBuilder.append("Choose one this operation" + "\n").append("(1) Plus" + "\n").append("(2) Minus" + " \n")
                    .append("(3) Multiply" + "\n").append("(4) Divide"));
            int isChoosenOperation = scanner.nextInt();

            if (isChoosenOperation == 1) {
                int plusMethod = plus(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + plusMethod);

            } else if (isChoosenOperation == 2) {

                int minusMethod = minus(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + minusMethod);
            } else if (isChoosenOperation == 3) {
                int multiplyMethod = multiply(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + multiplyMethod);

            } else if (isChoosenOperation == 4) {
                int divideMethod = divide(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + divideMethod);

            }

        }

    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }


}
