package omm.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSwimmerToEvent extends JFrame{
    private JPanel enterSwimmer;
    private JButton addButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton cancelButton;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner spinner3;

    public AddSwimmerToEvent(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setupListeners();
        this.setContentPane(enterSwimmer);
        this.pack();
    }

    private void setupListeners(){
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });
    }
}
