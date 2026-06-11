import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        
        try {
            if (age < 18) {
                throw new Exception("Student must be 18 or above");
            }
            System.out.println("Valid Age");
        } catch (Exception e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }
        sc.close();
    }
}
