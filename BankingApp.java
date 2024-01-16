import java.util.Scanner;

class CustomerAccount {
    private double accountBalance;

    public CustomerAccount(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void makeDeposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposit successful. Current balance: " + accountBalance);
    }

    public boolean makeWithdrawal(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + accountBalance);
            return true;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }
    }
}

public class BankingApp {
    private CustomerAccount customer;

    public BankingApp(CustomerAccount customer) {
        this.customer = customer;
    }

    public void displayBankMenu() {
        System.out.println("Banking Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void executeTransaction(int choice) {
        Scanner inputScanner = new Scanner(System.in);

        switch (choice) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = inputScanner.nextDouble();
                customer.makeWithdrawal(withdrawalAmount);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = inputScanner.nextDouble();
                customer.makeDeposit(depositAmount);
                break;

            case 3:
                System.out.println("Current balance: " + customer.getAccountBalance());
                break;

            case 4:
                System.out.println("Exiting banking application. Thank you!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter initial account balance: ");
        double initialBalance = inputScanner.nextDouble();

        CustomerAccount userAccount = new CustomerAccount(initialBalance);
        BankingApp bankingApp = new BankingApp(userAccount);

        while (true) {
            bankingApp.displayBankMenu();
            System.out.print("Choose an option (1-4): ");
            int userChoice = inputScanner.nextInt();

            bankingApp.executeTransaction(userChoice);
        }
    }
}
