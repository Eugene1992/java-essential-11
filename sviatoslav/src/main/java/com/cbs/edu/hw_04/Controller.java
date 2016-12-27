package com.cbs.edu.hw_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public class Controller {

    private IEmployeeDAO iEmployeeDAO = new EmployeeDAOImpl();
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Controller() {
    }

    private void handleRequest(String req) throws IOException {
        switch (req) {
            case "1":
                iEmployeeDAO.add(getEmp());
                System.out.println("Congratulation, added new employee!:)");
                break;

            case "2":
                Employee emp = iEmployeeDAO.get(getID());
                System.out.println(emp.getName() + " "
                        + emp.getAge() + " "
                        + emp.getSalary());
                break;

            case "3":
                iEmployeeDAO.update(getID(), getEmp());
                System.out.println("Employee was updated!");
                break;

            case "4":
                iEmployeeDAO.delete(getID());
                System.out.println("Employee was deleted");
                break;

            case "5":
                for (Employee employee : iEmployeeDAO.getAll()) {
                    System.out.println(employee.getName() + " "
                            + employee.getAge() + " "
                            + employee.getSalary());
                }
                break;
            default:
                System.out.println("Incorrect number");
        }
    }

    public void startListener() throws IOException {
        boolean check = true;
        System.out.println("Welcome to Employee CRUD 1.0!");
        while (check) {
            System.out.println("\nChoose your option or press 'exit' to sign out:" +
                    "\n1) add" +
                    "\n2) get()" +
                    "\n3) update()" +
                    "\n4) delete()" +
                    "\n5) getAll()\n");
            String req = br.readLine();
            if (req.equals("exit")) {
                check = false;
            } else {
                handleRequest(req);
            }
        }
    }

    private Employee getEmp() throws IOException {
        System.out.println("Enter name: ");
        String name = br.readLine();
        int age = 0;
        int salary = 0;
        try {
            System.out.println("Enter age: ");
            age = Integer.parseInt(br.readLine());
            System.out.println("Enter Salary: ");
            salary = Integer.parseInt(br.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value! Try again!");
            startListener();
        }
        return new Employee(name, age, salary);
    }

    private int getID() throws IOException {
        System.out.println("Enter ID: ");
        return Integer.parseInt(br.readLine());
    }
}



