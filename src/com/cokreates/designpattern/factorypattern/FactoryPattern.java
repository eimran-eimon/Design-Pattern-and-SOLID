package com.cokreates.designpattern.factorypattern;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get the corresponding draw method for circle
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        circleShape.draw();

        // get the corresponding draw method for rectangle
        Shape rectShape = shapeFactory.getShape("RECTANGLE");
        rectShape.draw();

    }
}
