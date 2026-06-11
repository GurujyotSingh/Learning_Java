import java.util.Scanner;

public class Experiment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();
            if (tickets <= 0) {
                throw new IllegalArgumentException("Number of tickets must be positive");
            }
            System.out.println("Tickets booked successfully: " + tickets);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        }
        sc.close();
    }
}
