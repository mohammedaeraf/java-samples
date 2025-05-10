package com.smartech.finance.appx.sales;

public class Invoice {
    public double amount;
    public String customerName;
    public double payment;

    public Invoice(double amount, String name, double payment) {
        this.amount = amount;
        this.customerName = name;
        this.payment = payment;
    }

    public void display() {
        System.out.println("***** Invoice #205 *****");
        System.out.println("Customer Name " + this.customerName);
        System.out.println("Amount " + this.amount);
        System.out.println("Payment " + this.payment);
    }
}
