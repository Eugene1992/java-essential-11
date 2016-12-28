package com.cbs.edu.cw08;

import java.io.*;

public class CheckedTest {
    public static void main(String[] args) {
        File file = null;
        FileOutputStream stream = null;
        try {
            file = new File("D:/text.xsdadasdml");
            stream = new FileOutputStream(file);
            stream.write(77);
        }
        catch (FileNotFoundException e) {
            File newFile = new File("D:/text2.txt");
            try {
                stream = new FileOutputStream(newFile);
                try {
                    stream.write(33);
                }
                catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
