package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazda", 150, "red"));
        cars.add(new Car("BMW", 170, "black"));
        cars.add(new Car("Kia", 160, "yellow"));
        cars.add(new Car("Lada", 12, "brown"));
        cars.add(new Car("Skoda", 120, "white"));

        model.addAttribute("cars", CarService.getCars(cars, count));
        return "cars";
    }

}