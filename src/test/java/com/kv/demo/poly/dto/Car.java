package com.kv.demo.poly.dto;

import lombok.Data;

@Data
public class Car extends Vehicle {
    String make;

    public Car(String type, String make) {
        super(type);
        this.make = make;
    }
}
