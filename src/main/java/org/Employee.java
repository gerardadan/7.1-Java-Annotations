package org;

public class Employee {
    private final String name;
    private final String lastname;
    private final double priceHour;
    protected static final double FUEL_FEE = 1.5;
    protected static final double DIET_FEE = 10;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Employee(String name, String lastname, double priceHour) {
        this.name = name;
        this.priceHour = priceHour;
        this.lastname = lastname;
    }

    public double calculateSalary(double workedHours) {
        return workedHours * this.priceHour;
    }

    public double calculateTransport(int daysMonthWorked) {
        return DIET_FEE * daysMonthWorked;
    }
}
