package com.teachMeSkills.an15.VorobyovSergey.hWFour.Task1;

//1. Создать собственное исключение
//        - Создать класс Car c полями (марка, скорость, цена), конструкторы (с
//        параметрами и default).
//        Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
//        генерируете случайное число от 0 до 20, если полученное число оказалось
//        четным, то выбрасываете созданное ранее вами исключение и передаете его к
//        месту откуда вызывали метод старт. Если все хорошо и исключение не
//        вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
//        завелся.
//        В main создаете парочку автомобилей и пытаетесь их завести. И обрабатываете
//        исключение которое может вылететь при старте автомобиля
class MainTask1 {
    public static void main(String[] args) {
        Car audi = new Car();
        Car vw = new Car("VW", 15000, 200);
        Car ziguli = new Car();

        try {
            audi.start();
        } catch (CarStartException e) {
            e.printStackTrace();
        }

        try {
            vw.start();
        } catch (CarStartException e) {
            e.printStackTrace();
        }

        try {
            ziguli.start();
        } catch (CarStartException e) {
            e.printStackTrace();
        }

    }
}
