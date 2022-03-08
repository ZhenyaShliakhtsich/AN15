package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task1;

class CivilTransport extends AirTransport {
    private int passengersNumber;
    private boolean businessClass;

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

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}
