package com.teachMeSkills.an15.NovikovVadim.hw3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        1. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//        Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
//        А банк вычисляет конечную сумму вклада с учетом начисления
//        процентов за каждый месяц. Вывести в консоль конечную сумму.

        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.println("Введите сумму вклада и количество месяцев");
        double sum = scanner.nextInt();
        double sum2 = sum;
        int countMonth = scanner.nextInt();

        for (i = 0; i < countMonth; i++) {
            sum = sum + Math.round(sum * 7) / 100d;
            //System.out.println(sum);
        }
        System.out.println(String.format("Сумма вклада с учетом процентов (цикл for): %.2f", sum));

        i = 0;
        while (i < countMonth) {
            sum2 = sum2 + Math.round(sum2 * 7) / 100d;
            i++;
        }
        System.out.println(String.format("Сумма вклада с учетом процентов (цикл while): %.2f", sum2));

//        3. Пользователь вводит два числа. После этого в консоль выводятся действия,
//        которые мы можем произвести с этими числами (умножение, деление, сложение, вычитание).
//        Пользователь выбирает одно из действий. С помощью метода выполняем это действие и выводим результат в консоль.
        System.out.println("------------------------------------------");

        System.out.println("Введите два числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Введите одно из арифмитических действия: +, -, *, /");
        String str = scanner.next("[{+-/*}]");
        System.out.println("Результат: " + fAction(num1, num2, str));

//        4. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
        System.out.println("------------------------------------------");

        int min = 1;
        int max = 99;
        int sizeArray = (max - min) / 2 + (isOst(min) || isOst(max) ? 1 : 0);
        int[] array = new int[sizeArray];

        int counter = 0;
        for (i = min; i <= sizeArray; i++) {
            if (isOst(i)) {
                array[counter] = i;
                counter++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (i = 0; i < sizeArray; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        System.out.println("Прямой порядок чисел: " + stringBuilder);

        stringBuilder = new StringBuilder();
        for (i = sizeArray; i > 0; i--) {
            stringBuilder.append(array[i - 1]).append(" ");
        }
        System.out.println("Обратный порядок чисел: " + stringBuilder);
        System.out.println("------------------------------------------");
//        5. Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
//        Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке

        Random random = new Random();
        int[] arrayInt = new int[15];
        int count0 = 0;
        int count1 = 0;
        for (i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(10);
            if (isOst(i)) {
                count1++;
            } else {
                count0++;
            }
        }
        System.out.println("Массив из 15 случайных чисел " + Arrays.toString(arrayInt));
        System.out.println("Количество четных чисел: " + count0);
        System.out.println("Количество нечетных чисел: " + count1);

        System.out.println("------------------------------------------");
//        6. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
//        Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
//        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        arrayInt = new int[11];
        for (i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(-1, 2);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int y : arrayInt) {
            int z = map.getOrDefault(y, 0) + 1;
            map.put(y, z);
        }

        int maxValue = 0;
        int maxCount = 0;
        boolean isOne = true;

        for (Map.Entry y : map.entrySet()) {
            int value = (int) y.getValue();
            if (value > maxCount) {
                maxCount = value;
                maxValue = (int) y.getKey();
                isOne = true;
            } else if (value == maxCount) {
                isOne = false;
            }
        }
        System.out.println("Массив из 11 случайных чисел " + Arrays.toString(arrayInt));
        if (isOne) {
            System.out.println("Значение " + maxValue + " встречается " + maxCount);
        }
        System.out.println("------------------------------------------");

//        7. Создать программу, которая будет проверять, является ли слово из пяти букв,
////      введённое пользователем, палиндромом (примеры: «комок», «ротор»).
        System.out.println("Введите строку для провери полиндрома:  ");
        String polindrom = scanner.next();
        stringBuilder = new StringBuilder();
        String polindrom2 = stringBuilder.append(polindrom).reverse().toString();
        int flagpolindrom = polindrom.compareToIgnoreCase(polindrom2);
        System.out.println(polindrom + (flagpolindrom == 0 ? " - " : " - не ") + "полиндром");

    }

    private static boolean isOst(int t) {
        return t % 2 == 1;
    }

    private static double fAction(int num1, int num2, String str) {
        switch (str) {
            case ("*"):
                return (double) num1 * num2;
            case ("/"):
                return (double) num1 / num2;
            case ("-"):
                return (double) num1 - num2;
            case ("+"):
                return (double) num1 + num2;
            default:
                return 0d;
        }
    }


}