import java.util.Scanner;

public class Experiment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] copies = new int[n];
        System.out.print("Enter copies available: ");
        for(int i=0; i<n; i++) {
            copies[i] = sc.nextInt();
        }
        System.out.print("Enter book index to check: ");
        int index = sc.nextInt();
        
        if(index >= 0 && index < n && copies[index] > 0) {
            System.out.println("Book is available");
        } else {
            System.out.println("Book is not available");
        }
        sc.close();
    }
}
