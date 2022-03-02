package com.teachMeSkills.an15.NovikovVadim.hw4;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws ExceptionCar {

        System.out.println("Задача об автомобилях");
        showCars();

        System.out.println("\nПроверка пароля");
        signIn();

        System.out.println("\nЧисла Фибоначи:");
        int counter = 1;
        fibonachi(counter, new BigInteger("0"), new BigInteger("1"));

        System.out.println("\nПутешествия:");
        vacation();
    }

    /*
    4. Определить класс Coder, хранящий такую информацию о программисте:

    ФИО,
    дата рождения,
    должность,
    зарплата,
    телефон.
    Методы takeBook takeVacation(), returnBack().
    Разработать программу, в которой создается массив объектов данного класса.
    Перегрузить методы takeVacation(), returnBack():
    - takeVacation, который будет принимать количество взятых дней.
    Выводит на консоль сообщение "Петров В. В. взял отпуск на 21 день".
    - takeVacation, который будет принимать переменное количество названий планируемых к посещению мест.
    Выводит на консоль сообщение "Петров В. В. взял отпуск, чтобы посетить: Грузию, Армению, Китай".
    - takeVacation, который будет принимать переменное количество объектов класса Country (создать новый класс, содержащий название и и столицу).
    Выводит на консоль сообщение "Петров В. В. взял отпуск, чтобы посетить: в Грузии - Тбилиси, Армении - Ереван, Китае - Пекин".
    Аналогичным образом перегрузить метод returnBack(). Выводит на консоль сообщение "Петров В. В. вернул из отпуска." и тд.
*/
    private static void vacation() {
        Country[] countries = new Country[5];

        countries[0] = new Country("США", "Нью-Йорк");

        countries[1] = new Country("Япония", "Токио");

        countries[2] = new Country();
        countries[2].setCountry("Китай");
        countries[2].setCapital("Пхеньян");

        countries[3] = new Country();
        countries[3].setCountry("Испания");
        countries[3].setCapital("Мадрид");

        countries[4] = new Country();
        countries[4].setCountry("Италия");
        countries[4].setCapital("Милан");

        Coder coder = new Coder("Алёша", new Date(121212), "HR", 1000, "8(029)331-23-45-67");
        System.out.println(coder.takeVacation(1));
        System.out.println(coder.returnBack(1));
        System.out.println(coder.takeVacation(2));
        System.out.println(coder.returnBack(2));
        System.out.println(coder.takeVacation(10));
        System.out.println(coder.returnBack(10));

        System.out.println(coder.takeVacation(countries));
        System.out.println(coder.returnBack(countries));

        String[] strCountries = new String[]{"Ереван", "Нур-Султан"};
        System.out.println(coder.takeVacation(strCountries));
        System.out.println(coder.returnBack(strCountries));
    }

    private static void fibonachi(int counter, BigInteger s1, BigInteger s2) {
        BigInteger result = s1.add(s2);
        if (counter <= 100) {
            System.out.println(counter++ + " " + result);
            fibonachi(counter, s2, result);
        } else {
            return;
        }
    }

    /*2. Создать статический метод который принимает на вход три параметра:
  login, password и confirmPassword.
  Login должен содержать только латинские буквы, цифры и знак подчеркивания.
  Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
  необходимо выбросить WrongLoginException.
  Password должен содержать только латинские буквы, цифры и знак подчеркивания.
  Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
  Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
  WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
  – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
  Обработка исключений проводится внутри метода.
  Используем multi-catch block.
  Метод возвращает true, если значения верны или false в другом случае.
  */
    private static void signIn() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин (символы латинского языка, числа и _):");
        String login = scanner.nextLine();
        System.out.println("Введите пароль (символы латинского языка, числа и _):");
        String password = scanner.nextLine();
        System.out.println("Подтвердите пароль (символы латинского языка, числа и _):");
        String confirmPassword = scanner.nextLine();

        if (checkLogin(login, password, confirmPassword)) {
            System.out.println("Значения верные");
        } else {
            System.out.println("Неверные значения");
        }
    }

    private static boolean checkPattern(String text, String pattern) {
        Matcher matcher = Pattern.compile(pattern).matcher(text);
        boolean flag = (matcher.find());
        return flag;
    }

    private static boolean checkLogin(String login, String password, String confirmPassword) {
        //Проверка на то, что в строке есть и латинские буквы, и нижнее подчеркивание, и числа
        try {
            if (!(checkPattern(login, "\\d") && checkPattern(login, "[_]") && checkPattern(login, "[a-zA-Z]"))) {
                throw new WrongLoginException("\nНекорректный логин");
            }
            if (!(checkPattern(password, "\\d") && checkPattern(password, "[_]") && checkPattern(password, "[a-zA-Z]"))) {
                throw new WrongPasswordException("\nНекорректный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("\nНе верно введено подтверждение пароля");
            }

        } catch (WrongLoginException e) {
            return false;
        } catch (WrongPasswordException e) {
            return false;
        }

        return true;
    }

    /*1. Создать собственное исключение
            - Создать класс Car c полями (марка, скорость, цена), конструкторы (с
            параметрами и default).
    Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
    генерируете случайное число от 0 до 20, если полученное число оказалось
    четным, то выбрасываете созданное ранее вами исключение и передаете его к
    месту откуда вызывали метод старт. Если все хорошо и исключение не
    вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
    завелся.
            В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете
    исключение которое может вылететь при старте автомобиля
    */
    private static void showCars() {

        int i;
        String[] brands = new String[]{"audi", "bmw", "vw", "volvo"};
        Car[] cars = new Car[brands.length];
        Random random = new Random();
        for (i = 0; i < brands.length; i++) {
            cars[i] = new Car(brands[i]);
            cars[i].cost = random.nextInt(40000, 150000);
            cars[i].speed = random.nextInt(19, 35) * 10; //кратность макс скорости обычно равно 10ти
        }

        System.out.println(Arrays.toString(cars));

        for (Car iter : cars) {
            try {
                if (iter.start(iter.getBrand())) {
                    System.out.format("\nАвтомобиль марки %s завелся", iter.getBrand());
                }
            } catch (ExceptionCar e) {
            }
        }
    }
}
