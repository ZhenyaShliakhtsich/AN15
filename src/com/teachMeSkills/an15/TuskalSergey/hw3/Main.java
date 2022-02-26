package com.teachMeSkills.an15.TuskalSergey.hw3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
        // в которую пользователь вводит сумму вклада и количество месяцев.
        // А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
        // Вывести в консоль конечную сумму.
        //
        //2. такую же но с while
        System.out.println("Task 1");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double depositAmount = scanner.nextDouble();
        System.out.print("Введите количество месяцев: ");
        int depositTerm = scanner.nextInt();
        double finalDepositAmount = 0;
        double depositAmount1 = depositAmount;
        for (int i = 1; i <= (depositTerm); i++) {
            finalDepositAmount = depositAmount * 1.07;
            depositAmount = finalDepositAmount;
        }
        String result = String.format("%.2f", finalDepositAmount);
        System.out.println("Конечная сумма вклада = " + result);

        System.out.println("Task 2");
        int i1 = 1;
        while (i1 <= depositTerm) {
            i1++;
            finalDepositAmount = depositAmount1 * 1.07;
            depositAmount1 = finalDepositAmount;
        }
        String result1 = String.format("%.2f", finalDepositAmount);
        System.out.println("Конечная сумма вклада = " + result1);

        //3. Пользователь вводит два числа. После этого в консоль выводятся действия, которые мы можем
        // произвести с этими числами (умножение, деление, сложение, вычитание).
        // Пользователь выбирает одно из действий. С помощью метода выполняем это действие и выводим
        // результат в консоль.
        System.out.println("Task 3");

        System.out.print("Введите 1-е число: ");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.print("Введите 2-е число: ");
        int b = scanner1.nextInt();
        System.out.print("Выберите математическое действие (1 - умножение, 2 - деление, 3 - сложение, 4 - вычитание): ");
        int c = scanner1.nextInt();
        int c1 = 0;

        while (c < 1 || c > 4) {
            System.out.print("Ошибка! Введите или 1, или 2, или 3, или 4: ");
            c = scanner1.nextInt();
            if (c >= 1 && c <= 4) {
                break;
            }
        }

        int multiplication = calculateMult(a, b);
        double division = calculateDiv(a, b);
        int addition = calculateAdd(a, b);
        int subtraction = calculateSub(a, b);

        switch (c) {
            case 1:
                System.out.println("Результат умножения = " + multiplication);
                break;
            case 2:
                System.out.println("Результат деления = " + division);
                break;
            case 3:
                System.out.println("Результат сложения = " + addition);
                break;
            case 4:
                System.out.println("Результат вычитания = " + subtraction);
                break;
        }
        //4. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        // а затем этот же массив выведите на экран тоже в строку,
        // но в обратном порядке (99 97 95 93 … 7 5 3 1).
        System.out.println("Task 4");
        int d1 = 0;
        for (int d = 1; d <= 99; d++) {
            if (d % 2 != 0) {
                d1++;
            }
        }
        int[] array = new int[d1];
        array[0] = 1;
        System.out.print(array[0]);
        for (int d = 2, d2 = 1; d <= 99; d++) {
            if (d % 2 != 0) {
                array[d2] = d;
                System.out.print(" " + array[d2]);
                d2++;
            }
        }
        System.out.println();
        System.out.print(array[array.length - 1]);
        for (int d3 = array.length - 2; d3 >= 0; d3--) {
            System.out.print(" " + array[d3]);
        }
        System.out.println();

        //5. Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
        // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной
        // строке.
        System.out.println("Task 5");
        int[] array1 = new int[15];
        int randomNumber = (int) (Math.random() * 10);
        array1[0] = randomNumber;
        System.out.print(array1[0]);
        for (int i2 = 1; i2 < 15; i2++) {
            randomNumber = (int) (Math.random() * 10);
            array1[i2] = randomNumber;
            System.out.print(" " + randomNumber);
        }
        System.out.println("");
        int b1 = 0;
        for (int i2 = 0; i2 < 15; i2++) {
            if (array1[i2] % 2 == 0) {
                b1++;
            }
        }
        System.out.println("Количество четных элементов = " + b1);

        //6. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран
        // в строку. Определите какой элемент встречается в массиве чаще всего и выведите об этом
        // сообщение на экран. Если два каких-то элемента встречаются одинаковое количество раз,
        // то не выводите ничего.
        System.out.println("Task 6");
        int[] array2 = new int[11];
        int randomNumber2 = (int) (Math.random() * 3) - 1;
        array2[0] = randomNumber2;
        System.out.print(array2[0]);
        for (int i2 = 1; i2 < 11; i2++) {
            randomNumber2 = (int) (Math.random() * 3) - 1;
            array2[i2] = randomNumber2;
            System.out.print(" " + randomNumber2);
        }
        System.out.println();
        int z1 = 0; // 1
        int z2 = 0; // 0
        int z3 = 0; // -1

        for (int i = 0; i < 11; i++) {
            switch (array2[i]) {
                case 1:
                    z1++;
                    break;
                case 0:
                    z2++;
                    break;
                case -1:
                    z3++;
                    break;
            }
        }
        if (z1 == z2 && z1 > z3 || z1 == z3 && z1 > z2 || z2 == z3 && z2 > z1) {
            System.out.println("Ничего не выводится");
        } else {
            {
                if (z1 > z2) {
                    if (z1 > z3) {
                        System.out.println("Наиболее часто встречается элемент 1");
                    }
                } else {
                    if (z2 > z3) {
                        System.out.println("Наиболее часто встречается элемент 0");
                    } else System.out.println("Наиболее часто встречается элемент -1");
                }
            }
        }
        //7. Создать программу, которая будет проверять, является ли слово из пяти букв,
        // введённое пользователем, палиндромом (примеры: «комок», «ротор»).
        System.out.println("Task 7");
        System.out.print("Введите слово из 5 букв: ");
        Scanner scanner3 = new Scanner(System.in);
        String word = scanner3.nextLine();
        while (word.length() != 5) {
            System.out.print("Ошибка! Слово должно состоять из 5 букв. Введите слово еще раз: ");
            word = scanner3.nextLine();
        }
        String reversedWord = new StringBuffer(word).reverse().toString();
        boolean palindrome = word.equals(reversedWord);
        if (palindrome == true) {
            System.out.println("Cлово " + word + " является палиндромом");
        } else System.out.println("Cлово " + word + " не является палиндромом");

    }

    private static int calculateSub(int a, int b) {
        int subtraction = a - b;
        return subtraction;
    }

    private static int calculateAdd(int a, int b) {
        int addition = a + b;
        return addition;
    }

    private static double calculateDiv(double a, double b) {
        double division = a / b;
        return division;

    }

    private static int calculateMult(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }
}
