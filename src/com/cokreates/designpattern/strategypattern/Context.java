package com.cokreates.designpattern.strategypattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int exec(int num_1, int num_2){
        return strategy.doOperation(num_1, num_2); //change the operation accordingly
    }
}
