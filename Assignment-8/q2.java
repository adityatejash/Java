import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q2 extends JFrame implements ActionListener {
    JMenuItem welcomeItem, exitItem;
    JCheckBox checkBox;
    JList<String> list;

    q2() {
        setTitle("Menu Driven GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");

        welcomeItem = new JMenuItem("Welcome");
        exitItem = new JMenuItem("Exit");

        menu.add(welcomeItem);
        menu.add(exitItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        checkBox = new JCheckBox("Enable Option");
        add(checkBox);

        String[] items = {"Java", "Python", "C++", "JavaScript"};
        list = new JList<>(items);
        list.setVisibleRowCount(4);
        add(new JScrollPane(list));

        JButton selectButton = new JButton("Show Selection");

        welcomeItem.addActionListener(this);
        exitItem.addActionListener(this);

        selectButton.addActionListener(e -> {
            String selected = list.getSelectedValue();

            JOptionPane.showMessageDialog(
                this,
                "Selected: " + (selected == null ? "None" : selected)
                + "\nCheckbox: "
                + (checkBox.isSelected() ? "Checked" : "Unchecked")
            );
        });

        add(selectButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == welcomeItem) {
            JOptionPane.showMessageDialog(this, "Welcome to Java GUI!");
        } else if (e.getSource() == exitItem) {
            int choice = JOptionPane.showConfirmDialog(
                this,
                "Do you want to exit?",
                "Confirm Exit",
                JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new q2();
    }
}
