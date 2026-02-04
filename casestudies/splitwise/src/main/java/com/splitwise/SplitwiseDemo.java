package casestudies.splitwise.src.main.java.com.splitwise;

import casestudies.splitwise.src.main.java.com.splitwise.model.BalanceSheetManager;
import casestudies.splitwise.src.main.java.com.splitwise.model.Expense;
import casestudies.splitwise.src.main.java.com.splitwise.model.User;

import java.util.HashMap;
import java.util.Map;

public class SplitwiseDemo {

    public static void main(String[] args) {
        User rachit = new User("122321","Rachit", "abc@xyz.com","87321");
        User sakshi = new User("32121", "Sakshi", "xyz@abc.com","88731");

        Map<User, Double> splits = new HashMap<User, Double>();
        splits.put(rachit, 5000.0);
        splits.put(sakshi, 5000.0);

        Expense expense = new Expense(2312,rachit,10000.0, "Hospital Bill", splits);
        BalanceSheetManager manager = new BalanceSheetManager();
        manager.addExpense(expense);

        System.out.println("----Before Settle up----");
        manager.showBalances();

        manager.settleUp(sakshi);

        System.out.println("----After Settle up----");
        manager.showBalances();
    }

}