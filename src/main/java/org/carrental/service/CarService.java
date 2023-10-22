package org.carrental.service;

import org.carrental.exception.ValidationException;
import org.carrental.model.car.Car;
import org.carrental.repository.CarRepository;

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car create(Car car) {
        if (car.getMake().isBlank()){
            throw new ValidationException("make", "Cannot be blank");
        }
        if (car.getModel().isBlank()){
            throw new ValidationException("model", "Cannot be blank");
        }
        if (car.getVin().isBlank()) {
            throw new ValidationException("vin", "cannot be blank");
        }
        if (car.getVin().length() != 17){
            throw new ValidationException("vin", "length must be 17");
        }


        return carRepository.create(car);
    }

}
