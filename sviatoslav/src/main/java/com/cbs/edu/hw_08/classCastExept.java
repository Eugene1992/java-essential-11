package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class classCastExept {
    static class Employee{
        public Employee() {
        }
    }

    class Manager extends Employee{
        public Manager() {
        }
    }

    public static void main(String[] args) throws ClassCastException{
        Manager manager = (Manager) new Employee();
    }
}
