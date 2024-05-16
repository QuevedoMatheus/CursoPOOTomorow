package org.example;

public class Salaried extends Employee{

    private double salary;

    public Salaried() {
    }

    public Salaried(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return super.getPay();
    }
}
