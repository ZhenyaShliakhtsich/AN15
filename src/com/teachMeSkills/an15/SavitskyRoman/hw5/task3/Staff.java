package com.teachMeSkills.an15.SavitskyRoman.hw5.task3;

public class Staff {
    public static void main(String[] args) {
    Worker[] staff = new Worker[10];
    staff[0] = new Coder("Ivan", "Zero", "android developer", 25, "male", true, "middle");
    staff[1] = new Security("Fedor", "First", "senior guard", 35, "male", false, true);
    staff[2] = new Coder("Roman", "Second", "idler of the year", 29, "male", true, "junior");
    staff[3] = new Coder("Ivan", "Thir")
        System.out.println(staff[0].getSalary(15, 20));
    }
}
