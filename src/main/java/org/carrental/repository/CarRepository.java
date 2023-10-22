package org.carrental.repository;

import org.carrental.model.car.Car;
import org.carrental.model.car.CarStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarRepository {

    private List<Car> carList = new ArrayList<>();

    public Car create(Car car) {
        carList.add(car);
        return car;
    }

    public Optional<Car> getById(Integer id){
        return carList
                .stream()
                .filter(it -> it.getId().equals(id))
                .findFirst();
    }

    public List<Car> getByStatus(CarStatus carStatus){
        return carList
                .stream()
                .filter(it -> it.getCarStatus().equals(carStatus))
                .collect(Collectors.toList());
    }

}
