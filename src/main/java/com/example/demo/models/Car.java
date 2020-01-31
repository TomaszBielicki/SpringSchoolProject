package com.example.demo.models;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ToString
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String mark;
    private String model;
    private String color;

    public Car(){

    }

    public Car(Integer Id, String mark, String model, String color){
        this.Id=Id;
        this.mark=mark;
        this.model=model;
        this.color=color;
    }

    public Integer getId() {
        return Id;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public String getColor() {
        return color;
    }

}



