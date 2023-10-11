package abstractionsInterfaces.task3;

import java.util.Comparator;

public class Price implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (Car.num == 1) {
            return (o1.getPrice() > o2.getPrice() ? 1 : -1);
        } else if (Car.num == 2) {
            return (o1.getPrice() < o2.getPrice() ? 1 : -1);
        } else return 0;
    }
}
