package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static service.CarService.carService;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCarsAll(Model model, @RequestParam(value = "count", defaultValue = "5") Integer count) {
        model.addAttribute("carsList", carService(count));
        return "cars";
    }
}
