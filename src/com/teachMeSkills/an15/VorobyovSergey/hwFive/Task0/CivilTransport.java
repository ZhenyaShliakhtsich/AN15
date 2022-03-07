package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task0;

class CivilTransport extends AirTransport {
    int passengersNumber;
    boolean businessClass;

    @Override
    String showTransportCharacteristics() {

        return super.showTransportCharacteristics() +
                "\n   passengersNumber = " + passengersNumber +
                "\n   businessClass = " + businessClass;
    }

    //ничего не возвращает потому что не просили, только вывод в консоль
    void passengersCounter(int passengers) {
        System.out.println(passengers <= this.passengersNumber ?
                "Самолет загружен" : "Вам нужен самолет побольше");
    }
}
