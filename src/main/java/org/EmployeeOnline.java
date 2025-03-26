package org;

public class EmployeeOnline extends Employee {
    private static final double INTERNET_FEE = 40;

    public static double getInternetFee() {
        return INTERNET_FEE;
    }

    public EmployeeOnline(String name, String lastname, double priceHour) {
        super(name, lastname, priceHour);
    }

    public double calculateDiet(int daysMonthWorked) {
        return 2;
    }

    @Override
    public double calculateSalary(double workedHours) {
        return (super.calculateSalary(workedHours) + INTERNET_FEE);
    }

    @Override
    @Deprecated
    public double calculateTransport(int daysMonthWorked) {
        return FUEL_FEE * daysMonthWorked;
    }
}
