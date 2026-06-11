import javax.swing.*;
import java.awt.event.*;

public class Experiment6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ticket Booking");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel classLabel = new JLabel("Select Class:");
        classLabel.setBounds(20, 20, 150, 30);

        JRadioButton sleeper = new JRadioButton("Sleeper");
        sleeper.setBounds(20, 50, 100, 30);
        JRadioButton ac = new JRadioButton("AC");
        ac.setBounds(20, 80, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(sleeper);
        group.add(ac);

        JCheckBox meal = new JCheckBox("Meal");
        meal.setBounds(20, 120, 100, 30);
        JCheckBox insurance = new JCheckBox("Insurance");
        insurance.setBounds(20, 150, 100, 30);

        JButton submit = new JButton("Book");
        submit.setBounds(150, 200, 100, 30);

        submit.addActionListener(e -> {
            String cls = sleeper.isSelected() ? "Sleeper" : "AC";
            String services = "";
            if (meal.isSelected()) services += "Meal ";
            if (insurance.isSelected()) services += "Insurance";
            JOptionPane.showMessageDialog(frame, "Booking Confirmed\nClass: " + cls + "\nService: " + services);
        });

        frame.add(classLabel);
        frame.add(sleeper); frame.add(ac);
        frame.add(meal); frame.add(insurance);
        frame.add(submit);
        frame.setVisible(true);
    }
}
