import java.util.Scanner;

public class Experiment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 0;
        
        if(units <= 100) bill = units * 5;
        else if(units <= 200) bill = 500 + (units - 100) * 6;
        else bill = 1100 + (units - 200) * 7;
        
        System.out.println("Total Electricity Bill: Rs. " + bill);
        sc.close();
    }
}
