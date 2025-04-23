public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(41029, "John", 12000);
        account1.deposit(5000.50f);
        account1.withdraw(8000.75f);

        BankAccount account2 = new BankAccount(41030, "Nadeem", 400000);
        account2.deposit(500000.00f);
        account2.withdraw(8000.75f);

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

    // non-static = belonging to object
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
