import java.util.Scanner;
class Echo{
}
class Ls{
}
class Pwd{
}
class LinuxSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String cmd;
		String start_parameter[];
		System.out.println("Welcome to your Linux System (Devlopment phase)\n type /? for help");
		while(true){
			System.out.print("Enter your command : ");
			cmd = sc.nextLine();
			start_parameter = cmd.split(" ");
			start_parameter = start_parameter
			if(start_parameter[0].equals("echo")){
				System.out.println("Inside echo");
				System.out.println(start_parameter[1]);
			}
			
			
		}
	}
}