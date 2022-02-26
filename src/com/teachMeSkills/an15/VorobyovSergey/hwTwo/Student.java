package com.teachMeSkills.an15.VorobyovSergey.hwTwo;

class Student {
    String firstName;
    String lastName;
    String exam;
    int score;

    public Student(String firstName, String lastName, String exam, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.exam = exam.toLowerCase();
        this.score = score;
    }

    @Override
    public String toString() {
        return "«Студент " + firstName + " " + lastName +
                " сдал экзамен по " + exam + " на " + score + "»";
    }
}
