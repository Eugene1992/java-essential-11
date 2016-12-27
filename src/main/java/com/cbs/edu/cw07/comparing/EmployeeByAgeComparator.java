package com.cbs.edu.cw07.comparing;

import java.util.Comparator;

public class EmployeeByAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee first, Employee second) {
        return first.getAge() - second.getAge();
    }
}
