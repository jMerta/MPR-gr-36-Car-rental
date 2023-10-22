package org.carrental;

import org.carrental.model.car.Car;
import org.carrental.model.car.CarClass;
import org.carrental.model.car.CarStatus;
import org.carrental.repository.CarRepository;
import org.carrental.service.CarService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        CarService carService = new CarService(carRepository);

        Car car = new Car(
                null, "Volkswagen", "Golf", "1234", CarClass.STANDARD, CarStatus.AVAILABLE
        );

        carService.create(car);

        List<Car> availableCars = carService.getAvailableCars();

        System.out.println(availableCars);


        // Kolejne kroki:
        // 1. Obsługa pozostałych metod z CarRepository
        // 2. Utworzenie modelu, repozytorium i serwisu dla klienta
        // 3. Dodanie lomboka
        // 4. Dodanie logów
        // Kolejny zjazd:
        // Dodanie modelu rezerwacji, dodanie testów jednostkowych
    }
}