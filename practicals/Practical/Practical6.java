package college;

public class Student {
    private String name;
    protected String dept;
    public Student(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
    public void display() {
        System.out.println("Name: " + name + " Dept: " + dept);
    }
}

public class Practical6 {
    public static void main(String[] args) {
        // Note: For package demo, run from proper structure
        System.out.println("Package and Access Specifiers Demo");
    }
}
