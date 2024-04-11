package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

        private final CarService carService = new CarService();

        @GetMapping("/cars")
        public String getCars(@RequestParam(required = false) Integer count, Model model) {
            if (count == null) {
                model.addAttribute("cars", carService.getCars(5));
            } else {
                model.addAttribute("cars", carService.getCars(count));
            }
            return "cars";
        }
    }

