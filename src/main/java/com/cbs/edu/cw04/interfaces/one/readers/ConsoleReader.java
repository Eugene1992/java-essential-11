package com.cbs.edu.cw04.interfaces.one.readers;

import java.util.Scanner;

public class ConsoleReader implements IReader {

    @Override
    public String read() {
        return new Scanner(System.in).next();
    }
}
