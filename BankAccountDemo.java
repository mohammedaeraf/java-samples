public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(41029, "Johb", 12000);
        account.deposit(5000.50f);
        account.withdraw(8000.75f);

    }
}

class BankAccount {
    int accountNumber;
    String holderName;
    float balance;

    // Constructor
    BankAccount(int accNo, String name, float bal) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = bal;
    }

    void deposit(float amount) {
        if (amount < 0) {
            System.out.println("Sorry, amount cannot be negative");
            return;
        }
        this.balance = this.balance + amount;
        System.out.println("You deposited " + amount + " in your account!");
        System.out.println("Your new balance is " + this.balance);
    }

    void withdraw(float amount) {
        if (amount > balance) {
            System.out.println("Sorry, you don't have sufficient funds in your account");
            return;
        }
        System.out.println("You withdrew " + amount + " from your account!");
        this.balance = this.balance - amount;
        System.out.println("Your new balance is " + this.balance);
    }

    int getNewAccountNo() {
        int lastAccountNo = 201; // fetch last account no from DB
        int newAccountNo = ++lastAccountNo;
        return newAccountNo;
    }
}
