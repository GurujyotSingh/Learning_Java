import java.util.Scanner;
class LibBookCheck{
	public static void main(String args[]){
		int book_copies[],total_books,index;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Book : ");
		total_books = sc.nextInt();
		book_copies = new int[total_books];
		for(int i=0;i<total_books;i++){
			System.out.print("Enter Copies Available for Book "+(i+1)+":");
			book_copies[i]=sc.nextInt();
		}
		System.out.print("Enter Book Index to check : ");
		index = sc.nextInt();
		if(index>=0 && index<total_books){
			if(book_copies[index]>0){
				System.out.println("Book is Available");
			}
			else{
				System.out.println("Book is Not Available ");
			}
		}
	}
}