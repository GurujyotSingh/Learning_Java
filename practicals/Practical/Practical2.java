import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Demonstrating Primitive Data Types and Operators:");
        
        int a = 10;
        double b = 5.5;
        boolean flag = true;
        
        System.out.println("Addition: " + (a + b));
        System.out.println("Multiplication: " + (a * 2));
        System.out.println("Relational: " + (a > b));
        System.out.println("Logical: " + (flag && true));
        
        sc.close();
    }
}
