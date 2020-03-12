package com.cokreates.designpattern.comandpattern;

//command component

// functional interface: contains only one abstract method
// receive lambda expression

// commands encapsulate all the information required
// for opening and saving a text file, including the receiver object, the methods to call.

public interface TextFileOperation {
    String execute();
}
