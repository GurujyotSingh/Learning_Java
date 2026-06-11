import java.util.Scanner;
class JeeMains{
	public int max3(int a, int b, int c){
		int max = Math.max(a,b);
		max = Math.max(max,c);
		return max;
	}
	public static void main(String args[]){
		int jee1[]=new int[5];
		int jee2[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println(max3(3,2,1));
/*
		System.out.println("<---Enter Marks of JEE1 Marks--->");
		for(int i=0;i<5;i++){
			jee1[i]=sc.nextInt();
			if(jee1[i]>300){	
				System.out.println("Your entered wrong marks");
				return;
			}
		}
		System.out.println("<---Enter Marks of JEE2 Marks--->");
		for(int i=0;i<5;i++){
			jee2[i]=sc.nextInt();
			if(jee2[i]>300){	
				System.out.println("Your entered wrong marks");
				return;
			}
		}
		System.out.println("The Result in Percentage (%)");
		for(int i=0;i<5;i++){
			System.out.println("Student Result"+(i+1));
			float percentage = (float)((jee2[i]-jee1[i])*100)/300;
		        System.out.format("\n%.2f",percentage);

		}		
*/
		
		
	}
}