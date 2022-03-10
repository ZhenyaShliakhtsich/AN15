package com.teachMeSkills.an15.AltievAli.hm5.task1;

public class MilitaryCar extends Transport {
    private boolean ejectionSystems;
    private int QuantityOfMissilesOnBoard; //

    public boolean isEjectionSystems() {
        return ejectionSystems;
    }

    public void setEjectionSystems(boolean ejectionSystems) {
        this.ejectionSystems = ejectionSystems;
    }

    public int getNumberOfMissilesOnBoard() {
        return QuantityOfMissilesOnBoard;
    }

    public void setNumberOfMissilesOnBoard(int numberOfMissilesOnBoard) {
        QuantityOfMissilesOnBoard = numberOfMissilesOnBoard;
    }


    public String toString() {
        return "Brand of Car" + brandOfCar
                + " | speed of Car " + speedOfCar
                + " | Ejection System " + isEjectionSystems()
                + " | QualityOfMissilesOnBoard " + getNumberOfMissilesOnBoard();
    }
}

