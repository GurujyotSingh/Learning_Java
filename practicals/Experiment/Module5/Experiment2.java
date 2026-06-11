import java.sql.*;
import java.util.*;
public class Experiment2 {
    public static void main(String[] args) {
        System.out.println("Enter the following details:");
	Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
	int stu_id = sc.nextInt();

        System.out.print("Enter Student Name: ");
	String stu_name = sc.nextLine();
sc.nextLine();
        System.out.print("Enter Student Course: ");
	String course = sc.nextLine();

	String url="jdbc:mysql://localhost:3307/java_DB";
	String username = "root";
	String password = "Guru123";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		
		Statement st = con.createStatement();
		String insertQuery ="insert into student values("+stu_id+",'"+stu_name+"','"+course+"')";

		int result = st.executeUpdate(insertQuery);
		if(result==0){
			System.out.println("Failure in insert");
		}
		else{
			System.out.println("Inserted Successfully");
		}

	}
	catch(Exception e){
		System.out.println(e.getMessage());	
	}
	
    }
}
