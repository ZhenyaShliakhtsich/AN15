package com.teachMeSkills.an15.ShlyakhtichEvgeniy.hw4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada Granta", 50, 1390);
        Car car2 = new Car("Lada Calina", 40, 1000);
        Car car3 = new Car("Lada Vesta", 60, 1500);

        try {
            car1.start();
            System.out.println(car1.start()); //По факту нам sout не нужен, потому что в методе start выбпасывается исключение
        } catch (CarException e) {
            System.out.println("Машина марки " + car1.model + " не завеелась");
        }
        try {
            car2.start();
            System.out.println(car2.start());
        } catch (CarException e) {
            System.out.println("Машина марки " + car2.model + " не завеелась");
        }
        try {
            car3.start();
            System.out.println(car3.start());
        } catch (CarException e) {
            System.out.println("Машина марки " + car3.model + " не завеелась");
        }
        //Нужно было создать массив объектов
        //Нигде не использует методы takeVacation и returnBack
        Coder coder1 = new Coder("Петров В. В.", "01.03.1999", "Программист", 1200, 336082764);
        Country country1 = new Country("Грузия", "Тбилиси");
        Country country2 = new Country("Армения", "Ереван");
        System.out.println(coder1.takeVacation(country1, country2));

    }
}
