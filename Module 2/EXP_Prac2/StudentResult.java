import java.util.Scanner;
class Student{
	int roll_number;
	String name;
	
	Student(int roll_number,String name){
		this.roll_number = roll_number;
		this.name = name;

	}
	void display(){
		System.out.println("Student Roll Number: "+roll_number);
		System.out.println("Student Name : "+name);
	}
}
class Result extends Student{
	int roll_number;
	String name;
	int marks[]=new int[3];
	Result(int roll_number,String name, int marks[]){
		super(roll_number,name);
		this.marks=marks;
	}
	void display(){
		super.display();
		for(int i=0;i<3;i++){System.out.println("Marks : "+marks[i]);}
	}
}
class StudentResult{
	public static void main(String args[]){
	
		int id;
		String name;
		int marks[]=new int[3];

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Roll Number: ");
		id = sc.nextInt();

		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.print("Enter Marks : ");		
		for(int i=0;i<3;i++){
			marks[i]=sc.nextInt();
		}

		Result std = new Result(id,name,marks);
		std.display();

	}	
}