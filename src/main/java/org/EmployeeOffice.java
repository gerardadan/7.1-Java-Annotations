package org;

public class EmployeeOffice extends Employee {

    public EmployeeOffice(String name, String lastname, double priceHour) {
        super(name, lastname, priceHour);
    }

    @Override
    public double calculateSalary(double workedHours) {
        return (super.calculateSalary(workedHours) * FUEL_FEE);
    }

    @Deprecated
    public double calculateDiet(int daysMonthWorked) {
        return (super.calculateSalary(DIET_FEE) * FUEL_FEE);
    }
}
