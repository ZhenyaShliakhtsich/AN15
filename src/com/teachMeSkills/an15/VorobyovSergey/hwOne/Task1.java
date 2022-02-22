package com.teachMeSkills.an15.VorobyovSergey.hwOne;


//1. Создать 3 целочисленные переменные и найти максимальное и минимальное значения.
// Вывести их в консоль. Два варианта решения (1 - через if, 2 - через Math)
//пользователь вводит значение через консоль
class Task1 {
    public static void main(String[] args) {
        MyConsoleReader myreader = new MyConsoleReader();

        int num_1 = myreader.readPleas("Введи любое целое число 1");
        int num_2 = myreader.readPleas("Введи любое целое число 2");
        int num_3 = myreader.readPleas("Введи любое целое число 3");

        solutionOne(num_1, num_2, num_3);
        solutionTwo(num_1, num_2, num_3);
    }

    static void solutionOne(int num_1, int num_2, int num_3){
        System.out.println("Solution 1. if_else :");
        int maxNumber;
        int minNumber;

        //Find max number
        maxNumber = num_1 > num_2 ? num_1 : num_2;
        if (maxNumber > num_3){
            System.out.println("Max number is - " + maxNumber);
        } else
            System.out.println("Max number is - " + num_3);

        //Find min number
        minNumber = num_1 < num_2 ? num_1 : num_2;
        if (minNumber < num_3){
            System.out.println("Min number is - " + minNumber);
        } else
            System.out.println("Min number is - " + num_3);
    }

    static void solutionTwo(int num_1, int num_2, int num_3){
        System.out.println("\nSolution 2. Math. :");
        int maxNumber = Math.max(Math.max(num_1,num_2),num_3);
        int minNumber = Math.min(Math.min(num_1,num_2),num_3);

        System.out.println("Max number is - " + maxNumber);
        System.out.println("Min number is - " + minNumber);
    }

}

// что это такое? solutionOne(num_1, num_2, num_3);
//        solutionTwo(num_1, num_2, num_3);

// и это num_1 > num_2 ? num_1 : num_2;

// код стайл

