package org.example;

public class Hourly extends Employee{
    private double hourlyRate;
    private double hours;

    public Hourly() {
    }

    public Hourly(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPay() {
        return super.getPay();
    }
    public void  addHours (double hours){
        this.hours =+ hours;
    }
}
