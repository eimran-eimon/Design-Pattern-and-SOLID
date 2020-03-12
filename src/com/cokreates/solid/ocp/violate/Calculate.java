package com.cokreates.solid.ocp.violate;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("RECT: " + CalculateArea.rectangle(new Rectangle(10,20)));
        System.out.println("CIRCLE: " + CalculateArea.circle(new Circle(10)));
    }
}
