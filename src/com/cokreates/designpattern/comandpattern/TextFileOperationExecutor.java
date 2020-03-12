package com.cokreates.designpattern.comandpattern;

// invoker component
public class TextFileOperationExecutor {
    public String executeOperation(TextFileOperation textFileOperation){
        return textFileOperation.execute();
    }
}
