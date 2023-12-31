package org.carrental.controller;

import lombok.RequiredArgsConstructor;
import org.carrental.exception.ValidationException;
import org.carrental.model.car.Car;
import org.carrental.service.CarService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> allCars = carService.getAllCars();

        return ResponseEntity.ok(allCars);
    }

    @PostMapping("/create")
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        try {
            Car createdCar = carService.create(car);
            return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(createdCar);
        } catch (ValidationException exception){
            return ResponseEntity.badRequest().build();
        }
    }

}
