package abstractionsInterfaces.task3;

public class Car {
    static int num;
    String brand;
    String model;
    int year;
    double capacity;
    int mileage;
    int price;

    public Car(String brand, String model, int year, double capacity, int mileage, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
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

    public double getCapacity() {
        return capacity;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getMileage() + ", " + getPrice();
    }
}