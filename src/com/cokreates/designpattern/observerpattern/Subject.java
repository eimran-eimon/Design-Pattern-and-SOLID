package com.cokreates.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

// Subject is an object having methods to attach and detach observers to a client object.
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer: observers){
            observer.update();

        }
    }




}
