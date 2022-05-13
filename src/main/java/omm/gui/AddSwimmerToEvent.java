package omm.gui;

import javax.swing.*;

public class AddSwimmerToEvent extends JFrame{
    private JPanel EnterSwimmer;
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
        this.setContentPane(EnterSwimmer);
        this.pack();
    }
}
