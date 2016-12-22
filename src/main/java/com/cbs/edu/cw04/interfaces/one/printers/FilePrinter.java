package com.cbs.edu.cw04.interfaces.one.printers;

import java.io.*;

public class FilePrinter implements IPrinter {

    @Override
    public void print(String string) throws IOException {
        OutputStream inputStream = new FileOutputStream("C:\\Users\\Evgeniy\\IdeaProjects\\java-essential-11\\src\\main\\java\\com\\cbs\\edu\\cw04\\interfaces\\textFile");
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            inputStream.write(aChar);
        }
        inputStream.close();
    }
}
