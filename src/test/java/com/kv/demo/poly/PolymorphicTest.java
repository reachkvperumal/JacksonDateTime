package com.kv.demo.poly;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.kv.demo.poly.dto.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PolymorphicTest {
    @Test
    public void testOption1() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.activateDefaultTyping(
                BasicPolymorphicTypeValidator.builder().build(),
                ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        List<Object> vehicle = new ArrayList<>();
        vehicle.add(new Car("Sedan", "Audi"));
        System.out.println(objectMapper.writeValueAsString(vehicle));
    }

    @Test
    public void testOption2() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.activateDefaultTyping(
                BasicPolymorphicTypeValidator.builder().build(),
                ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0d));
        shapes.add(new Rectangle(2.0d, 2.0d));
        System.out.println(objectMapper.writeValueAsString(shapes));

        List<Object> vehicle = new ArrayList<>();
        vehicle.add(new Car("Sedan", "Audi"));
        System.out.println(objectMapper.writeValueAsString(vehicle));
    }

    @Test
    public void testOption3() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.activateDefaultTyping(
                BasicPolymorphicTypeValidator.builder().build(),
                ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        Shape[] shapes = new Shape[]{
                new Circle(2.0d),
                new Rectangle(2.0d, 2.0d)};
        System.out.println(objectMapper.writeValueAsString(shapes));
    }

    @Test
    public void testOption4() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.activateDefaultTyping(
                BasicPolymorphicTypeValidator.builder().build(),
                ObjectMapper.DefaultTyping.NON_FINAL);
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pluto", 3.0d));
        System.out.println(objectMapper.writeValueAsString(dogs));
    }
}
