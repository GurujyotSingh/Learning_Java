import java.util.Scanner;

public class Experiment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        System.out.println("Length: " + sentence.length());
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Word Count: " + sentence.split("\\s+").length);
        
        sc.close();
    }
}