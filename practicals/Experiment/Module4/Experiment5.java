import javax.swing.*;
import java.awt.event.*;

public class Experiment5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel cLabel = new JLabel("Celsius:");
        cLabel.setBounds(20, 30, 80, 30);
        JTextField cField = new JTextField();
        cField.setBounds(110, 30, 150, 30);

        JButton convertBtn = new JButton("Convert");
        convertBtn.setBounds(110, 80, 100, 30);

        JLabel fLabel = new JLabel("Fahrenheit: ");
        fLabel.setBounds(20, 130, 200, 30);

        convertBtn.addActionListener(e -> {
            try {
                double c = Double.parseDouble(cField.getText());
                double f = c * 9/5 + 32;
                fLabel.setText("Fahrenheit: " + f);
            } catch (Exception ex) {
                fLabel.setText("Invalid input");
            }
        });

        frame.add(cLabel); frame.add(cField);
        frame.add(convertBtn);
        frame.add(fLabel);
        frame.setVisible(true);
    }
}
