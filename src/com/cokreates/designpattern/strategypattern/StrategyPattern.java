package com.cokreates.designpattern.strategypattern;

public class StrategyPattern {
    public static void main(String[] args) {
        // ADD
        Context contextAdd = new Context(new AddOperation());
        System.out.println("Add result: " + contextAdd.exec(5,10));
        // Multiply
        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println("Multiply result: " + contextMultiply.exec(5,10));
    }

}
