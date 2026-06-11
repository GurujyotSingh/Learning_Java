import javax.swing.*;
import java.awt.event.*;

public class Experiment2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Number 1:");
        l1.setBounds(20, 20, 80, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(110, 20, 150, 30);

        JLabel l2 = new JLabel("Number 2:");
        l2.setBounds(20, 60, 80, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(110, 60, 150, 30);

        JButton btn = new JButton("Add");
        btn.setBounds(110, 110, 80, 30);

        JLabel result = new JLabel("Result: ");
        result.setBounds(20, 150, 200, 30);

        btn.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                result.setText("Result: " + sum);
            } catch (Exception ex) {
                result.setText("Error: Invalid input");
            }
        });

        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(btn);
        frame.add(result);
        frame.setVisible(true);
    }
}
