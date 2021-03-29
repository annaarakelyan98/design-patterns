package com.design_patterns.creational.factory.by_interface;

import com.design_patterns.creational.factory.by_interface.shape_create.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

        shape = shapeFactory.getShape("Square");
        shape.draw();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
    }
}
