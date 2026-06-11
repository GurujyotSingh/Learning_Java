import java.sql.*;
import java.util.*;
public class Experiment1 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your URL (like: jdbc:mysql://localhost:3306/YOUR_DB_NAME):");
	String url = sc.next();
	System.out.print("Enter Your Username : ");
	String username = sc.next();
	System.out.print("Enter Password : ");
	String password = sc.next();
	try{	

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Database connected Successfully");
		con.close();
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
    }
}
