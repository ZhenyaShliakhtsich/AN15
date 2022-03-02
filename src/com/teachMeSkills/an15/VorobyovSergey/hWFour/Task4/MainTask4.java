package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task4;
//        Разработать программу, в которой создается массив объектов данного класса.
//        Перегрузить методы takeVacation(), returnBack():
//        - takeVacation, который будет принимать количество взятых дней.
//        Выводит на консоль сообщение "Петров В. В. взял отпуск на 21 день".
//        - takeVacation, который будет принимать переменное количество названий планируемых к посещению мест.
//        Выводит на консоль сообщение "Петров В. В. взял отпуск, чтобы посетить: Грузию, Армению, Китай".
//        - takeVacation, который будет принимать переменное количество объектов класса Country
//        (создать новый класс, содержащий название и и столицу).
//        Выводит на консоль сообщение "Петров В. В. взял отпуск, чтобы посетить:
//        в Грузии - Тбилиси, Армении - Ереван, Китае - Пекин".
//        Аналогичным образом перегрузить метод returnBack().
//        Выводит на консоль сообщение "Петров В. В. вернул из отпуска." и тд.
public class MainTask4 {
    public static void main(String[] args) {
        Country ukrain = new Country("Ukrain", "Kiev");
        Country gb = new Country("GreatBritain", "London");

        Coder vasiaPupkin = new Coder("Vasia P.P.", "29.02.2000", "developer", 1000, 7788);
        vasiaPupkin.takeVacation("Angola", "Ukraine");
        vasiaPupkin.takeVacation(ukrain, gb);
        vasiaPupkin.takeVacation(21);

        vasiaPupkin.returnBack("Angola", "Ukraine");
        vasiaPupkin.returnBack(ukrain, gb);
        vasiaPupkin.returnBack(21);
    }
}
