import javax.swing.*;
import java.awt.event.*;

public class SimpleSum {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Two Numbers");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JButton addButton = new JButton("Add");
        JLabel result = new JLabel("Result: ");

        // Set positions (x, y, width, height)
        num1.setBounds(50, 30, 100, 30);
        num2.setBounds(50, 70, 100, 30);
        addButton.setBounds(50, 110, 100, 30);
        result.setBounds(50, 150, 200, 30);

        // Action when button is clicked
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());
                int sum = a + b;
                result.setText("Result: " + sum);
            }
        });

        // Add components to frame
        frame.add(num1);
        frame.add(num2);
        frame.add(addButton);
        frame.add(result);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
