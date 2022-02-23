package com.teachMeSkills.an15.VorobyovSergey.hwOne;

import java.util.ArrayList;
import java.util.Arrays;

//2. Пользователь вводит число от 1 до 100.
// Если введенное число равно 5, 10, 17, 47, 77, 93, 99, то вывести в консоль,
// что вы пользователь выиграл. Если введено было любое другое, то проиграл.
// Если было введено не из заданного диапазона, вывести ошибку
//пользователь вводит значение через консоль
class Task2 {
    //try with bufferedreader
    public static void main(String[] args) {
        MyConsoleReader reader = new MyConsoleReader();
        int userNumber = reader.readPleas("Введи целое число от 1 до 100");

        solutionOne(userNumber);
        solutionTwo(userNumber);
    }

    //Stupid
    static void solutionOne(int number){
        System.out.println("Solution 1");
        if (number > 0 && number <= 100) {
            stupidNumberChecker(number);
        } else {
            System.out.println("Ошибка. Введенное число не в диапазоне 1 - 100");
        }
    }

    //A bit better
    static void solutionTwo(int number){
        System.out.println("\nSolution 2");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 17, 47, 77, 93, 99));

        if (number > 0 && number <= 100) {
            String result = niceNumberChecker(number, list) ? "Вы выиграли!" : "Вы проиграли";
            System.out.println(result);
        } else {
            System.out.println("Ошибка. Введенное число не в диапазоне 1 - 100");
        }

    }

    //I Know that it is stupid
    static void stupidNumberChecker(int num){
        switch (num){
            case 5:
                System.out.println("Вы выиграли!");
                break;
            case 10:
                System.out.println("Вы выиграли!");
                break;
            case 17:
                System.out.println("Вы выиграли!");
                break;
            case 47:
                System.out.println("Вы выиграли!");
                break;
            case 77:
                System.out.println("Вы выиграли!");
                break;
            case 93:
                System.out.println("Вы выиграли!");
                break;
            case 99:
                System.out.println("Вы выиграли!");
                break;
            default:
                System.out.println("Вы проиграли");
        }
    }

    //This One a littlebit better
    static boolean niceNumberChecker (int number, ArrayList<Integer> list) {
        return list.contains(number);
    }
}

// ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 17, 47, 77, 93, 99)); че это такое
//Ответ: Это класс реализующий интерфейс List который в свою очередь extends Collection<E>
//который в свою очередь extends Iterable<E>. все это относится к коллекциям -
// наборам интерфейсов и их реализации для работы со списками
//Почему ArrayList<Integer> - потому что он быстрее всего работае на перебор элементов.
//В задании нам это и нужно провернуть.
// Также у него есть реализация методов которые нам подходят для поиска number
//Поэтому его и взяли
//Может возникнуть вопрос что такое <Integer> - обобщенный параметр или дженерик и т.д.
//Если вкратце мы создаем ссылку ArrayList<Integer> list и определяем ей тип Integer
//потом создается обьект new ArrayList<>(Arrays.asList(5, 10, 17, 47, 77, 93, 99));
//в конструктор которому прилетает коллекция Arrays.asList(5, 10, 17, 47, 77, 93, 99)
//asList(5, 10, 17, 47, 77, 93, 99) -> asList(T... a) return new ArrayList<>(a);
// здесь создается ArrayList через метод asList(T... a) с переменным количество входных аргументов
//тут еще долго можно...
