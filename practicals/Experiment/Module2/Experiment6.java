abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    public Circle(double r) { radius = r; }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    public Rectangle(double l, double w) { length = l; width = w; }
    double calculateArea() {
        return length * width;
    }
}

public class Experiment6 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Area of Circle: " + String.format("%.2f", c.calculateArea()));
    }
}