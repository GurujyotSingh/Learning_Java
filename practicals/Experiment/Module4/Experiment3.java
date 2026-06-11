import javax.swing.*;
import java.awt.event.*;

public class Experiment3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 100, 30);
        JTextField userField = new JTextField();
        userField.setBounds(130, 20, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 100, 30);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(130, 60, 150, 30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(130, 110, 80, 30);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            if (user.equals("admin") && pass.equals("admin123")) {
                JOptionPane.showMessageDialog(frame, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(frame, "Login Failed");
            }
        });

        frame.add(userLabel); frame.add(userField);
        frame.add(passLabel); frame.add(passField);
        frame.add(loginBtn);
        frame.setVisible(true);
    }
}
