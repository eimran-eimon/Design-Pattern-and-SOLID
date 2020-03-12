package com.cokreates.designpattern.facadepattern;

public class facadepattern {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();

    }
}
