class Parent {
    void show() { System.out.println("Parent class"); }
}

class Child extends Parent {
    void show() { System.out.println("Child class - Overriding"); }
    void show(int x) { System.out.println("Overloading"); }
}

public class Practical5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.show(10);
    }
}
