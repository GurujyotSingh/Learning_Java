import java.util.Scanner;
import java.io.*;

public class Practical10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! (Console I/O)");
        
        // File handling
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Student Name: " + name);
            fw.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}