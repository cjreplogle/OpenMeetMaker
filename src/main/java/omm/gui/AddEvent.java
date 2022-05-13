package omm.gui;

import javax.swing.*;

public class AddEvent extends JFrame {
    private JPanel AddEvent;
    private JButton createButton;
    private JRadioButton fly;
    private JRadioButton back;
    private JRadioButton free;
    private JRadioButton mens;
    private JRadioButton womens;
    private JRadioButton mixed;
    private JRadioButton breast;
    private JTextField distance;
    private JButton cancelButton;
    private JComboBox ageGroup;

    public AddEvent(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setContentPane(AddEvent);
        this.pack();
    }

}
