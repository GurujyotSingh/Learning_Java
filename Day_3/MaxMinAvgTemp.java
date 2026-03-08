import java.util.Scanner;
class MaxMinAvgTemp{
	public static void main(String args[]){
		float ana_7[],avg,total=0,min,max;
		Scanner sc = new Scanner(System.in);
		ana_7 = new float[7];
		for(int i=0;i<ana_7.length;i++)
		{
			System.out.print("Enter Day "+(i+1)+":");
			ana_7[i]=sc.nextFloat();
			total+=ana_7[i];	
		}
		avg = total/(ana_7.length);
	
		max = ana_7[0];
		min = ana_7[0];
		for(int i=0;i<ana_7.length;i++)
		{
			if(ana_7[i]>max){
				max = ana_7[i];
			}
			if(ana_7[i]<min){
				min = ana_7[i];
			}
		}		
		System.out.println("Maximum Temperature : "+max);
		System.out.println("Minimum Temperature : "+min);
		System.out.println("Average Temperature : "+avg);
	}
}