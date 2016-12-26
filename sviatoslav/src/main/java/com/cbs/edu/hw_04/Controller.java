package com.cbs.edu.hw_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public class Controller {

    private IEmployeeDAO iEmployeeDAO = new EmployeeDAOImpl();

    public Controller() {
    }

    private void hadleRequaste(String req) {

        System.out.println("Welcome to Employee CRUD 1.0!");
        while (req.equals("exit")) {
            System.out.println("\nChoose your option or press 'exit' to sign out:" +
                    "\n1) add" +
                    "\n2) get()" +
                    "\n3) update()" +
                    "\n4) delete()" +
                    "\n5) getAll()\n");
            switch (req) {
                case "1":
                    iEmployeeDAO.add(new Employee("Bob", 25, 15000));
                    break;
            }
        }
    }

    public void startListener() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String req = br.readLine();
        hadleRequaste(req);
    }
}



