package ua.en.kosse.oksana.com.company.vehicles;

import ua.en.kosse.oksana.com.company.details.Engine;
import ua.en.kosse.oksana.com.company.profession.Driver;

public class Lorry extends Car {

    private int carryingCapacity;

    public Lorry(String carBrand, String carClass, int weight, int carryingCapacity,
                 Driver newDriverType, Engine newEngineType) {
        super(carBrand, carClass, weight, newDriverType, newEngineType);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity){
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        //System.out.printf("Марка автомобіля: %s \tКлас : %s\t Вага: %d \n", carBrand, carClass, weight);
        String s = "Водій ван: " + this.driverType.getFullName() +
                " Стаж водіння: " + this.driverType.getDriveExperience() +
                " Виробник: " + this.engineType.getManufacturer() + " Марка автомобіля: " + getCarBrand() +
                " Клас : " + getCarClass() + " \n "+" Вага: " + getWeight() +
                " Потужність: " + this.engineType.getCapacity() +
                " Вантажепідьйомність: " + getCarryingCapacity();
        return s;
    }
}
