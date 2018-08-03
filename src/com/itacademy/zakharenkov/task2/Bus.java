package com.itacademy.zakharenkov.task2;

/**
 * Created by Рома on 03.08.2018.
 */
public class Bus extends Car {

    private int passengersCount;

    public Bus(String brand, String model, int year, int price, double maxSpeed, String color, int passengersCount) {
        super(brand, model, year, price, maxSpeed, color);
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengersCount=" + passengersCount +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;

        Bus bus = (Bus) o;

        return passengersCount == bus.passengersCount;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + passengersCount;
        return result;
    }
}
