package com.teachMeSkills.an15.VorobyovSergey.hwThree.TaskFrom4to7;

import java.util.Arrays;

//4. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
// а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
//5. Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
//6. Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
//7. Создать программу, которая будет проверять, является ли слово из пяти букв, введённое пользователем, палиндромом (примеры: «комок», «ротор»).
public class MainTask4to7 {
    public static void main(String[] args) {
        //4-task
        System.out.println("Task 4");
        Task4 task4 = new Task4();
        int[] arr = task4.oddNumberArrayCreator(99);
        task4.arrayOnDisplay(arr);
        task4.arrayOnDisplayReversed(arr);

        //5 - task
        System.out.println("\nTask 5");
        Task5 task5 = new Task5();
        task5.zeroNineGeneratorAndOddCounter(15);

        //6-task
        System.out.println("\nTask 6");
        Task6 task6 = new Task6();
        int[] randomArr = task6.randomNumberArrayCreator(11);
        System.out.println(Arrays.toString(randomArr));
        task6.mostFrequentElementInArray(randomArr);

        //6-task in one method
        System.out.println("\nTask 6 in one method");
        Task6AllinOne task6AllinOne = new Task6AllinOne();
        task6AllinOne.OnlyOneMethod();

        //7 - task
        System.out.println("\nTask 7");
        Task7 palindrome = new Task7("roror");
        System.out.println("Is your word palindrome - " + palindrome.isPalindrome());
    }
}
