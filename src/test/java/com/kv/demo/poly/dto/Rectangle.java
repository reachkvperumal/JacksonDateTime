package com.kv.demo.poly.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Rectangle extends Shape {
    private double width;
    private double height;
}
