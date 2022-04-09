package web.service;

import web.model.Car;

import java.util.List;

public class CarService {
    public static List<Car> getCars(List<Car> cars, Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
