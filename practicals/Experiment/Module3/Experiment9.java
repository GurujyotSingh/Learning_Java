import java.util.Scanner;
import java.io.*;

public class Experiment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            System.out.println("Displaying file contents...");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}
