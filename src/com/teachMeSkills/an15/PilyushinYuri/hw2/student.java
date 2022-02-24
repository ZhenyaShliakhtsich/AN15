package com.teachMeSkills.an15.ProkopchukAndrey.hw1;


import com.teachMeSkills.an15.PilyushinYuri.hw2.loops;public class student {
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

    public static void main(String[] args) {
        loops.student student = new loops.student("Иван", "Иванов", "Экономике", 4);
        System.out.println(student);
        loops.student student1 = new loops.student("Юрий", "Пилюшин", "Информатике", 7);
        System.out.println(student1);
        loops.student student2 = new loops.student("Артем", "Сидоров", "Политологии", 8);
        System.out.println(student2);
        loops.student student3 = new loops.student("Федор", "Федоров", "Истории", 9);
        System.out.println(student3);
        loops.student student4 = new loops.student("Петр", "Петров", "Физике", 4);
        System.out.println(student4);
        loops.student student5 = new loops.student("Максим", "Максимов", "Химии", 6);
        System.out.println(student5);
        loops.student student6 = new loops.student("Вячеслав", "Подберезский", "Георгафии", 9);
        System.out.println(student6);
        loops.student student7 = new loops.student("Юрий", "Якимович", "Инженерной Графике", 7);
        System.out.println(student7);
        loops.student student8 = new loops.student("Сергей", "Чистопьян", "Физкультуре", 10);
        System.out.println(student8);
        loops.student student9 = new loops.student("Василий", "Васильев", "Философии", 7);
        System.out.println(student9);
        loops.student student10 = new loops.student("Андрей", "Левченко", "Праву и государству", 5);
        System.out.println(student10);
    }
}

