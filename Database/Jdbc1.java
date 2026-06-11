import javax.sql.*;
import java.sql.*;
import java.util.*;
class Jdbc1 {
  public static void main(String args[]) {
    
      String url = "jdbc:mysql://localhost:3307/java_DB"; // Database details
        String username = "root"; // MySQL credentials
        String password = "Guru123";
	Scanner sc = new Scanner(System.in);
	String dept_name = sc.next();
        String query = "select * from employees where department='IT'"; // Query to be run
       try {
        // Load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        // Create a statement
        Statement st = con.createStatement();

        // Execute the query
        ResultSet rs = st.executeQuery(query);

        // Process the results
        while (rs.next()) {
            String name = rs.getString("emp_name"); // Retrieve name from db
            System.out.print(name+" "); // Print result on console
	    String city = rs.getString(1);
	    System.out.println(city);
        }
     //  String ins_sql="update employees set department='Sales' where emp_id=7";
//	String ins_sql = "";
//       st.executeUpdate(ins_sql);
        // Close the statement and connection
        st.close();
        con.close();
        System.out.println("Connection Closed....");
       }
       catch(Exception e) {
         System.out.println(e.getMessage());
       }
}
}
