import java.util.Scanner;

public class Experiment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter allowances: ");
        double allowances = sc.nextDouble();
        
        double gross = basic + allowances;
        double tax = gross * 0.1; // 10% tax as per sample
        double net = gross - tax;
        
        System.out.println("Gross Salary: " + gross);
        System.out.println("Tax Deduction: " + tax);
        System.out.println("Net Salary: " + net);
        sc.close();
    }
}
