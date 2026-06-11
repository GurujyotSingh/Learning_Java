import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter transaction type (1-Deposit, 2-Withdraw): ");
        int type = sc.nextInt();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        if (type == 1) {
            balance += amount;
            System.out.println("Transaction Successful");
        } else if (type == 2) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Transaction Successful");
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        System.out.println("Updated Balance: " + balance);
        sc.close();
    }
}
