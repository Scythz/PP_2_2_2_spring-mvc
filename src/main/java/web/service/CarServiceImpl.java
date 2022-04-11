package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    public  List<Car> getCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazda", 150, "red"));
        cars.add(new Car("BMW", 170, "black"));
        cars.add(new Car("Kia", 160, "yellow"));
        cars.add(new Car("Lada", 12, "brown"));
        cars.add(new Car("Skoda", 120, "white"));
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
