package com.cokreates.solid.ocp.violate;

public class CalculateArea {
    public static double rectangle(Rectangle rectangle){
        return rectangle.getLength()* rectangle.getWidth();
    }
    public static double circle(Circle circle){
        return (22/7) * circle.getRadius() * circle.getRadius();
    }
}
