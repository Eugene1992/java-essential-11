package com.cbs.edu.cw04.interfaces.one.readers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReader implements IReader {

    public String read() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        InputStream inputStream = new FileInputStream("C:\\Users\\Evgeniy\\IdeaProjects\\java-essential-11\\src\\main\\java\\com\\cbs\\edu\\cw04\\interfaces\\textFile");
        while (inputStream.available() > 0) {
            stringBuilder.append((char)inputStream.read());
        }
        inputStream.close();
        return stringBuilder.toString();
    }
}
