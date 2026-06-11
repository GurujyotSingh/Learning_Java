import java.sql.*;
import java.util.Scanner;

public class Practical15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            Statement stmt = con.createStatement();
            
            System.out.print("Enter ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            // Update
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            stmt.executeUpdate("UPDATE student SET name='" + name + "' WHERE id=" + id);
            System.out.println("Record updated successfully!");
            
            // Delete example
            System.out.print("Enter ID to delete: ");
            id = sc.nextInt();
            stmt.executeUpdate("DELETE FROM student WHERE id=" + id);
            System.out.println("Record deleted successfully!");
            
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Note: Create 'student' table with columns (id, name)");
        }
    }
}