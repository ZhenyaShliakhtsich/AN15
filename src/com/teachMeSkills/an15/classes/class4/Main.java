package com.teachMeSkills.an15.classes.class4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
            int num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка");
        } catch (NullPointerException e){
            System.out.println("Студентов еще нет");
        }
        System.out.println("Капец");











        Gruppa gruppa = new Gruppa();
        try {
            gruppa.getCountOfStudents(gruppa);
        } catch (MyException e) {
            System.out.println("Ошибка в классе Main в методе main при вызове метода getCountOfStudents(gruppa)");
        }

    }


    static int countOfStudentsPerGroup(Gruppa gruppa) throws MyException {
        if (gruppa.students == null) {
            throw new MyException("Студенты не были прикреплены к группе!");
        }
        return 0;
    }


}
