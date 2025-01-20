package com.kv.demo.poly.dto;

import lombok.Data;


@Data
public class Vehicle {
    String category;

    public Vehicle(String type) {
        this.category = type;
    }
}
