import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Experiment9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Feedback Form");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea feedbackArea = new JTextArea();
        frame.add(new JScrollPane(feedbackArea), BorderLayout.CENTER);

        JButton submit = new JButton("Submit Feedback");
        submit.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Thank you for your feedback!");
        });

        frame.add(submit, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
