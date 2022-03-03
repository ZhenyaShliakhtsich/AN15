package com.teachMeSkills.an15.AltievAli.Training;





class Main {


    public static void main(String[] args) {


        student student1 = new student(1, 19, "Jake", 10);
        System.out.println(student1);

        Main main = new Main();
        main.method(0);
        main.method(10, 10);
        main.method(10, 10, 10);
        main.method(10, 10, 10, 10);
        System.out.println(main.method(0));
        System.out.println(main.method(10, 10));
        System.out.println( main.method(10, 10, 10));
        System.out.println( main.method(10, 10, 10,10));


    }


    int method(int num) {

        return num ;
    }

    int method(int num, int num1) {

        return num + num1;

    }

    int method(int num, int num1, int num2) {
        return num + num1 + num2;
    }

    int method(int num, int num1, int num2, int num3) {


        return num + num1 + num2 + num3;
    }

}


class student {
    int id;
    int age;
    String name;
    int point;


    public student(int id, int age, String name, int point) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.point = point;


    }

    public student(int id1, int age1, String name1) {

        this(id1, age1, name1, 0);
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +

                '}';
    }


}