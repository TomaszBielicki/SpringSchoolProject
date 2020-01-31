package com.example.demo.repositores;

import com.example.demo.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {
   // Car findAllById(Integer id);
}
