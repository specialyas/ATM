package com.yas;_

import java.util.ArrayList;
import java.util.Scanner;

public class AtmFunctionalities {

    // Constants
    private static final int MAX_TRANSACTIONS = 5;

    float balance;
    int pin = 1234;
    String nairaSymbol = "₦";

    static ArrayList<String> transactions = new ArrayList<>(); // Transaction history


    public void start(){
        System.out.print("Enter your Pin: ");
         Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();

        // check if pin is correct
        if (enterPin == pin) {
            System.out.println("\nWelcome...!");
            menu();
        }else {
            System.out.println("You entered the wrong pin!!! \n Try Again...");
            start();
        }
    }

    // menu options
    private void menu() {
        System.out.println("\nWelcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. View Mini Statement");
        System.out.println("5. Exit");
        System.out.print("Please choose an option (1-4): \n");


        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                checkAccountBalance();
                menu();
                break;
            case 2:
                depositMoney();
                menu();
                break;
            case 3:
                withdrawMoney();
                menu();
                break;
            case 4:
                miniStatement();
                menu();
                break;
            case 5:
                exit();
                break;
            default:
                System.out.println("Invalid entry!!! Select from option 1-4\n");
                menu();
        }
    }

    // check account balance
    private void checkAccountBalance() {
        System.out.println("Your current balance is: " + nairaSymbol + balance + "\n");
        addTransaction(transactions, "Checked balance: " + nairaSymbol + balance);
    }

    // Deposit money
    private void depositMoney() {
        System.out.print("Enter amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float depositAmount = sc.nextFloat();

        // confirm the deposit amount is valid
        if (depositAmount > 0) {
            balance += depositAmount;
            //   System.out.println("Deposit Successful....\n");
            System.out.println("Successfully deposited " + nairaSymbol  + depositAmount);
            addTransaction(transactions, "Deposited: " + nairaSymbol + depositAmount);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    // exit the program
    private void exit(){
        System.out.println("Are you sure you want to exit? (Yes or No)");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.equalsIgnoreCase("yes")) {
            System.out.println("Thank you for banking with us.....");
            sc.close();
        }else {
            menu();
        }
    }

    // withdraw money
    private void withdrawMoney() {
        System.out.print("Enter Amount you want to withdraw: " );
        Scanner sc = new Scanner(System.in);
        float withdrawAmount = sc.nextFloat();

        // confirm the withdrawal amount is valid
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Successfully withdrew " + nairaSymbol + withdrawAmount);
            System.out.println("New balance: " + nairaSymbol  + balance);
            addTransaction(transactions, "Withdrew: " + nairaSymbol + withdrawAmount);
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient funds. Current balance: " + nairaSymbol  + balance);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }

    }

    private static void miniStatement(){
        System.out.println("Mini Statement (Last " + MAX_TRANSACTIONS + " transactions):");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // add transaction to list
    private static void addTransaction(ArrayList<String> transactions, String transaction) {
        if (transactions.size() == MAX_TRANSACTIONS) {
            transactions.removeFirst();  // Remove the oldest transaction when the list is full
        }
        transactions.add(transaction);
    }
}
