package com.example.demo.controlers;

import com.example.demo.models.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getAll")
    public String getAll(Model model){
        List<Car> cars = carService.getAll();
        model.addAttribute("cars", cars);
        return "mycars";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Car> getOne(Integer Id){
        return carService.getOne(Id);
    }

    @PostMapping("/addNew")
    public String addNew(Car car){
        carService.addNew(car);
        return "redirect:/cars/getAll";
    }

    @RequestMapping("/update")
    public String update(Car car){
        carService.update(car);
        return "redirect:/cars/getAll";

    }


}
