import java.util.Scanner;

class LoginBlockedException extends Exception {
    public LoginBlockedException(String message) {
        super(message);
    }
}

public class Experiment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter login attempt number: ");
        int attempts = sc.nextInt();
        
        try {
            if (attempts > 3) {
                throw new LoginBlockedException("Maximum login attempts exceeded");
            }
            System.out.println("Login Successful");
        } catch (LoginBlockedException e) {
            System.out.println("LoginBlockedException: " + e.getMessage());
        }
        sc.close();
    }
}
