public class Experiment8 {
    public static void main(String[] args) {
        if (args.length >= 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Power Result: " + (int)Math.pow(a, b));
            System.out.println("Square Root of First Number: " + Math.sqrt(a));
        } else {
            System.out.println("Usage: java Experiment8 4 2");
        }
    }
}