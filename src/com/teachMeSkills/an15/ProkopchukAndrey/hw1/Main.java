package com.teachMeSkills.an15.ProkopchukAndrey.hw1;

public class Main {
    public static void main(String[] args) {
        // 1. Создать 3 целочисленные переменные и найти максимальное и минимальное значения. Вывести их в консоль.

        int Num4 = 9;


        int Num1 = 3;
        int Num2 = 6;
        int Num3 = 9;

        if (Num4 == 3){
            System.out.println("3 - Это минимальное значение");
        } else if (Num4 ==9){
            System.out.println("9 - Это максимальное значение");
        }else {
            System.out.println("Выбирите другое значение");
        }

        // Пользователь вводит число от 1 до 100. Если введенное число равно 5, 10, 17, 47, 77, 93, 99, то вывести в
        // консоль, что вы пользователь выиграл. Если введено было любое другое, то проиграл. Если было введено не из
        // заданного диапазона, вывести ошибку

        int peremen = 4;

        if (peremen ==5 || peremen ==10 ||peremen ==17 || peremen ==47 ||peremen==77 || peremen ==93 || peremen ==99) {
            System.out.println("Вы выйграли");

        } else if (peremen >4 && peremen <100) {
            System.out.println("Вы проиграли");
        } else {
            System.out.println("Error");
        }
    }
}

// переделать 1 задание через if. Где через Math?
// нет консоли во 2 задании. Доделать
