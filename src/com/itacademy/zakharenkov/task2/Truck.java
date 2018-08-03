package com.itacademy.zakharenkov.task2;

/**
 * Created by Рома on 03.08.2018.
 */
public class Truck extends Car {

    private int capacity;

    public Truck(String brand, String model, int year, int price, double maxSpeed, String color, int capacity) {
        super(brand, model, year, price, maxSpeed, color);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        return capacity == truck.capacity;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + capacity;
        return result;
    }
}
