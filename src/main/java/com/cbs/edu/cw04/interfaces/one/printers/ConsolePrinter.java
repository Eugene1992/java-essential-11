package com.cbs.edu.cw04.interfaces.one.printers;

import java.io.Serializable;

public class ConsolePrinter implements IPrinter, Serializable {

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    public void f(){

    }
}
