import java.util.Scanner;
class UserAccount
{
    private double balance;
    public UserAccount(double initialBalance)
    {
        this.balance=initialBalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void Deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        if (amount > balance)
        {
            System.out.println("Insufficient balance!!Withdrawal failed.");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdrawal successful!! Remaining balance: " + balance);
        }
    }
}

class ATM {
    private final UserAccount user;

    public ATM(UserAccount account)
    {
        this.user = account;
    }
    public void Deposit(double amount) {
        if (amount > 0) {
            user.Deposit(amount);
            System.out.println("Deposit successful. New balance: " + user.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            user.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }



    public void checkBalance() {
        System.out.println("Current balance: " + user.getBalance());
    }
}
public class Main1
{
    public static void main(String[] args)
    {

      UserAccount user = new UserAccount(1000);
        ATM atm =new ATM(user);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n**Welcome to Your bank Account**");
        System.out.println("Please enter password::");
        int password = scanner.nextInt();
        if(password==220104)
        {

        while (true)
        {

            System.out.println("1. Deposit amount");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be deposited ");
                    double depositAmount = scanner.nextDouble();
                    atm.Deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to be withdraw ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
       }
        else
        {
            System.out.println("Wrong password!!!please try later");
        }
    }

}
