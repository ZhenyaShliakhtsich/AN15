package com.teachMeSkills.an15.BuzukArtyom.hw3;

public class Reshenie {
    double x;
    double y;
    int action;

    public Reshenie(double x, double y, int action) {
        this.x = x;
        this.y = y;
        this.action = action;
    }

    public double Result() {
        double result = 0;
        switch (action) {
            case 1:
                result = x * y;
                break;
            case 2:
                result = x / y;
                break;
            case 3:
                result = x + y;
                break;
            case 4:
                result = x - y;
                break;
            default:
                System.out.println("Неизвестное действие");
        }

        return result;
    }
}
