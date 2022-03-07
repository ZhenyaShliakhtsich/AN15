package com.teachMeSkills.an15.SavitskyRoman.hw5.task1;

public class MilitaryPlane extends AirTransport {
    boolean ejectionSystem;
    private int quantityOfMissiles;

    public int getQuantityOfMissiles() {
        return quantityOfMissiles;
    }

    public void setQuantityOfMissiles(int quantityOfMissiles) {
        this.quantityOfMissiles = quantityOfMissiles;
    }


    public MilitaryPlane(double power, int speed, double weight, String brand,
                         double wingLength, double runwayLength, boolean ejectionSystem, int quantityOfMissiles) {
        super(power, speed, weight, brand, wingLength, runwayLength);
        this.ejectionSystem = ejectionSystem;
        this.quantityOfMissiles = quantityOfMissiles;
    }

    public void shot() {
        if (quantityOfMissiles != 0) {
            for (int x = quantityOfMissiles; x >= 0; x--) {
                if (x == 0) {
                    System.out.println("Боеприпасы закончились!");
                    quantityOfMissiles = 0;
                    continue;
                }
                System.out.println("Ракета номер " + x + " пошла..");

            }
        } else System.out.println("Боеприпасы отсутствуют!");
    }

    public void ejection() {
        if (ejectionSystem) System.out.println("Катапультирование прошло успешно.");
        else System.out.println("У вас нет такой системы");
    }

}
