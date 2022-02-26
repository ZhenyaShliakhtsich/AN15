package com.teachMeSkills.an15.MatveevArtyom.hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskFrom1To7 {
    public static void main(String[] args) {
        //1. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        //Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
        //А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
        //Вывести в консоль конечную сумму.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double sumVklada = scanner.nextDouble();
        System.out.println("Введите количество месяцев: ");
        int countOfMounths = scanner.nextInt();
        if (countOfMounths == 0) countOfMounths++;
        for (int i = 1; i <= countOfMounths; i++) {
            sumVklada += sumVklada * 0.07;
        }
        System.out.println("Конечная сумма равна: " + sumVklada);

        //2. такую же но с while

        System.out.println("Введите сумму вклада: ");
        double sumVklada2 = scanner.nextDouble();
        System.out.println("Введите количество месяцев: ");
        int countOfMounths2 = scanner.nextInt();
        if (countOfMounths2 == 0) countOfMounths2++;
        while (countOfMounths2 != 0) {
            sumVklada2 += sumVklada2 * 0.07;
            countOfMounths2--;
        }
        System.out.println("Конечная сумма равна: " + sumVklada2);

        //3. Пользователь вводит два числа. После этого в консоль выводятся действия,
        //которые мы можем произвести с этими числами (умножение, деление, сложение, вычитание).
        //Пользователь выбирает одно из действий. С помощью метода выполняем это действие и выводим результат в консоль.

        System.out.println("Введите 2 числа");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Выберите действие: 1 - умножение; 2 - деление; 3 - сложение; 4 - вычитание");
        int k = scanner.nextInt();
        switch (k) {
            case 1:
                System.out.println("Умножение " + num1 + " на " + num2 + " = " + (num1 * num2));
                break;
            case 2:
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                } else {
                    System.out.println("Деление " + num1 + " на " + num2 + " = " + (num1 / num2));
                    break;
                }
            case 3:
                System.out.println("Сложение " + num1 + " на " + num2 + " = " + (num1 + num2));
                break;
            case 4:
                System.out.println("Вычитание " + num1 + " на " + num2 + " = " + (num1 - num2));
                break;
        }

        //4. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        //а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

        int[] array = new int[100];
        for (int i = 1; i <= array.length; i += 2) {
            array[i] = i;
        }
        for (int i = 1; i <= array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i > 0; i -= 2) {
            System.out.print(array[i] + " ");
        }

        //5. Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
        //Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

        System.out.println();
        int[] arr2 = new int[15];
        Random random = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0 && arr2[i] != 0) count++;
        }
        System.out.println();
        System.out.println("Кол-во чётных элементов равно: " + count);

        //6. Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
        //выведите массив на экран в строку. Определите какой элемент встречается в массиве чаще всего
        //и выведите об этом сообщение на экран.
        // Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

        int[] arr11 = new int[11];
        for (int i = 0; i < arr11.length; i++) {
            arr11[i] = -1 + random.nextInt(3);
        }

        for (int i = 0; i < arr11.length; i++) {
            System.out.print(arr11[i] + " ");
        }
        System.out.println();
        int maxCount = 0;
        int maxCount2 = 0;
        int element = 0;
        int element2 = 0;
        for (int i = 0; i < arr11.length; i++) {
            int count1 = 0;
            for (int j = 0; j < arr11.length; j++) {
                if (arr11[i] == arr11[j]) count1++;
                if (count1 > maxCount) {
                    maxCount = count1;
                    element = arr11[i];
                }
            }
        }
        first:
        {
            for (int i = 0; i < arr11.length; i++) {
                int count2 = 0;
                if (arr11[i] == element) i++;
                else if (arr11[i] != element) {
                    for (int j = 0; j < arr11.length; j++) {
                        if (arr11[i] == arr11[j]) count2++;
                        if (count2 > maxCount2) {
                            maxCount2 = count2;
                            element2 = arr11[i];
                        }
                        if (maxCount2 == maxCount) {
                            break first;
                        }
                    }
                }
            }
        }

        if (maxCount != maxCount2) {
            System.out.println("Чаще всего встречается = " + element);
        }
        else {
            System.out.println("НИЧЕГО!");
        }

        //7. Создать программу, которая будет проверять, является ли слово из пяти букв,
        // введённое пользователем, палиндромом (примеры: «комок», «ротор»).
        System.out.println("Введите слово из 5 букв: ");
        Scanner scanner1 = new Scanner(System.in);
        String string = scanner1.nextLine();
        boolean bl = true;
        int i = 0;
        int j = string.length() - 1;
        if (string.length() != 5) {
            System.out.println("Слово состоит не из 5 букв!");
        } else if (string.length() == 5) {
            while (i <= j) {
                if (string.charAt(i) != string.charAt(j)) {
                    bl = false;
                    break;
                }
                i++;
                j--;
            }
            if (bl) System.out.println("Слово является палиндромом! ");
            else System.out.println("Слово не является палиндромом! ");
        }
    }
}

