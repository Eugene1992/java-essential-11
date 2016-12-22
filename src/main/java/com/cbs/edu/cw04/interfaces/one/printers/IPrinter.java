package com.cbs.edu.cw04.interfaces.one.printers;

import java.io.IOException;

public interface IPrinter {

    public final static int S = 10;

    public abstract void print(String string) throws IOException;
}
