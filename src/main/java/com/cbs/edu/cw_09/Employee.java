package com.cbs.edu.cw_09;

public class Employee implements Cloneable {

    private String name;
    private int salary;
    private int age;
    private Department department;
    private static int COUNTER = 0;

    public Employee() {
    }

    public Employee(String name, int salary, int age, Department department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    // Alt + Insert -> toString
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", age=" + department +
                '}';
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); // shallow
        return new Employee(name, salary, age, new Department(department.getName())); // deep
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(COUNTER++ + " I'm die...");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        if (salary != employee.salary) return false;
        if (age != employee.age) return false;
        if (name != null) {
            if (!name.equals(employee.name)) {
                return false;
            }
        } else {
            if (employee.name != null) {
                return false;
            }
        }
        return department != null ? department.equals(employee.department) : employee.department == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + salary;
        result = 31 * result + age;
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }
}
