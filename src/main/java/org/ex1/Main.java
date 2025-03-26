package org.ex1;

import org.Employee;
import org.EmployeeOffice;
import org.EmployeeOnline;

public class Main {
    public static void main(String[] args) {
        Employee employeeOnline = new EmployeeOnline("Gerard", "Adan", 250);
        printSalary(employeeOnline.getName() + " Online -> ", employeeOnline.calculateSalary(40));

        Employee employeeOffice = new EmployeeOffice("Mari", "Sol", 250);
        printSalary(employeeOffice.getName() + " Office -> ", employeeOffice.calculateSalary(40));
    }

    private static void printSalary(String message, double salary) {
        System.out.println("Total salary " + message + salary);
    }
}