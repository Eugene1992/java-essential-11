package com.cbs.edu.hw_04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public class EmployeeDAOImpl implements IEmployeeDAO {

    private ArrayList<Employee> employees;

    public EmployeeDAOImpl() {
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
    public Employee get(int id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }
}
