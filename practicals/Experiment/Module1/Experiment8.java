import java.util.Scanner;

public class Experiment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        boolean[] attendance = new boolean[n];
        System.out.print("Enter attendance (true/false): ");
        int present = 0;
        
        for(int i = 0; i < n; i++) {
            attendance[i] = sc.nextBoolean();
            if(attendance[i]) present++;
        }
        
        System.out.println("Present Students: " + present);
        System.out.println("Absent Students: " + (n - present));
        sc.close();
    }
}
