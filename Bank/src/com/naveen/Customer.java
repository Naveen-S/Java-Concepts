package com.naveen;

import java.util.ArrayList;

/**
 * Created by naveen on 19/11/17.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
        this.transactions.add(0.00);
    }

    public void addTransaction(Double transaction){
        this.transactions.add(Double.valueOf(transaction));
        System.out.println("New transaction of " + transaction + " added. ");
    }

    public void displayTransaction(){
        for (Double transaction: transactions) {
            System.out.println(transaction.doubleValue());
        }
    }

    public String getName() {
        return name;
    }
}
