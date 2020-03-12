package com.cokreates.designpattern.decoratorpattern;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBoarder();
    }

    private void setRedBoarder() {
        System.out.println("Set Boarder: RED");
    }
}
