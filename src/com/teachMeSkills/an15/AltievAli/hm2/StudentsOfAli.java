package com.teachMeSkills.an15.AltievAli.hm2;

public class StudentsOfAli {


    // Properties
    String nameOfStudent;
    String surnameOfStudent;
    String examName;
    int examScore;

    //Generated constructor
    public StudentsOfAli(String nameOfStudent, String surnameOfStudent, String examName, int examScore) {
        this.nameOfStudent = nameOfStudent;
        this.surnameOfStudent = surnameOfStudent;
        this.examName = examName;
        this.examScore = examScore;
    }


    //Generated toString


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Студент ").append(nameOfStudent).append(" ").
                append(surnameOfStudent).append(" ").append("сдал по ").append(examName).append(" на ").append(" ").append(examScore);
        return stringBuilder.toString();
    }
}




