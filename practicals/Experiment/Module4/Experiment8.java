import javax.swing.*;
import java.awt.event.*;

public class Experiment8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Marks Entry");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel subLabel = new JLabel("Subject:");
        subLabel.setBounds(20, 20, 80, 30);
        String[] subjects = {"Java", "Python", "C++"};
        JComboBox<String> combo = new JComboBox<>(subjects);
        combo.setBounds(110, 20, 150, 30);

        JLabel marksLabel = new JLabel("Marks:");
        marksLabel.setBounds(20, 70, 80, 30);
        JTextField marksField = new JTextField();
        marksField.setBounds(110, 70, 150, 30);

        JButton submit = new JButton("Submit");
        submit.setBounds(110, 120, 100, 30);

        submit.addActionListener(e -> {
            String sub = (String) combo.getSelectedItem();
            String marks = marksField.getText();
            JOptionPane.showMessageDialog(frame, "Subject: " + sub + "\nMarks Entered: " + marks);
        });

        frame.add(subLabel); frame.add(combo);
        frame.add(marksLabel); frame.add(marksField);
        frame.add(submit);
        frame.setVisible(true);
    }
}
