package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverter extends JFrame  {
    private JPanel mainPanel;
    private JTextField celciusTextField;
    private JLabel celciusLabel;
    private JButton covertButton;
    private JLabel fLabel;

    public CelsiusConverter(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        covertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp= (int)((Double.parseDouble(celciusTextField.getText()))*1.8+32);
                fLabel.setText(temp + "Farenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame= new CelsiusConverter("Temperature converter!");
        frame.setVisible(true);

    }
}
