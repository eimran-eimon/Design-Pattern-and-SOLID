package com.cokreates.designpattern.comandpattern;

public class Client {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        TextFile textFile = new TextFile("file1.txt");
        // passing command objects to the invoker
        String action= textFileOperationExecutor.executeOperation(textFile::save);
        // textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt");
        // textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt");
        System.out.println("Action: " + action);
    }
}
