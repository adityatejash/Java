import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q1 extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JTextField textField;

    q1() {
        setTitle("Event Handling Demo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Enter your name:");
        textField = new JTextField(15);
        button = new JButton("Submit");

        add(label);
        add(textField);
        add(button);

        button.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = textField.getText();
        JOptionPane.showMessageDialog(this, "Hello, " + name + "!");
    }

    public static void main(String[] args) {
        new q1();
    }
}