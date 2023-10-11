package abstractionsInterfaces.task3;

import java.util.Scanner;

public class Car {
    static int num;
    String brand;
    String model;
    int year;
    double engineCapacity;
    int mileage;
    int price;

    public Car(String brand, String model, int year, double engineCapacity, int mileage, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
        this.price = price;
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

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public static void sortNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("далее приоритетность: 1 - это по возрастанию, 2 по убыванию");
        Car.num = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() + ", год выпуска: " + getYear() + ", объем двигателя: " +
                getEngineCapacity() + ", пробег: " + getMileage() + ", цена: " + getPrice();
    }
}