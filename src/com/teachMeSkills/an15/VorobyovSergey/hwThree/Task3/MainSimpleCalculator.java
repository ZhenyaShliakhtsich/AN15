package com.teachMeSkills.an15.VorobyovSergey.hwThree.Task3;

//3. Пользователь вводит два числа.
// После этого в консоль выводятся действия, которые мы можем произвести с этими числами (умножение, деление, сложение, вычитание).
//        Пользователь выбирает одно из действий. С помощью метода выполняем это действие и выводим результат в консоль.
class MainSimpleCalculator {
    public static void main(String[] args) {
        double result = myCounter();
        System.out.println("Ты насчитал - " + result);
    }

    static double myCounter() {
        double[] arr = new double[2];
        SignAndNumberReader reader = new SignAndNumberReader();
        arr[0] = reader.readNumber("Введите первое число");
        arr[1] = reader.readNumber("Введите второе число");
        String sign = reader.readSign("Введите знак");

        //Division by zero checking
        while (sign.equals("/") && arr[1] == 0) {
            System.out.println("Ты пытаешься разделить на 0");
            arr[1] = reader.readNumber("Введите второе число не равное 0");
        }

        switch (sign) {
            case "+":
                return arr[0] + arr[1];
            case "-":
                return arr[0] - arr[1];
            case "/":
                return arr[0] / arr[1];
            case "*":
                return arr[0] * arr[1];
            default:
                return 0;
        }
    }
}
