package com.cokreates.solid.ocp.maintained;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculatedArea() {
        return (22/7.00) * radius * radius;

    }
}
