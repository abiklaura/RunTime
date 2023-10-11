package abstractionsInterfaces.task3;

import java.util.Comparator;

public class Model implements Comparator<Car> { // ошибка т.к. текст
    @Override
    public int compare(Car o1, Car o2) {
        if (Car.num == 1) {
            return (o1.getModel().compareTo(o2.getModel()));
        } else if (Car.num == 2) {
            return (o2.getModel().compareTo(o1.getModel()));
        } else return 0;
    }
}