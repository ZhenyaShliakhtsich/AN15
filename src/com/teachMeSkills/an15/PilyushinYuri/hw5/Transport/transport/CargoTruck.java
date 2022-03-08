package com.teachMeSkills.an15.PilyushinYuri.hw5.Transport.transport;

import java.util.Objects;

public class CargoTruck extends Ground {
    int cargoWeight;

    public CargoTruck(int hp, int maxSpeed, int weight, String name, int wheel, int averageFuel, int cargoWeight) {
        super(hp, maxSpeed, weight, name, wheel, averageFuel);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoTruck that = (CargoTruck) o;
        return cargoWeight == that.cargoWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoWeight);
    }

    @Override
    public String toString() {
        return "CargoTruck{" +
                "cargoWeight=" + cargoWeight +
                ", wheel=" + wheel +
                ", averageFuel=" + averageFuel +
                ", hp=" + hp +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
    public String toDicplay (){
        return (toString() + "KiloWatt= " + KiloWatt());
    }
    void toCanCarry(int cargo){
        if (cargo< getCargoWeight()){
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен другой грузовик.");
        }
    }

    public static class Wine {
        String name;
        String type;
        String country;
        String year;
        String description;

        public Wine (String name, String type, String country, String year, String description) {
            this.name = name;
            this.type = type;
            this.country = country;
            this.year = year;
            this.description = description;






        }

        public Wine() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Wine wine = (Wine) o;
            return year == wine.year && Objects.equals(name, wine.name) && Objects.equals(type, wine.type) && Objects.equals(country, wine.country) && Objects.equals(description, wine.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, type, country, year, description);
        }

        @Override
        public String toString() {
            return "Wine{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", country='" + country + '\'' +
                    ", year=" + year +
                    ", description='" + description + '\'' +
                    '}';
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }




    }
}
