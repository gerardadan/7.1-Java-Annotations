package org.ex2;

import org.Employee;
import org.EmployeeOffice;
import org.EmployeeOnline;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        EmployeeOnline employeeOnline = new EmployeeOnline("Gerard", "Adan", 250);
        printSalary(employeeOnline.getName() + " Online -> ", employeeOnline.calculateSalary(40));
        employeeOnline.calculateTransport(5);
        employeeOnline.calculateDiet(4);

        EmployeeOffice employeeOffice = new EmployeeOffice("Mari", "Sol", 250);
        printSalary(employeeOffice.getName() + " Office -> ", employeeOffice.calculateSalary(40));
        employeeOffice.calculateTransport(5);
        employeeOffice.calculateDiet(5);
    }

    private static void printSalary(String message, double salary) {
        System.out.println("Total salary " + message + salary);
    }
}