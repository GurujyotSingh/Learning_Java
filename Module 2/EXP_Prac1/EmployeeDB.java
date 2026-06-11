import java.util.Scanner;
class Employee{
	int id;
	String name;
	float salary;
	
	Employee(int id,String name,float salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display(){
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Salary : "+salary);
	}
}
class EmployeeDB{
	public static void main(String args[]){
	
		int id;
		String name;
		float salary;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee ID : ");
		id = sc.nextInt();

		System.out.print("Enter Name : ");
		name = sc.next();

		System.out.print("Enter Salary : ");
		salary = sc.nextFloat();


		Employee empDetails = new Employee(id,name,salary);
		empDetails.display();

	}	
}