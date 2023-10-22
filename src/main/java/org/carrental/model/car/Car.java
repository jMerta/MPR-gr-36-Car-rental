package org.carrental.model.car;

public class Car {
    private Integer id;
    private String make;
    private String model;
    private String vin;
    private CarClass carClass;
    private CarStatus carStatus;

    public Car(Integer id, String make, String model, String vin, CarClass carClass, CarStatus carStatus) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.carClass = carClass;
        this.carStatus = carStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public void setCarClass(CarClass carClass) {
        this.carClass = carClass;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(CarStatus carStatus) {
        this.carStatus = carStatus;
    }
}
