package app.util.gui;

import javax.swing.*;

public class AddSwimmer extends JFrame{
    private JPanel AddSwimmer;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JSpinner spinner1;
    private JButton addSwimmerButton;

    public AddSwimmer(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(AddSwimmer);
        this.pack();
    }

}

