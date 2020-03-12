package com.cokreates.designpattern.observerpattern;

public class HexObserver extends Observer {

    public  HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println( "HEX String: " + Integer.toHexString(subject.getState()));
    }
}
