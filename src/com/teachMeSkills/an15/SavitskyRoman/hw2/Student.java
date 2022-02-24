package com.teachMeSkills.an15.SavitskyRoman.hw2;
/*Классы и объекты
Создать класс Student с такими параметрами как имя, фамилия,
название экзамена, оценка по экзамену.
Создать 10 объектов с разными именами, оценками и названиями экзаменов
Переопределить toString так, чтобы в консоль выводилась фразу
«Студент Иван Иванов сдал экзамен по математике на 8»*/
public class Student {
    String firstName;
    String lastName;
    String exam;
    int scoresExam;
    public Student(String fistName, String lastName, String exam, int scoresExam) {
        this.firstName = fistName;
        this.lastName = lastName;
        this.exam = exam;
        this.scoresExam = scoresExam;
    }

    @Override
    public String toString() {
        return "Студент " + firstName + " " + lastName + " сдал экзамен по " + exam
                + " на " + scoresExam;
    }
}

