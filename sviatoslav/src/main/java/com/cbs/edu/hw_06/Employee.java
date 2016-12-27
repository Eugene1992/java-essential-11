package com.cbs.edu.hw_06;

/**
 * Created by Sviatoslav on 27.12.2016.
 */
public class Employee {
    private String firstName;
    private String sureName;
    private int age;
    private int salary;
    private String position;
    private String sex;
    private String residency;

    public static class EmployeeBuilder{
        private String firstName;
        private String sureName;
        private int age;
        private int salary;
        private String position;
        private String sex;
        private String residency;

        public EmployeeBuilder(String firstName, String sureName, String position) {
            this.firstName = firstName;
            this.sureName = sureName;
            this.position = position;
        }

        public EmployeeBuilder age(int age){
            this.age = age;
            return this;
        }

        public EmployeeBuilder salary(int salary){
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder sex(String sex){
            this.sex = sex;
            return this;
        }

        public EmployeeBuilder residency(String residency){
            this.residency = residency;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

   public Employee(EmployeeBuilder employeeBuilder){
       this.firstName = employeeBuilder.firstName;
       this.sureName = employeeBuilder.sureName;
       this.age = employeeBuilder.age;
       this.salary = employeeBuilder.salary;
       this.position = employeeBuilder.position;
       this.sex = employeeBuilder.sex;
       this.residency = employeeBuilder.residency;
   }
}
