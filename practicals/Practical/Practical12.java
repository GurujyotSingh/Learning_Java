import javax.swing.*;
import java.awt.event.*;

public class Practical12 extends JFrame implements ActionListener {
    JTextField tf;
    JButton btn;
    
    public Practical12() {
        tf = new JTextField(20);
        btn = new JButton("Submit");
        btn.addActionListener(this);
        
        add(tf);
        add(btn);
        setLayout(new java.awt.FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Event Handled: " + tf.getText());
    }
    
    public static void main(String[] args) {
        new Practical12();
    }
}