package com.kv.demo.poly.dto;

import lombok.Data;

@Data
public final class Dog extends Animal {
    double decibel;

    public Dog(String name, double decibel) {
        super(name);
        this.decibel = decibel;
    }
}
