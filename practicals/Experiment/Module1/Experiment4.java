import java.util.Scanner;

public class Experiment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 7 temperature values: ");
        double[] temps = new double[7];
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        
        for(int i = 0; i < 7; i++) {
            temps[i] = sc.nextDouble();
            sum += temps[i];
            if(temps[i] > max) max = temps[i];
            if(temps[i] < min) min = temps[i];
        }
        
        double avg = sum / 7;
        
        System.out.println("Maximum Temperature: " + (int)max);
        System.out.println("Minimum Temperature: " + (int)min);
        System.out.printf("Average Temperature: %.2f%n", avg);
        sc.close();
    }
}
