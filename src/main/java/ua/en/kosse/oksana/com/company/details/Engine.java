package ua.en.kosse.oksana.com.company.details;

public class Engine {
    private int capacity;
    private String manufacturer;

    public Engine (int capacity, String manufacturer){
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void engineStr() {
        System.out.printf("Потужність : %s \t Виробник: %s\n", getCapacity(), getManufacturer());
    }
}
