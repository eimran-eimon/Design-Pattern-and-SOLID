package com.cokreates.designpattern.decoratorpattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRect = new RedShapeDecorator(new Rectangle());
        System.out.println("Normal Shapes: ");
        circle.draw();
        System.out.println("Decorator Shapes: ");
        redCircle.draw();
        redRect.draw();

    }
}
