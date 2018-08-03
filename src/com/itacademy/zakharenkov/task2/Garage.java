package com.itacademy.zakharenkov.task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Рома on 03.08.2018.
 */
public class Garage {

    private Map<Car, Integer> cars;

    public Garage() {
        cars = new HashMap<>();
    }

    public void park(Car car) {
        if (cars.containsKey(car)) {
            cars.put(car, cars.get(car) + 1);
        } else {
            cars.put(car, 1);
        }
        System.out.println(car.toString() + " - запаркована.");
    }

    public void leave(Car car) {
        if (cars.containsKey(car)) {
            if (cars.get(car) > 1) {
                cars.put(car, cars.get(car) - 1);
            } else {
                cars.remove(car);
            }
            System.out.println(car.toString() + " - покинула гараж.");
        } else {
            System.out.println(car.toString() + " - нет такой машины в гараже.");
        }
    }

    public int calculateCarsWithSpecificBrand(String brand) {
        int count = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if (entry.getKey().getBrand().equalsIgnoreCase(brand)) {
                count += entry.getValue();
            }
        }
        return count;
    }

    public int calculateCarsWithSpecificColor(String color) {
        int count = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if (entry.getKey().getColor().equalsIgnoreCase(color)) {
                count += entry.getValue();
            }
        }
        return count;
    }
}
