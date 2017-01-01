package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class ClassCastExept {
    static class Employee {
        public Employee() {
        }
    }

    class Manager extends Employee {
        public Manager() {
        }
    }

    public static void main(String[] args) {
        try {
            Manager manager = (Manager) new Employee();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
