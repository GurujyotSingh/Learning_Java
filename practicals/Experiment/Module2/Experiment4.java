class Product {
    double calculateDiscount(double price) {
        return price * 0.9; // 10% discount
    }
}

class SeasonalProduct extends Product {
    @Override
    double calculateDiscount(double price) {
        return price * 0.9; // same for simplicity, or different logic
    }
}

public class Experiment4 {
    public static void main(String[] args) {
        Product p = new SeasonalProduct();
        double price = 2000;
        double discounted = p.calculateDiscount(price);
        System.out.println("Discounted Price: " + (int)discounted);
    }
}