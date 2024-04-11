package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private final List<Car> list;

    public CarService() {
        list = new ArrayList<>();
        list.add(new Car("Geely", "Atlas", 2016));
        list.add(new Car("Honda", "Accord", 2019));
        list.add(new Car("Ford", "Mustang", 2021));
        list.add(new Car("Chevrolet", "Camaro", 2017));
        list.add(new Car("BMW", "X5", 2015));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return list;
        } else {
            return list.subList(0, count);
        }
    }


}
