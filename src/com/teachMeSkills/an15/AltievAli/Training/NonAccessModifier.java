package com.teachMeSkills.an15.AltievAli.Training;


public class NonAccessModifier {

    public static void main(String[] args) {


        students student1 = new students("Ivan", "Ivanov", 1);
        students student2 = new students("Nikolay", "Nikolay", 1);
        students student3 = new students("Artem", "Artem", 1);
        students student4 = new students("Anna", "Anna", 1);

    }


}



class students {

    String Name;
    String SecondName;
    int course;
    static int countStudents;

    public students(String name, String secondName, int course) {
        Name = name;
        SecondName = secondName;
        this.course = course;
        countStudents++;
        System.out.println( "Создан Студент номер: " + countStudents );
    }}













