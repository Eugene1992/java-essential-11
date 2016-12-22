package com.cbs.edu.cw04.interfaces.one;

import com.cbs.edu.cw04.interfaces.one.printers.ConsolePrinter;
import com.cbs.edu.cw04.interfaces.one.printers.IPrinter;
import com.cbs.edu.cw04.interfaces.one.readers.ConsoleReader;
import com.cbs.edu.cw04.interfaces.one.readers.FileReader;
import com.cbs.edu.cw04.interfaces.one.readers.IReader;

import java.io.IOException;

public class Replacer {

    private IReader reader;
    private IPrinter printer;

    public Replacer(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void replace() throws IOException {
        printer.print(reader.read().replaceAll("=\\)", ":)"));
    }

    public static void main(String[] args) throws IOException {
        IPrinter consolePrinter = new ConsolePrinter();
        IReader consoleReader = new ConsoleReader();

        IReader fileReader = new FileReader();

        Replacer replacer = new Replacer(consoleReader, consolePrinter);

        replacer.replace();
    }
}
