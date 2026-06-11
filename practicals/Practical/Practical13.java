import java.sql.*;

public class Practical13 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "");
            System.out.println("Database connected successfully!");
            con.close();
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
            System.out.println("Note: Make sure MySQL is running.");
        }
    }
}