package com.cbs.edu.hw_04;

import java.util.ArrayList;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public class EmployeeDAO implements IEmployeeDAO {
    private ArrayList<Employee> employees;

    public EmployeeDAO() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void update(Employee employee, int id) {
        employees.add(id, employee);
    }

    @Override
    public void delete(int id) {
        employees.remove(id);
    }

    @Override
    public String get(int id) {
        String emp = employees.get(id).getName() + " " + employees.get(id).getAge() + " " + employees.get(id).getSalary();
        return emp;
    }

    @Override
    public void getAll(Employee... employee) {
        for (Employee emp : employee) {
            System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getSalary());
        }

    }
}
