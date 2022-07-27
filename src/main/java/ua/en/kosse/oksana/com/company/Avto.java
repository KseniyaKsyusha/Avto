package ua.en.kosse.oksana.com.company;

import ua.en.kosse.oksana.com.company.details.Engine;
import ua.en.kosse.oksana.com.company.vehicles.Car;
import ua.en.kosse.oksana.com.company.profession.Driver;
import ua.en.kosse.oksana.com.company.vehicles.Lorry;
import ua.en.kosse.oksana.com.company.vehicles.SportCar;

public class Avto {

    public static void main(String[] args) {

        Engine e = new Engine(204, "Toyota");
        //e.engineStr();

        Driver d = new Driver("Иванов Иван Иванович", 40, "ч.", "(050)8562321", 15);
        Driver d1 = new Driver("Сергиенко Сергей Сергеевич", 45, "ч.", "(050)7685940", 10);

        Car c = new Car("Land Cruiser","Люкс", 2990, d, e);
        System.out.println(c.toString());
        c.start();
        c.stop();
        c.turnLeft();
        c.turnRing();

        Car l = new Lorry(" TOYOTA "," flatbed truck", 2990,130, d, e);
        System.out.println(l.toString());


        Car s = new SportCar("Accept "," sport car", 1000,200, d1, e);
        System.out.println(s.toString());




    }
};
