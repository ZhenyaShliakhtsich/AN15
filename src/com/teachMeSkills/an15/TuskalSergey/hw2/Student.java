package com.teachMeSkills.an15.TuskalSergey.hw2;

public class Student {
    String name, surname, exam;
    int mark;

    Student(String name, String surname, String exam, int mark) {
            this.name = name;
            this.surname = surname;
            this.exam = exam;
            this.mark = mark;
    }

    public static void main(String[] args) {
    Student st1 = new Student("Иван", "Иванов", "экзамен по математике", 8);
        System.out.println(st1);

        Student st2 = new Student("Петр", "Петров", "экзамен по физике", 9);
        System.out.println(st2);

        Student st3 = new Student("Сидр", "Сидоров", "экзамен по биологии", 7);
        System.out.println(st3);

        Student st4 = new Student("Алексей", "Алексеев", "экзамен по английскому языку", 10);
        System.out.println(st4);

        Student st5 = new Student("Сергей", "Сергеев", "экзамен по русскому языку", 10);
        System.out.println(st5);

        Student st6 = new Student("Михаил", "Михайлов", "экзамен по астрономии", 8);
        System.out.println(st6);

        Student st7 = new Student("Егор", "Егоров", "экзамен по истории", 7);
        System.out.println(st7);

        Student st8 = new Student("Олег", "Олегов", "экзамен по французскому языку", 9);
        System.out.println(st8);

        Student st9 = new Student("Александр", "Александров", "экзамен по литературе", 10);
        System.out.println(st9);

        Student st10 = new Student("Глеб", "Глебов", "экзамен по белорусскому языку", 9);
        System.out.println(st10);

    }

    @Override
    public String toString() {
        return "Студент " + name + " " + surname + " сдал " + exam + " на " + mark;
        }

}


