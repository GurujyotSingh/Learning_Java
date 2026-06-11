import javax.swing.*;
import java.awt.*;

public class Experiment4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Salary");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(new JLabel("Employee Name:"));
        JTextField nameField = new JTextField();
        frame.add(nameField);

        frame.add(new JLabel("Basic Salary:"));
        JTextField salaryField = new JTextField();
        frame.add(salaryField);

        JButton btn = new JButton("Show Salary");
        frame.add(btn);

        JLabel result = new JLabel("");
        frame.add(result);

        btn.addActionListener(e -> {
            String name = nameField.getText();
            String salStr = salaryField.getText();
            try {
                double salary = Double.parseDouble(salStr);
                result.setText("Employee: " + name + "   Salary: " + salary);
            } catch (Exception ex) {
                result.setText("Invalid Salary");
            }
        });

        frame.setVisible(true);
    }
}
