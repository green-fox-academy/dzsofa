package com.greenfox.orientationpractice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licence_plates")
public class Car {
    @Id
    private String plate;

    @Column(name = "car_brand")
    @JsonProperty(value = "car_brand")
    private String brand;

    @Column(name = "car_model")
    @JsonProperty(value = "car_model")
    private String model;
    private String color;
    private int year;


    public Car(String plate, String brand, String model, String color, int year) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car() {
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
