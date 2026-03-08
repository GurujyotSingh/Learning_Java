class TempAnalysis{
	public static void main(String args[]){
		int ana_7[]={37,34,40,35,42,41,32},total=0;
		for(int i=0;i<ana_7.length;i++)
		{
			total+=ana_7[i];
		}
		int avg = total/(ana_7.length);
		System.out.println("Average Temperature : "+avg);
		for(int i=0;i<ana_7.length;i++)
		{
			if(ana_7[i]>avg){
				System.out.println("Day"+(i+1)+" has above temperature from Average");
			}
		}		
	}
}