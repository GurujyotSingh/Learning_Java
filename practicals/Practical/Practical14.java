import java.sql.*;
import java.util.Scanner;

public class Practical14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            Statement stmt = con.createStatement();
            
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            stmt.executeUpdate("INSERT INTO student (id, name) VALUES(" + id + ", '" + name + "')");
            System.out.println("Record inserted successfully!");
            
            // Retrieve
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            System.out.println("Records:");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}