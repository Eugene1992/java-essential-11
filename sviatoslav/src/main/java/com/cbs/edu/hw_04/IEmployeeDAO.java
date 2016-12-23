package com.cbs.edu.hw_04;

import java.util.List;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public interface IEmployeeDAO {

    void add(Employee employee);

    void update(Employee employee, int id);

    void delete(int id);

    Employee get(int id);

    List<Employee> getAll();
}