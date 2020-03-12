package com.cokreates.designpattern.observerpattern;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);

        System.out.println("First State: 10");
        subject.setState(10);
        System.out.println("Second State: 50");
        subject.setState(50);
    }

}
