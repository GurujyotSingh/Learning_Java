import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        
        try {
            if (amount <= 0) {
                throw new Exception("Invalid withdrawal amount");
            }
            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            }
            balance -= amount;
            System.out.println("Transaction Successful");
            System.out.println("Updated Balance: " + balance);
        } catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using ATM");
        }
        sc.close();
    }
}
