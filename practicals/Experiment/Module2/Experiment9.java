// Note: For package demo, you may need to create package folder separately
// This is a simplified version

class Student {
    public String name;
    protected String department;
    
    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }
    
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class Experiment9 {
    public static void main(String[] args) {
        Student s = new Student("Meera", "CSE");
        s.display();
    }
}