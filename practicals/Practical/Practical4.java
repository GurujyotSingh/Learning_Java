class Student {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Practical4 {
    public static void main(String[] args) {
        Student s = new Student(101, "Rahul");
        s.display();
    }
}
