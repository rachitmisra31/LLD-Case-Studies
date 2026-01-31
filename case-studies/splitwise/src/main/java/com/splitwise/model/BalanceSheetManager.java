package com.splitwise.model;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheetManager {

    private Map<User, Map<User, Double>> balanceSheet = new HashMap<>();
    public void addExpense(Expense expense) {
        User paidBy = expense.getPaidBy();

        for(Map.Entry<User,Double> entryMap : expense.getSplits().entrySet()){
            User owedBy = entryMap.getKey();
            Double amount = entryMap.getValue();

            if(!paidBy.equals(owedBy)){
                balanceSheet.putIfAbsent(owedBy, new HashMap<>());
                double currOwe = balanceSheet.get(owedBy).getOrDefault(paidBy, 0.0);
                balanceSheet.get(owedBy).put(paidBy, currOwe + amount);

                balanceSheet.putIfAbsent(paidBy, new HashMap<>());
                double currReverse = balanceSheet.get(paidBy).getOrDefault(owedBy, 0.0);
                balanceSheet.get(paidBy).put(owedBy, currReverse - amount);
            }

        }

    }
    public void showBalances(){
        boolean hasBalances = false;
        for(Map.Entry<User, Map<User, Double>> entry : balanceSheet.entrySet()){
            User owedBy = entry.getKey();
            Map<User, Double> balances = entry.getValue();

            for(Map.Entry<User, Double> balanceEntry : balances.entrySet()){
                User paidTo = balanceEntry.getKey();
                Double amount = balanceEntry.getValue();
                if(amount > 0){
                    System.out.println(owedBy.getName() + " ows" + paidTo.getName() + " " + amount);
                    hasBalances = true;
                }
            }
        }
        if(!hasBalances){
            System.out.println("No balances found");
        }
    }
    public void clearBalances(){
        balanceSheet.clear();
    }

    public void settleUp(User user){

        if(!balanceSheet.containsKey(user)){
            System.out.println(user.getEmail()+" has no balances to settle");
            return;
        }
        Map<User, Double> balances = balanceSheet.get(user);
        for(User otherUser : balances.keySet()){
            double amount = balances.get(otherUser);
            if(amount > 0){
                System.out.println(user.getName() + " settled up with " + otherUser.getName() + " for amount" + amount);
                balances.put(otherUser, 0.0);
                if(balanceSheet.containsKey(otherUser)){
                    balanceSheet.get(otherUser).put(otherUser, 0.0);
                }
            }
        }
    }
}