package com.cbs.edu.cw01;

public class OopTest {
    public static void main(String[] args) {

        String empOneName = "Taras";
        int empOneSalary = 10000;
        Employee empOne = new Employee();
        empOne.name = empOneName;
        empOne.salary = empOneSalary;

        String empTwoName = "Sasha";
        int empTwoSalary = 40000;
        Employee empTwo = new Employee();
        empTwo.name = empTwoName;
        empTwo.salary = empTwoSalary;

        String empThreeName = "Slava";
        int empThreeSalary = 30000;
        Employee empThree = new Employee();
        empThree.name = empThreeName;
        empThree.salary = empThreeSalary;

        Employee[] employees = {empOne, empTwo, empThree};
        System.out.println(getRichestEmp(employees).name);
    }

    static Employee getRichestEmp(Employee[] employees) {
        int maxSalary = employees[0].salary;
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.salary > maxSalary) {
                result = employee;
                maxSalary = employee.salary;
            }
        }
        return result;
    }
}
