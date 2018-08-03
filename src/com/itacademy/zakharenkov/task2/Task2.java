package com.itacademy.zakharenkov.task2;

/**
 * Created by Рома on 03.08.2018.
 */
public class Task2 {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Auto("BMW", "F30", 2014, 18000, 230.0, "White", 8);
        Car car2 = new Auto("Mazda", "6", 2011, 9000, 203.0, "Black", 4);
        Car car3 = new Auto("Skoda", "Rapid", 2018, 18000, 193.0, "Red", 4);
        Car car4 = new Truck("Scania", "S500", 2018, 88000, 146.0, "Red", 26);
        Car car5 = new Truck("MAZ", "Euro 6", 2018, 58000, 124.0, "Black", 22);
        Car car6 = new Truck("Mercedes", "750", 2018, 168000, 152.0, "Red", 28);
        Car car7 = new Bus("MAZ", "306", 2011, 54000, 107.0, "White", 36);
        Car car8 = new Bus("Mercedes", "S430", 2017, 208000, 142.0, "Black", 44);
        Car car9 = new Bus("Mercedes", "B104", 2001, 14000, 97.0, "Red", 35);
        Car car10 = new FireEngine("Mercedes", "330T", 2001, 24000, 99.0, "Red", 3);
        Car car11 = new FireEngine("MAZ", "564", 2011, 44000, 92.0, "Red", 5);
        Car car12 = new FireEngine("Scania", "74", 2018, 114000, 102.0, "Red", 8);

        garage.leave(car1);
        garage.park(car1);
        garage.park(car2);
        garage.park(car3);
        garage.park(car4);
        garage.park(car12);
        garage.park(car1);
        garage.park(car5);
        garage.park(car12);
        garage.leave(car4);
        garage.park(car1);
        System.out.println("Кол-во машин марки Mercedes - " + garage.calculateCarsWithSpecificBrand("Mercedes"));
        garage.park(car6);
        garage.park(car7);
        garage.park(car11);
        System.out.println("Кол-во машин черного цвета - " + garage.calculateCarsWithSpecificColor("Black"));
        garage.leave(car2);
        garage.park(car8);
        System.out.println("Кол-во машин марки Scania - " + garage.calculateCarsWithSpecificBrand("Scania"));
        garage.park(car9);
        garage.leave(car5);
        System.out.println("Кол-во машин красного цвета - " + garage.calculateCarsWithSpecificColor("Red"));
        garage.park(car10);
        System.out.println("Кол-во машин белого цвета - " + garage.calculateCarsWithSpecificColor("White"));
        garage.leave(car3);
        System.out.println("Кол-во машин марки BMW - " + garage.calculateCarsWithSpecificBrand("BMW"));
        garage.leave(car1);
        garage.leave(car4);
    }
}