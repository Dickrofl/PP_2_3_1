package model;

import java.util.ArrayList;
import java.util.List;

public class GetAllCars{
    public GetAllCars() {
    }
    public List<Car> getAllCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("ВАЗ","1922", 70));
        cars.add(new Car("Ford","Orion",
                202));
        cars.add(new Car("Honda","Accord",
                200));
        cars.add(new Car("Toyota","Supra", 250));
        cars.add(new Car("УАЗ","Cargo", 135));
        return cars;
    }
}
