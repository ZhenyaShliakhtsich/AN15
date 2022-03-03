package com.teachMeSkills.an15.LashkevichGeorgy.HW4;

public class Coder {
    String fio;
    int data;
    String dolgnost;
    int zarplata;
    int phone;

    public Coder(String fio, int data, String dolgnost, int zarplata, int phone) {
        this.fio = fio;
        this.data = data;
        this.dolgnost = dolgnost;
        this.zarplata = zarplata;
        this.phone = phone;
    }

    void takeVacation(int days) {
        System.out.println(this.fio + " взял отпуск на " + days + " день");
    }

    void takeVacation(String... qwe) {
        System.out.print(this.fio + " взял отпуск, чтобы посетить: ");
        for (String abs : qwe) {
            System.out.print(abs + ", ");
        }
        System.out.println();
    }

    void takeVacation(Country... qwe) {
        System.out.print(this.fio + " взял отпуск, чтобы посетить: в ");
        for (Country com : qwe) {
            System.out.print(com + ", ");
        }
        System.out.println();
    }

    void backVacation(int days) {
        System.out.println(this.fio + " вернулся из отпуска в " + days + " день(дней)");
    }

    void backVacation(String... qwe) {
        System.out.print(this.fio + " взял отпуск и посетил: ");
        for (String abs : qwe) {
            System.out.print(abs + ", ");
        }
        System.out.println();
    }

    void backVacation(Country... qwe) {
        System.out.print(this.fio + " взял отпуск и посетил: в ");
        for (Country com : qwe) {
            System.out.print(com + ", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Coder coder1 = new Coder("Петров А.А.", 1991, "повар", 2351, 2020327);
        coder1.takeVacation("Грузия", "Italy", "Spain");
        Country country1 = new Country("Англии", "Лондон");
        Country country2 = new Country("Беларуси", "Полоцк");
        coder1.takeVacation(country1, country2);
        coder1.takeVacation(14);
        coder1.backVacation(6);
        coder1.backVacation(country1, country2);
        coder1.backVacation("Ужупис", "Одесса", "Корчи");
        Coder coder2 = new Coder("Иванов В.И.", 1966, "фумелье", 1345351, 202345327);
        Coder coder3 = new Coder("Сидоров А.Ю.", 1977, "знаъарь", 34551, 203457);
        Coder[] coders = {coder1, coder2, coder3};


    }

}

