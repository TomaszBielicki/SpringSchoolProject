package com.example.demo.service;

import com.example.demo.models.Car;
import com.example.demo.repositores.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public List<Car> getAll () {
        return (List<Car>) carRepository.findAll();
    }


    public Optional<Car> getOne (Integer Id){
        return carRepository.findById(Id);
    }

    public void addNew(Car car){
        carRepository.save(car);
    }

    public void update(Car car){
        carRepository.save(car);
    }
}
