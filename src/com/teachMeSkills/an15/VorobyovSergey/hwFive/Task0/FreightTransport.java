package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task0;

class FreightTransport extends GroundTransport {
    private int loadCapacity;

    @Override
    String showTransportCharacteristics() {
        return super.showTransportCharacteristics() +
                "\n   loadCapacity = " + loadCapacity;
    }

    //ничего не возвращает потому что не просили, только вывод в консоль
    void cargoCounter(int weight) {
        System.out.println(weight <= this.loadCapacity ?
                "Грузовик загружен" : "Вам нужен грузовик побольше");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
