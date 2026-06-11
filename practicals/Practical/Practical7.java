import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Show how exceptions are generated in Java program.");
        
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int result = 100 / num;  // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero not allowed!");
        } catch (Exception e) {
            System.out.println("Some other exception occurred.");
        } finally {
            System.out.println("Exception handling demonstration completed.");
        }
        
        sc.close();
    }
}