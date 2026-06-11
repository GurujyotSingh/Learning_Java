import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double avg = (double) total / n;
        String grade;
        if(avg >= 90) grade = "A";
        else if(avg >= 80) grade = "B";
        else if(avg >= 70) grade = "C";
        else grade = "D";
        
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
