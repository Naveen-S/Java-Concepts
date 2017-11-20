package com.naveen;

import java.util.ArrayList;

/**
 * Created by naveen on 19/11/17.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public void showBranches() {
        System.out.println("Branches in this " + name);
        for (Branch branch: branches) {
            System.out.println( branch.getName() );
        }
    }

    public void addBranch(String name){
        Branch branch = new Branch(name);
        branches.add(branch);
        System.out.println("New branch " + name + " was successfully added.");
    }

    private Branch getBranch(String name) {
        for (Branch branch: branches) {
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }

    public void addCustomer(String branchName, String customerName){
        Branch branch = getBranch(branchName);
        if(branch != null) {
            System.out.println("New customer " + customerName + " was added to " + branchName);
            branch.addCustomer(customerName);
        }else {
            System.out.println("Branch not found.");
        }
    }

    public void addTransactions( String branchName, String customerName, double transaction) {
        Branch branch = getBranch(branchName);
        if(branch != null) {
            branch.addTransaction(customerName, transaction);
        }
        else {
            System.out.println("Given branch doesn't exist.");
        }
    }

    public void showCustomers(String branchName) {
        Branch branch = getBranch(branchName);
        if(branch != null) {
            System.out.println("Customer for branch " + branchName);
            branch.getCustomers();
        }
        else {
            System.out.println("Branch doesn't exist ");
        }
    }
}
