package omm.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import omm.meet.Team;

public class AddSwimmer extends JFrame{
    private JPanel AddSwimmer;
    private JRadioButton male;
    private JRadioButton female;
    private JTextField name;
    private JComboBox team;
    private JSpinner age;
    private JButton addSwimmerButton;
    private JButton closeButton;

    private String inputName;
    private int inputAge;
    private Team inputTeam;
    private String inputGender;

    public AddSwimmer(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setContentPane(AddSwimmer);
        this.pack();
    }


}

