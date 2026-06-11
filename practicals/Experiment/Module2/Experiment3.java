import java.util.Scanner;

class BankAccount {
    public double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
    public double calculateInterest(double principal, double rate) {
        return (principal * rate * 1) / 100; // default time 1 year
    }
}

public class Experiment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();
        
        BankAccount ba = new BankAccount();
        double interest = ba.calculateInterest(p, r, t);
        
        System.out.println("Simple Interest: " + (int)interest);
        
        sc.close();
    }
}