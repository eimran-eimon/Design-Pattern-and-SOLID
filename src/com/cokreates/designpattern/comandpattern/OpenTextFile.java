package com.cokreates.designpattern.comandpattern;

//command component
public class OpenTextFile implements TextFileOperation{
    private TextFile textFile;

    public OpenTextFile(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
