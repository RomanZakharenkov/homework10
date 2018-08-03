package com.itacademy.zakharenkov.task2;

/**
 * Created by Рома on 03.08.2018.
 */
public class FireEngine extends Car {

    private int waterCapacity;

    public FireEngine(String brand, String model, int year, int price, double maxSpeed, String color, int waterCapacity) {
        super(brand, model, year, price, maxSpeed, color);
        this.waterCapacity = waterCapacity;
    }

    public int getWaterCapacity() {
        return waterCapacity;
    }

    @Override
    public String toString() {
        return "FireEngine{" +
                "waterCapacity=" + waterCapacity +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FireEngine)) return false;
        if (!super.equals(o)) return false;

        FireEngine that = (FireEngine) o;

        return waterCapacity == that.waterCapacity;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + waterCapacity;
        return result;
    }
}
