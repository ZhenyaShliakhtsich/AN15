package com.teachMeSkills.an15.VorobyovSergey.hwFive.Task1;

class MilitaryTransport extends AirTransport {
    private int rocketNumber;
    private boolean ejectionSystem;

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

    public int getRocketNumber() {
        return rocketNumber;
    }

    public void setRocketNumber(int rocketNumber) {
        this.rocketNumber = rocketNumber;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }
}
