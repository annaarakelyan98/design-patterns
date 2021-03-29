package com.design_patterns.creational.factory.by_interface.shape_create;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method!");
    }
}
