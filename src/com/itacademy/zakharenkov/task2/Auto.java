package com.itacademy.zakharenkov.task2;

/**
 * Created by Рома on 03.08.2018.
 */
public class Auto extends Car {

    private int airBagCount;

    public Auto(String brand, String model, int year, int price, double maxSpeed, String color, int airBagCount) {
        super(brand, model, year, price, maxSpeed, color);
        this.airBagCount = airBagCount;
    }

    public int getAirBagCount() {
        return airBagCount;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "airBagCount=" + airBagCount +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        if (!super.equals(o)) return false;

        Auto auto = (Auto) o;

        return airBagCount == auto.airBagCount;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + airBagCount;
        return result;
    }
}
