package com.example.SpringCloudStorageHackathonDemo;


public class Transaction {

    private String accountNumber;
    private double Balance;
    private double creditDebitAmount;
    private String transactionType;
    private double transactionId;
    private String date;
    private String description;
    private String category;


    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public double getCreditDebitAmount() {
        return creditDebitAmount;
    }

    public void setCreditDebitAmount(double creditDebitAmount) {
        this.creditDebitAmount = creditDebitAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(double transactionId) {
        this.transactionId = transactionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
