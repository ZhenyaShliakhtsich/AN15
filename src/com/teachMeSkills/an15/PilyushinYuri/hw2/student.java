package com.teachMeSkills.an15.PilyushinYuri.hw2;


public class student {
    String name;
    String surname;
    String exam;
    int mark;

    student(String name, String surname, String exam, int mark) {
        this.name = name;
        this.surname = surname;
        this.exam = exam;
        this.mark = mark;

    }

    @Override
    public String toString() {
        return "Студент " +
                name +
                " " + surname +
                ", сдал экзамен по " + exam +
                " на " + mark + '.';

    }

    public static void main (String[] args) {
        student student = new student("Иван", "Иванов", "Экономике", 4);
        System.out.println(student);
        student student1 = new student("Юрий", "Пилюшин", "Информатике", 7);
        System.out.println(student1);
        student student2 = new student("Артем", "Сидоров", "Политологии", 8);
        System.out.println(student2);
        student student3 = new student("Федор", "Федоров", "Истории", 9);
        System.out.println(student3);
        student student4 = new student("Петр", "Петров", "Физике", 4);
        System.out.println(student4);
        student student5 = new student("Максим", "Максимов", "Химии", 6);
        System.out.println(student5);
        student student6 = new student("Вячеслав", "Подберезский", "Георгафии", 9);
        System.out.println(student6);
        student student7 = new student("Юрий", "Якимович", "Инженерной Графике", 7);
        System.out.println(student7);
        student student8 = new student("Сергей", "Чистопьян", "Физкультуре", 10);
        System.out.println(student8);
        student student9 = new student("Василий", "Васильев", "Философии", 7);
        System.out.println(student9);
        student student10 = new student("Андрей", "Левченко", "Праву и государству", 5);
        System.out.println(student10);
    }
}

