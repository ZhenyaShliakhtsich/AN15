package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task0;

class MilitaryTransport extends AirTransport {
    int rocketNumber;
    boolean ejectionSystem;

    @Override
    String showTransportCharacteristics() {
        return super.showTransportCharacteristics() +
                "\n   rocketNumber = " + rocketNumber +
                "\n   ejectionSystem = " + ejectionSystem;
    }

    void rocketShot() {
        if (rocketNumber > 0) {
            System.out.println("Ракета пошла. Ракет осталось - " + --rocketNumber);
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    void ejectionSystemChecker() {
        System.out.println(ejectionSystem ? "Катапультирование прошло успешно" : "У вас нет такой системы");
    }
}
