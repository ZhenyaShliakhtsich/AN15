package com.teachMeSkills.an15.VorobyovSergey.hwTwo;

public class ViewMain {
    public static void main(String[] args) {
        //1 -  задание со String
        System.out.println("1-е Задание");
        new StringTasks();

        //2 - задание с классами и объектами
        System.out.println("\n\n2-е Задание");
        Student student1 =
                new Student("Василий", "Васильев", "Математика", 3);
        System.out.println(student1);
        Student student2 =
                new Student("Петр", "Петров", "ИЗО", 4);
        System.out.println(student2);
        Student student3 =
                new Student("Коля", "Николаев", "Хореография", 8);
        System.out.println(student3);
        Student student4 =
                new Student("Акакий", "Веточкин", "Столярное Дело", 9);
        System.out.println(student4);
        Student student5 =
                new Student("Егор", "Егоров", "Физкультура", 8);
        System.out.println(student5);
        Student student6 =
                new Student("Михаил", "Михайлов", "Химия", 10);
        System.out.println(student6);
        Student student7 =
                new Student("Драздроперма", "Ломикова", "Биология", 5);
        System.out.println(student7);
        Student student8 =
                new Student("Тракторина", "Радужная", "Механика", 7);
        System.out.println(student8);
        Student student9 =
                new Student("Октябрина", "Васнецова", "История", 4);
        System.out.println(student9);
        Student student10 =
                new Student("Марфа", "Царевна", "Литература", 7);
        System.out.println(student10);

        //3 - задание с циклами
        System.out.println("\n\n3-е Задание");
        CyclesTasks task = new CyclesTasks();
        task.numberSequence();
        task.randomCoin();
        task.zeroTenCycles();
        task.fromOneToTenNumberSevenMultiplication();
        task.fromOneToTenNumberSevenMultiplicationStringBuilderSolution();
    }
}
