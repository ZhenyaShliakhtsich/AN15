package com.teachMeSkills.an15.VorobyovSergey.hwOne;

//В переменную записываете количество программистов. В
//зависимости от количества программистов необходимо вывести правильно окончание.
//Например:
//        • 2 программиста
//        • 1 программист
//        • 10 программистов
class Task4 {
    public static void main(String[] args) {
        int codersNumber = 1001001;

        int oneDigitRest = codersNumber % 10;
        int twoDigitsRest = codersNumber % 100;
        System.out.println("1 digit rest - " + oneDigitRest);
        System.out.println("2 digit rest - " + twoDigitsRest);

        if (twoDigitsRest < 20 && twoDigitsRest > 9){
            System.out.println(codersNumber + " - программиСТОВ");
        } else checker(oneDigitRest, codersNumber);

    }

    static void checker (int rest, int codersNumber){
        if (rest == 0){
            System.out.println(codersNumber + " - программиСТОВ");
        } else if (rest ==2 || rest == 3 || rest == 4){
            System.out.println(codersNumber + " - программиСТА");
        } else
            System.out.println(codersNumber + " - программиСТ");
    }

}