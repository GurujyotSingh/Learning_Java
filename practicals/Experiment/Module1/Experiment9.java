import java.util.Scanner;

public class Experiment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sellers: ");
        int n = sc.nextInt();
        double[] prices = new double[n];
        System.out.print("Enter prices: ");
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
            if(prices[i] < min) min = prices[i];
            if(prices[i] > max) max = prices[i];
        }
        
        System.out.println("Lowest Price: " + (int)min);
        System.out.println("Highest Price: " + (int)max);
        sc.close();
    }
}
