package abstractionsInterfaces.task3;

import java.util.Comparator;

public class Mileage implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (Car.num == 1) {
            return (o1.getMileage() > o2.getMileage() ? 1 : -1);
        } else if (Car.num == 2) {
            return (o1.getMileage() < o2.getMileage() ? 1 : -1);
        } else return 0;
    }
}