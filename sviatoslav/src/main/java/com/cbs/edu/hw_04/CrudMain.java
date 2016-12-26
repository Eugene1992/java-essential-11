package com.cbs.edu.hw_04;

import java.io.IOException;

/**
 * Created by Sviatoslav on 25.12.2016.
 */
public class CrudMain {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        controller.startListener();
    }
}
