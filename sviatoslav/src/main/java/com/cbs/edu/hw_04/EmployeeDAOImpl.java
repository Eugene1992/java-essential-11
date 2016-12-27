package com.cbs.edu.hw_04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public class EmployeeDAOImpl implements IEmployeeDAO {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeDAOImpl() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void update(int id, Employee employee) {
        employees.set(id, employee);
    }

    @Override
    public void delete(int id) {
        employees.remove(id);
    }

    @Override
    public Employee get(int id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }
}
