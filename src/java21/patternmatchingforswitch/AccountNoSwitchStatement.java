package java21.patternmatchingforswitch;

public class AccountNoSwitchStatement {
    double getBalance() {
        return 0;
    }
}

class SavingsAccountNoSwitchStatement extends AccountNoSwitchStatement {
    double getSavings() {
        return 100;
    }
}

class TermAccountNoSwitchStatement extends AccountNoSwitchStatement {
    double getTermAccount() {
        return 1000;
    }
}

class CurrentAccountNoSwitchStatement extends AccountNoSwitchStatement {
    double getCurrentAccount() {
        return 10000;
    }
}

 class SwitchPatternAlternativeExample {
    public static double getBalanceWithIfElse(Account account) {
        if (account instanceof SavingsAccount) {  //Con los if se hace mucho mas verboso !!!
            SavingsAccount sa = (SavingsAccount) account;
            return sa.getSavings();
        } else if (account instanceof TermAccount) {
            TermAccount ta = (TermAccount) account;
            return ta.getTermAccount();
        } else if (account instanceof CurrentAccount) {
            CurrentAccount ca = (CurrentAccount) account;
            return ca.getCurrentAccount();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Account sa = new SavingsAccount();
        Account ta = new TermAccount();
        Account ca = new CurrentAccount();

        System.out.println("Savings Account Balance: " + getBalanceWithIfElse(sa)); // Output: 100
        System.out.println("Term Account Balance: " + getBalanceWithIfElse(ta));     // Output: 1000
        System.out.println("Current Account Balance: " + getBalanceWithIfElse(ca));  // Output: 10000
    }
}

