package model;

public class Car {
    String brand;
    String model;
    int max_speed;
    public Car() {
    }

    public Car(String brand, String model, int max_speed) {
        this.brand = brand;
        this.model = model;
        this.max_speed = max_speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
}
