package com.cbs.edu.hw_04;

import java.util.ArrayList;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public interface IEmployeeDAO {
    void add(Employee employee);
    void update(Employee employee, int id);
    void delete(int id);
    String get(int id);
    void getAll(Employee... employee);
}