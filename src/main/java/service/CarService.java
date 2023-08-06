package service;
import model.Car;
import model.GetAllCars;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    static GetAllCars carsList = new GetAllCars();
    static List<Car> allCars = carsList.getAllCars();

    public static List<Car> carService(int count) {
        List<Car> carServiceList = new ArrayList<>();
        if (count > 5) {
            return allCars;
        }
        for (int i = 0; i < count; i++) {
            carServiceList.add(allCars.get(i));
        }
        return carServiceList;
    }
}
