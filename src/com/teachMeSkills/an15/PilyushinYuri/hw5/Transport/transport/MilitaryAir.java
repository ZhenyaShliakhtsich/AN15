package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;

import java.util.Objects;

public class MilitaryAir extends Air {
    boolean catapult;
    int launch;

    public MilitaryAir(int hp, int maxSpeed, int weight, String name, int wingspan, int minRunway, boolean catapult, int launch) {
        super(hp, maxSpeed, weight, name, wingspan, minRunway);
        this.catapult = catapult;
        this.launch = launch;
    }

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getLaunch() {
        return launch;
    }

    public void setLaunch(int launch) {
        this.launch = launch;
    }

    @Override
    public String toString() {
        return "MilitaryAir{" +
                "catapult=" + catapult +
                ", launch=" + launch +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryAir that = (MilitaryAir) o;
        return catapult == that.catapult && launch == that.launch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), catapult, launch);
    }
    public String toDicplay (){
        return (toString() + KiloWatt());
    }
    void toLaunch(){
        if (getLaunch() > 0){
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }
    void toCatapult(){
        if (isCatapult() == true){
            System.out.println("катапультирование успешно.");
        } else {
            System.out.println("система отсутсвует.");
        }
    }
}
