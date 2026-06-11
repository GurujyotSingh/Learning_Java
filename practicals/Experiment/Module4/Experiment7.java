import javax.swing.*;

public class Experiment7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Notepad");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        frame.add(scroll);

        JButton clearBtn = new JButton("Clear");
        clearBtn.addActionListener(e -> textArea.setText(""));

        JPanel panel = new JPanel();
        panel.add(clearBtn);
        frame.add(panel, "South");

        frame.setVisible(true);
    }
}
