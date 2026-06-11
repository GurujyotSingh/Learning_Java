import java.util.Scanner;
import java.io.*;

public class Experiment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        try {
            FileWriter fw = new FileWriter("employee.txt");
            fw.write("Employee ID: " + id + "\n");
            fw.write("Name: " + name + "\n");
            fw.close();
            System.out.println("Employee record saved to file");
        } catch (IOException e) {
            System.out.println("Error saving file");
        }
        sc.close();
    }
}
