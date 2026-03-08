import java.util.Scanner;
class MarksAnalyser {
	public static void main(String args[])
	{
		int subject[],total=0,avg;
		subject = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<subject.length;i++){
			System.out.print("Enter Subject Marks : ");
			subject[i] = sc.nextInt();
			total+=subject[i];
		}
		avg = total/subject.length;
		System.out.println("Average Marks : "+avg);
		if(avg>=90){
			System.out.println("Grade A ");
		}
		else if(avg>=80){
			System.out.println("Grade B ");
		} 
		else if(avg>=70){
			System.out.println("Grade C ");
		}
		else if(avg>=60){
			System.out.println("Grade D ");
		}
		else if(avg>33){
			System.out.println("Grade E");
		}
		else if(avg<33){
			System.out.println("Fail");
		}

				
	}
}