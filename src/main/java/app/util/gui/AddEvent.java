package app.util.gui;

import javax.swing.*;

public class AddEvent extends JFrame {
    private JPanel AddEvent;
    private JButton createButton;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JRadioButton radioButton7;
    private JRadioButton breastrokeRadioButton;
    private JTextField textField1;

    public AddEvent(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(AddEvent);
        this.pack();
    }

}
