package com.teachMeSkills.an15.classes.class4;

public class NotMain {
    public static void main(String[] args) {
        Gruppa gruppa = new Gruppa();
        try {
            gruppa.getCountOfStudents(gruppa);
        } catch (MyException e) {
            System.out.println(e.getCode());
            System.out.println("Группа была пустая, но мы ее заполним и узнаем количество!");
            Student[] students = new Student[1];
            Student student = new Student();
            student.firstName = "Ivan";
            student.secondName = "Ivanov";
            students[0] = student;
            gruppa.students = students;

            try {
                System.out.println(gruppa.getCountOfStudents(gruppa));
            } catch (MyException ex) {



            }
        }
    }
}
