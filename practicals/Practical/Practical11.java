import javax.swing.*;
import java.awt.event.*;

public class Practical11 extends JFrame {
    public Practical11() {
        setTitle("Swing Controls Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btn = new JButton("Click Me");
        JTextField tf = new JTextField(20);
        JLabel label = new JLabel("Basic Swing Controls");
        
        add(label);
        add(tf);
        add(btn);
        
        setLayout(new java.awt.FlowLayout());
        setVisible(true);
        
        btn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button Clicked!"));
    }
    
    public static void main(String[] args) {
        new Practical11();
    }
}