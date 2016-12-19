package com.cbs.edu.cw01;

public class ProcTest {
    public static void main(String[] args) {
        String empOneName = "Taras";
        int empOneSalary = 10000;

        String empTwoName = "Sasha";
        int empTwoSalary = 40000;

        String empThreeName = "Slava";
        int empThreeSalary = 30000;

        if (empOneSalary > empTwoSalary && empOneSalary > empThreeSalary) {
            System.out.println(empOneName);
        } else if (empTwoSalary > empOneSalary && empTwoSalary > empThreeSalary) {
            System.out.println(empTwoName);
        } else {
            System.out.println(empThreeName);
        }

        String[] empNames = {empOneName, empTwoName, empThreeName};
        int[] empSalaries = {empOneSalary, empTwoSalary, empThreeSalary};

        System.out.println(empNames[getRichestEmpNameIndex(empSalaries)]);
    }

    static int getRichestEmpNameIndex(int[] empSalaries) {
        int max = empSalaries[0];
        int maxIndex = 0;
        for (int i = 0; i < empSalaries.length; i++) {
            if (empSalaries[i] > max) {
                maxIndex = i;
                max = empSalaries[i];
            }
        }
        return maxIndex;
    }
}
