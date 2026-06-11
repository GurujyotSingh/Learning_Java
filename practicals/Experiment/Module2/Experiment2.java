import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
}

class Result extends Student {
    int[] marks;
    
    public Result(int rollNumber, String name, int[] marks) {
        super(rollNumber, name);
        this.marks = marks;
    }
    
    public int getTotal() {
        int total = 0;
        for(int m : marks) total += m;
        return total;
    }
    
    public double getAverage() {
        return getTotal() / (double) marks.length;
    }
    
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + getTotal());
        System.out.println("Average: " + String.format("%.2f", getAverage()));
    }
}

public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int[] marks = new int[3];
        for(int i=0; i<3; i++) {
            marks[i] = sc.nextInt();
        }
        
        Result result = new Result(roll, name, marks);
        result.display();
        
        sc.close();
    }
}