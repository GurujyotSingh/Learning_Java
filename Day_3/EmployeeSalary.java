                                                                                                                                                                                                                             import java.util.Scanner;
class EmployeeSalary{
	public static void main(String args[]){
		double basic_sal,allowance,gross_salary,tax_dec,net_sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Basic Salary : ");
		basic_sal = sc.nextDouble();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter your Allowances : ");
		allowance = sc2.nextFloat();

		gross_salary = basic_sal + allowance;
		tax_dec = gross_salary*0.10;
		net_sal = gross_salary-tax_dec;

		System.out.println("-------\nGross Salary : "+gross_salary);
		System.out.println("-------\nTax Deduction : "+tax_dec);
		System.out.println("-------\nNet Salary : "+net_sal);
		
	}
}