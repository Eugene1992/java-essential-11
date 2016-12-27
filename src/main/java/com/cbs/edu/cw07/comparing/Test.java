package com.cbs.edu.cw07.comparing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 23, 50000, Employee.Gender.MALE);
        Employee emp2 = new Employee("Anna", 17, 14000, Employee.Gender.FEMALE);
        Employee emp3 = new Employee("Maksim", 53, 132000, Employee.Gender.MALE);
        Employee emp4 = new Employee("Egor", 67, 12000, Employee.Gender.MALE);
        Employee emp5 = new Employee("Galina", 26, 73000, Employee.Gender.FEMALE);
        Employee emp6 = new Employee("Tanya", 32, 47000, Employee.Gender.FEMALE);
        Employee emp7 = new Employee("Rostislav", 18, 5000, Employee.Gender.MALE);
        Employee emp8 = new Employee("Mark", 45, 33000, Employee.Gender.MALE);
        Employee emp9 = new Employee("Lena", 65, 40000, Employee.Gender.FEMALE);
        Employee emp10 = new Employee("Artem", 54, 7000, Employee.Gender.MALE);

        List<Employee> employees = asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);

        System.out.println(employees);

//        Collections.sort(employees);
//        EmployeeByAgeComparator comparator = new EmployeeByAgeComparator();

        Comparator<Employee> bySalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee first, Employee second) {
                return first.getSalary() - second.getSalary();
            }
        };

        sort(employees, bySalary);

        System.out.println(employees);

        Comparator<Employee> byAge = new Comparator<Employee>() {
            @Override
            public int compare(Employee first, Employee second) {
                return first.getAge() - second.getAge();
            }
        };

        sort(employees, byAge);

        System.out.println(employees);
    }

    public static void sort(List<Employee> list, Comparator<Employee> comparator) {
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                    Employee t = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, t);
                }
            }
        }
    }
}
