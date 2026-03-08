class PrimDataTypes {

    public static void main(String[] args) {

        // Primitive Data Types
        byte b = 10;
        short s = 200;
        int i = 1000;
        long l = 100000L;

        float f = 5.5f;
        double d = 10.25;

        char c = 'A';
        boolean isJavaFun = true;

        System.out.println("=== Primitive Data Types ===");
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + isJavaFun);

        // Arithmetic Operators
        int a = 20, x = 10;
        System.out.println("\n=== Arithmetic Operators ===");
        System.out.println("Addition: " + (a + x));
        System.out.println("Subtraction: " + (a - x));
        System.out.println("Multiplication: " + (a * x));
        System.out.println("Division: " + (a / x));
        System.out.println("Modulus: " + (a % x));

        // Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > x: " + (a > x));
        System.out.println("a < x: " + (a < x));
        System.out.println("a == x: " + (a == x));
        System.out.println("a != x: " + (a != x));

        // Logical Operators
        boolean p = true, q = false;
        System.out.println("\n=== Logical Operators ===");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        // Assignment Operators
        int num = 5;
        System.out.println("\n=== Assignment Operators ===");
        num += 3;  // num = num + 3
        System.out.println("num += 3: " + num);
        num *= 2;  // num = num * 2
        System.out.println("num *= 2: " + num);

        // Unary Operators
        int y = 5;
        System.out.println("\n=== Unary Operators ===");
        System.out.println("y: " + y);
        System.out.println("++y: " + (++y)); // Pre-increment
        System.out.println("y++: " + (y++)); // Post-increment
        System.out.println("After y++: " + y);
    }
}