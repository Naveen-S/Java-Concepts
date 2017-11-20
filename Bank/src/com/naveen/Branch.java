package com.naveen;

import java.util.ArrayList;

/**
 * Created by naveen on 19/11/17.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(String name){
        Customer customer = new Customer(name);
        customers.add(customer);
        System.out.println("New customer " + name + " was added to branch" + this.name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        for (Customer name: customers) {
            System.out.println(name.getName());
        }
        return customers;
    }

    private Customer getCustomer(String customerName) {
        for (Customer customer: customers) {
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }

    public void addTransaction(String customerName, double transaction) {
        Customer customer = getCustomer(customerName);
        if(customer != null){
            System.out.println("Adding transaction amount " + transaction + " to customer " + customerName);
            customer.addTransaction(transaction);
        }
        else {
            System.out.println("No customer with name " + customerName + " found") ;
        }
    }

}
