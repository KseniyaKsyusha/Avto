package ua.en.kosse.oksana.com.company.vehicles;

import ua.en.kosse.oksana.com.company.details.Engine;
import ua.en.kosse.oksana.com.company.profession.Driver;

public class SportCar extends Car {

    private int maxSpeed;

    public SportCar(String carBrand, String carClass, int weight, int maxSpeed, Driver newDriverType, Engine newEngineType) {
        super(carBrand, carClass, weight, newDriverType, newEngineType);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        //System.out.printf("Марка автомобіля: %s \tКлас : %s\t Вага: %d \n", carBrand, carClass, weight);
        return "Водій: " + this.driverType.getFullName() +
                " Стаж водіння: " + this.driverType.getDriveExperience() +
                " Виробник: " + this.engineType.getManufacturer() + " Марка автомобіля: " + getCarBrand() +
                " Клас : " + getCarClass() +" \n " +" Вага: " + getWeight() +
                " Потужність: " + this.engineType.getCapacity() + " Швідкість: " + getMaxSpeed();
    }
}