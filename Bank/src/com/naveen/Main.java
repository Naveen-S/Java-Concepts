/*
* This Program explains the autoboxing and unboxing along with
* basic use of ArrayList.
* To know only about Autoboxing and unboxing refer Customer.java file.
*
* This Program simulate the bank with a lot of branches with n number of customers
* where each customers transactions is stored as a double in arrayList using
* autoboxing and unboxing to store and retrieve.
*
* */

package com.naveen;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Bank bank = new Bank("citi");

    public static void main(String[] args) {
        // write your code here
        boolean flag = false;

        while (!flag) {
            printOptions();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printOptions();
                    break;

                case 2:
                    showBranches();
                    break;

                case 3:
                    addBranch();
                    break;

                case 4:
                    addCustomer();
                    break;

                case 5:
                    addTransaction();
                    break;

                case 6:
                    showCustomers();
                    break;

                case 7:
                    flag = true;
                    break;
            }
        }
    }

    static void printOptions() {
        System.out.println(
                "\n 1: to show options \n" +
                " 2: to show  all branch\n" +
                " 3: to add new branch\n"+
                " 4: to add a new customer \n" +
                " 5: to add a new transaction\n" +
                " 6: to show all customers\n"+
                " 7: quit application\n"
        );
    }

    static void addBranch() {
        System.out.println("Enter Branch name ");
        String branchName = scanner.nextLine();
        System.out.println("Adding new branch " + branchName);
        bank.addBranch(branchName);
    }

    static void addCustomer() {
        System.out.println("Enter Branch name ");
        String branchName = scanner.nextLine();
        System.out.println("Enter Customer name ");
        String customerName = scanner.nextLine();
        bank.addCustomer(branchName, customerName);
    }

    static void addTransaction() {
        System.out.println("Enter Branch name ");
        String branchName = scanner.nextLine();
        System.out.println("Enter Customer name ");
        String customerName = scanner.nextLine();
        System.out.println("Enter transaction amount");
        double transaction = scanner.nextDouble();
        bank.addTransactions(branchName, customerName, transaction);
    }

    static void showBranches() {
        bank.showBranches();
    }

    static void showCustomers() {
        System.out.println("Enter Branch name ");
        String branchName = scanner.nextLine();
        bank.showCustomers(branchName);
    }

}
