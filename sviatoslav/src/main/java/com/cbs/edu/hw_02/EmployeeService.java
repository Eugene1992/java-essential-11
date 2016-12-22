package com.cbs.edu.hw_02;

import java.util.ArrayList;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class EmployeeService {

    public static String getSalaryInterval(Department department, int from, int to) {

        for (int i = 0; i < department.getEmp().size(); i++)
            if (department.getEmp().get(i).getSalary() > from && department.getEmp().get(i).getSalary() < to){
                return department.getEmp().get(i).getName() +
                        department.getEmp().get(i).getAge() +
                        department.getEmp().get(i).getSalary();
            }
            return null;
    }
}
