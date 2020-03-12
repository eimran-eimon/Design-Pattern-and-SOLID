package com.cokreates.designpattern.factorypattern;

public class ShapeFactory {
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }
        // create circle object
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        // create rectangle object
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }

        //TODO: Add other shape types, if needed.
        return null;
    }
}
