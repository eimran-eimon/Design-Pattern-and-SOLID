package com.cokreates.solid.ocp.maintained;

public class Calculate {
    public static void main(String[] args) {
        Circle circle =  new Circle(11);
        System.out.println("Circle: " + circle.calculatedArea());
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Rectangle: " + rectangle.calculatedArea());
    }
}
