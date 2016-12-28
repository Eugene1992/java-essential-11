package com.cbs.edu.cw08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ThrowTest {
    public static void main(String[] args) {
        try {
            writeByte(10);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeByte(int b) throws IOException, FileNotFoundException {
        OutputStream outputStream = new FileOutputStream("D:/text.txt");
        outputStream.write(b);
        outputStream.close();
    }

    public static void j() throws FileNotFoundException {
        throw new IllegalArgumentException();
    }

    public static void f() {
        throw new ArithmeticException();
    }

    public static void g() throws ArithmeticException{
    }
}
