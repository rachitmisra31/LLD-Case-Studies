package com.splitwise.model;

import java.util.Map;

public class Expense {

    private int expenseId;
    private User paidBy;
    private Double amount;
    private String description;
    private Map<User, Double>splits;

    public Expense(int expenseId, User paidBy, Double amount, String description, Map<User, Double> splits) {
        this.expenseId = expenseId;
        this.paidBy = paidBy;
        this.amount = amount;
        this.description = description;
        this.splits = splits;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public Double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public Map<User, Double> getSplits() {
        return splits;
    }
}