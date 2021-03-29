package com.design_patterns.creational.factory.by_interface.shape_create;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method!");
    }
}
