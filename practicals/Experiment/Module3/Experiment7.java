import java.util.Scanner;

public class Experiment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        
        System.out.println("Student Registered Successfully");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        sc.close();
    }
}
