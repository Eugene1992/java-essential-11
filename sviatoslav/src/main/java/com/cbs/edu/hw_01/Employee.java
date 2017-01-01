package com.cbs.edu.hw_01;

/**
 *      This class create new employee with name,  position and salary fields, also include some getters,
 *   one constructor for creating link at object and method which can compare our employees fot their salary.
 *
 * @author Sviatoslav
 * @version 1.0
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private String position;
    private int salary;

    /**
     * Constructor for create link at object Employee.
     * @param name - name of our new employee;
     * @param position - position where he will working
     * @param salary - him salary;
     */
    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
     *
     * @return name of employee;
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return position of employee;
     */
    public String getPosition() {
        return position;
    }

    /**
     *
     * @return salary of employee;
     */
    public int getSalary() {
        return salary;
    }



    /**
     * @param emp - passed employee for comparing their salary
     * @return -1, 0 , 1 - depending on the salary; if salary < this.salary return -1 ;
     *          if 0 - then both salary are equal;
     *          if 1 - then salary > this.salary;
     */
    public int compareTo(Employee emp) {
        return emp.getSalary() - this.getSalary();
    }

}

