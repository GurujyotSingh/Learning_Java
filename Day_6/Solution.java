class Solution{
	public static void main(String []argh){
		int salesData[][]={
			{1200,800,1500,300,900,1100,600},
			{1300,700,1400,400,850,1200,550}
		};
		int totalSales=0,overallSales=0;
		for(int i=0;i<salesData.length;i++){
			for(int j=0;j<salesData[i].length;j++){
				totalSales+=salesData[i][j];
			}
			System.out.println("Total Sales at Day "+(i+1)+":"+totalSales);
			overallSales+=totalSales;
			if(totalSales<5000)System.out.println("Low Sales at Day"+(i+1));
			totalSales=0;
		}          
		System.out.println("Over All Sales :"+overallSales);
		int max=salesData[0][0],setColumn=0;
		for(int i=0;i<salesData.length;i++){
			for(int j=0;j<salesData[i].length;j++){
				if(salesData[i][j]>max){
					max = salesData[i][j];
					setColumn=j;
				}
			}
		}
		System.out.println("Highest product sales is at column "+setColumn);	
	}
}