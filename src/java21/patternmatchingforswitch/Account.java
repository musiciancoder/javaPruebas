package java21.patternmatchingforswitch;


/*
Pattern matching for switch statements, initially introduced in JDK 17, has been refined in Java 211
. This feature allows patterns in switch case labels, improving the expressiveness of switch statements and expressions
 */
public class Account {
    double getBalance() {
        return 0;
    }
}

class SavingsAccount extends Account {
    double getSavings() {
        return 100;
    }
}

class TermAccount extends Account {
    double getTermAccount() {
        return 1000;
    }
}

class CurrentAccount extends Account {
    double getCurrentAccount() {
        return 10000;
    }
}

 class PatternMatchingExample {
    public static double getBalanceWithSwitchPattern(Account account) {
        return switch (account) {
            case SavingsAccount sa -> sa.getSavings();
            case TermAccount ta -> ta.getTermAccount();
            case CurrentAccount ca -> ca.getCurrentAccount();
            default -> 0;
        };
    }

    public static void main(String[] args) {
        Account sa = new SavingsAccount();
        Account ta = new TermAccount();
        Account ca = new CurrentAccount();

        System.out.println("Savings Account Balance: " + getBalanceWithSwitchPattern(sa)); // Output: 100
        System.out.println("Term Account Balance: " + getBalanceWithSwitchPattern(ta));     // Output: 1000
        System.out.println("Current Account Balance: " + getBalanceWithSwitchPattern(ca));  // Output: 10000
    }
}
