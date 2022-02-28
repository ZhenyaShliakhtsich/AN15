package com.teachMeSkills.an15.VorobyovSergey.hwOne;


//1. Создать 3 целочисленные переменные и найти максимальное и минимальное значения.
// Вывести их в консоль. Два варианта решения (1 - через if, 2 - через Math)
//пользователь вводит значение через консоль
class Task1 {
    public static void main(String[] args) {
        MyConsoleReader myreader = new MyConsoleReader();

        int num1 = myreader.readPleas("Введи любое целое число 1");
        int num2 = myreader.readPleas("Введи любое целое число 2");
        int num3 = myreader.readPleas("Введи любое целое число 3");

        solutionOne(num1, num2, num3);
        solutionTwo(num1, num2, num3);
    }

    static void solutionOne(int num1, int num2, int num3) {
        System.out.println("Solution 1. if_else :");
        int maxNumber;
        int minNumber;

        //Find max number
        maxNumber = num1 > num2 ? num1 : num2;
        if (maxNumber > num3) {
            System.out.println("Max number is - " + maxNumber);
        } else
            System.out.println("Max number is - " + num3);

        //Find min number
        minNumber = num1 < num2 ? num1 : num2;
        if (minNumber < num3) {
            System.out.println("Min number is - " + minNumber);
        } else
            System.out.println("Min number is - " + num3);
    }

    static void solutionTwo(int num1, int num2, int num3){
        System.out.println("\nSolution 2. Math. :");
        int maxNumber = Math.max(Math.max(num1, num2), num3);
        int minNumber = Math.min(Math.min(num1, num2), num3);

        System.out.println("Max number is - " + maxNumber);
        System.out.println("Min number is - " + minNumber);
    }
}

// что это такое? solutionOne(num_1, num_2, num_3);
//        solutionTwo(num_1, num_2, num_3);
//Ответ: Два метода. Принимают в качестве параметров 3 переменные примитивного типа.
//Тип возвращаемого значения void т.е. ничего не возвращает
//Метод - набор операторов выполняющих определенные действия, описывает поведение обьекта
//тут еще долго можно продолжать ))

// и это num_1 > num_2 ? num_1 : num_2;
// Ответ: тернарный оператор логика следующая ->
// логическоеУсловие ? выполнитьЕлиTrue: выполнитьЕлиFalse
//применил чтобы код было легче читать, по идее вообще без if можно было обойтись

// код стайл
//Ответ: num_1 заменено на num1 и так далее

