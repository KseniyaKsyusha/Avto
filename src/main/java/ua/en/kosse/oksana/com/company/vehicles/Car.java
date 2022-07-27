package ua.en.kosse.oksana.com.company.vehicles;

import ua.en.kosse.oksana.com.company.details.Engine;
import ua.en.kosse.oksana.com.company.profession.Driver;

public class Car {
    private String carBrand;
    private String carClass;
    private int weight;
    public Driver driverType;
    public Engine engineType;

    public Car (String carBrand, String carClass, int weight, Driver newDriverType, Engine newEngineType) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;

        //this.driverType = new Driver("Иванов Иван Иванович", 40, "ч.", "(050)8562321", 15);
        //this.engineType = new Engine("204 л.с.", "Toyota");

        this.driverType = newDriverType;
        this.engineType = newEngineType;

    }

    public String getCarBrand() {
        return carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand=carBrand;

    }
    public String getCarClass(){
        return carClass;

    }
    public void setCarClass (String carBrand){
        this.carClass=carClass;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight) {
        this.weight=weight;

    }
    public void start(){
        System.out.println("Поїхали");
    }
    public void stop() {
        System.out.println("Зупиняємося");
    }
    public void turnRing() {
        System.out.println("Поворот праворуч");
    }
    public void turnLeft(){
        System.out.println("Поворот ліворуч");
    }

    @Override
    public String toString() {
        //System.out.printf("Марка автомобіля: %s \tКлас : %s\t Вага: %d \n", carBrand, carClass, weight);
        return  "Водій: " + driverType.getFullName() +" Стаж водіння: "+ driverType.getDriveExperience()+
                " Виробник: "+engineType.getManufacturer()+ " Марка автомобіля: " + getCarBrand() +
                " Клас : " + getCarClass() +" \n" +" Вага: " + getWeight()+
                " Потужність: "+ engineType.getCapacity() ;

    }

}

