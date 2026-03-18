class MathDemo{
	public static void main(String args[]){
		if(args.length<3){
			System.out.println("Input example, Eg: 1 + 2");
			return;
		}
		for(int i=0 ;i<args.length;i++){
			if(i%2 != 0){
				int num1 = Integer.parseInt(args[i-1]);
				int num2 = Integer.parseInt(args[i+1]);
					if(args[i].equals("+")){						
						System.out.println("Addition of "+num1+" and "+num2+" is " +(num1+num2));	
					}else if (args[i].equals("-")){				 
						System.out.println("Subtraction of "+num1+" and "+num2+" is " +(num1-num2));
					}
					else if(args[i].equals("x")){
						System.out.println("Multiplication of "+num1+" and "+num2+" is " +(num1*num2));
					}
					else if(args[i].equals("/")){						
						if(num2==0 || num1==0){
							System.out.println("Can not divide by 0");
						}else{
							System.out.println("Division of "+num1+" and "+num2+" is " +(num1/num2));
						}
					}
					else if(args[i].equals("%")){
						System.out.println("Modulus of "+num1+" and "+num2+" is " +(num1%num2));

					}
				
			}
		}
	}
}