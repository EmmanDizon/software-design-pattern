package com.emman;

public abstract class AbstractTaxCalculator implements ITaxCalculator {

    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
