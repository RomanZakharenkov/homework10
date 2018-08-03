package com.itacademy.zakharenkov.task2;

/**
 * Created by Рома on 03.08.2018.
 */
public abstract class Car {

    private String brand;
    private String model;
    private int year;
    private int price;
    private double maxSpeed;
    private String color;

    public Car(String brand, String model, int year, int price, double maxSpeed, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (price != car.price) return false;
        if (Double.compare(car.maxSpeed, maxSpeed) != 0) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + price;
        temp = Double.doubleToLongBits(maxSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }
}
