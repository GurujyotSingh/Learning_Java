import javax.swing.*;
import java.awt.event.*;

public class Experiment1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);
        
        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 100, 100, 30);
        JTextField courseField = new JTextField();
        courseField.setBounds(150, 100, 150, 30);
        
        JButton submit = new JButton("Submit");
        submit.setBounds(150, 160, 100, 30);
        
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String course = courseField.getText();
                JOptionPane.showMessageDialog(frame, "Registration Successful\nName: " + name + "\nCourse: " + course);
            }
        });
        
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(courseLabel);
        frame.add(courseField);
        frame.add(submit);
        frame.setVisible(true);
    }
}
