import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q2 extends JFrame implements ActionListener {
    JTextField nameField, ageField, emailField;
    JRadioButton male, female;
    JComboBox<String> courseBox;
    JButton submit, clear;

    q2() {
        setTitle("Student Registration Form");
        setSize(400, 350);
        setLayout(new GridLayout(7, 2, 10, 10));

        add(new Label("Student Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new Label("Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new Label("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new Label("Gender:"));
        JPanel genderPanel = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new Label("Course:"));
        String[] courses = {"BCA", "B.Tech", "B.Sc", "MCA"};
        courseBox = new JComboBox<>(courses);
        add(courseBox);

        submit = new JButton("Submit");
        clear = new JButton("Clear");
        submit.addActionListener(this);
        clear.addActionListener(this);
        add(submit);
        add(clear);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String gender = male.isSelected() ? "Male" :
                            female.isSelected() ? "Female" : "Not selected";

            JOptionPane.showMessageDialog(this,
                "Name: " + nameField.getText() +
                "\nAge: " + ageField.getText() +
                "\nEmail: " + emailField.getText() +
                "\nGender: " + gender +
                "\nCourse: " + courseBox.getSelectedItem());
        } else {
            nameField.setText("");
            ageField.setText("");
            emailField.setText("");
            male.setSelected(false);
            female.setSelected(false);
            courseBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new q2());
    }
}
