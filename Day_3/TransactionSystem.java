import java.util.Scanner;
class TransactionSystem{
	public static void main(String args[]){
		int initial_bal,deposit,withdraw,user_choice;
		System.out.println("Enter Initial Balance : "); 	
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		initial_bal = sc.nextInt();
		System.out.print("Enter transaction type (1-Deposit, 2-Withdraw):");
		user_choice = sc2.nextInt();
		if(user_choice==1){
			System.out.println("Enter Amount to Deposit : ");
			deposit = sc3.nextInt();
			initial_bal+=deposit;
		} else if (user_choice == 2){
			System.out.println("Enter Amount to Deposit : ");
			withdraw = sc3.nextInt();
			initial_bal-=withdraw;
		}
		else {
			System.out.println("Enter Right Value");
		}
		System.out.println("Transaction Successfull");
		System.out.println("Your Updated Balance : "+initial_bal);
	}
}