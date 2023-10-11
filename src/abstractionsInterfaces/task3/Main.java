package abstractionsInterfaces.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Toyota", "Land Cruiser", 2010, 4.5, 230000, 14500000),
                new Car("Nissan", "Pathfinder", 2009, 4.0, 150000, 12000000),
                new Car("Chevrolet", "Cobalt", 2023, 1.5, 4000, 7200000),
                new Car("Hyundai", "Accent", 2022, 1.4, 35000, 7000000),
                new Car("Mercedes-Benz", "E 300", 2016, 2.0, 21000, 27000000)
        );

        Comparator<Car> brand = new Brand();
        Comparator<Car> model = new Model();
        Comparator<Car> year = new Year();
        Comparator<Car> engineCapacity = new EngineCapacity();
        Comparator<Car> mileage = new Mileage();
        Comparator<Car> price = new Price();
        Scanner scanner = new Scanner(System.in);

        for (Car i : cars) {
            System.out.println(i);
        }
            System.out.println();
            System.out.println("Введите один из фильтров: марка, модель, год выпуска, объем двигателя, пробег, цена");

        String filter = scanner.next();
        switch (filter) {
            case "марка":
                Car.sortNum();
                cars.sort(brand);
                break;
            case "модель":
                Car.sortNum();
                cars.sort(model);
                break;
            case "год выпуска":
                Car.sortNum();
                cars.sort(year);
                break;
            case "объем двигателя":
                Car.sortNum();
                cars.sort(engineCapacity);
                break;
            case "пробег":
                Car.sortNum();
                cars.sort(mileage);
                break;
            case "цена":
                Car.sortNum();
                cars.sort(price);
                break;
            default:
                System.out.println("Ошибка, фильтр не выбран");
                break;
        }
        for (Car i : cars) {
            System.out.println(i);
        }
    }
}
