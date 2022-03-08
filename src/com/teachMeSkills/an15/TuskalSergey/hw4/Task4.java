package com.teachMeSkills.an15.TuskalSergey.hw4;

public class Task4 {

    public static void main(String[] args) {

//4. Определить класс Coder, хранящий такую информацию о программисте:
//
//ФИО,
//дата рождения,
//должность,
//зарплата,
//телефон.
//Методы takeVacation(), returnBack().
//Разработать программу, в которой создается массив объектов данного класса.
//Перегрузить методы takeVacation(), returnBack():
//- takeVacation, который будет принимать количество взятых дней.
// Выводит на консоль сообщение "Петров В. В. взял отпуск на 21 день".
//- takeVacation, который будет принимать переменное количество названий планируемых к посещению мест.
// Выводит на консоль сообщение "Петров В. В. взял отпуск, чтобы посетить: Грузию, Армению, Китай".
//- takeVacation, который будет принимать переменное количество объектов класса Country
// (создать новый класс, содержащий название и и столицу). Выводит на консоль сообщение "Петров В. В.
// взял отпуск, чтобы посетить: в Грузии - Тбилиси, Армении - Ереван, Китае - Пекин".
// Аналогичным образом перегрузить метод returnBack(). Выводит на консоль сообщение "Петров В. В.
// вернул из отпуска." и тд.
        Coder coder1 = new Coder("Петров В.В.", "01/01/2000", "программист",
                1000, 5555555);
        System.out.println(coder1);
        Coder coder2 = new Coder("Иванов И.И.", "01/01/2001", "менеджер",
                500, 4444444);
        System.out.println(coder2);
        Coder coder3 = new Coder("Сидоров С.С.", "01/01/1999", "специалист",
                800, 3333333);
        System.out.println(coder3);
        Coder[] coders = {coder1, coder2, coder3};

        Country country1 = new Country("в Грузии", "Тбилиси");
        Country country2 = new Country("в Армении", "Ереван");
        Country country3 = new Country("в Китае", "Пекин"); //че-то не правельно,
        // либо не доделано.
        Country[] countries = {country1, country2, country3};

        PlaceToVisit place1 = new PlaceToVisit("Грузию");
        PlaceToVisit place2 = new PlaceToVisit("Армению");
        PlaceToVisit place3 = new PlaceToVisit("Китай");
        PlaceToVisit[] places = {place1, place2, place3};

        for (int i = 0; i < 3; i++) {
            coders[i].takeVacation(21);
            coders[i].takeVacation(places[i]);
            coders[i].takeVacation(countries[i]);
            coders[i].returnBack();
        }
    }

}

