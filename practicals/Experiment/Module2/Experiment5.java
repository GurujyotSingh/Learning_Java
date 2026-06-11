class UtilityBill {
    static double tariffRate = 5.0; // static variable
    
    public static double calculateBill(int units) {
        return units * tariffRate;
    }
}

public class Experiment5 {
    public static void main(String[] args) {
        System.out.print("Enter Units Consumed: 150");
        int units = 150;
        double bill = UtilityBill.calculateBill(units);
        System.out.println("Electricity Bill Amount: " + (int)bill);
    }
}