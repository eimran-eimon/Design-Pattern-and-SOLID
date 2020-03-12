package com.cokreates.designpattern.comandpattern;

//command component
public class SaveTextFIle implements TextFileOperation {
    private TextFile textFile;

    public SaveTextFIle(TextFile textFile) {
        this.textFile = textFile;
    }
    @Override
    public String execute() {
        return textFile.save();
    }
}
