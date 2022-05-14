package omm.gui;

import javax.swing.*;

import omm.meet.swimmer.SwimmerManager;
import omm.meet.team.TeamManager;
import omm.meet.swimmer.Swimmer;
import omm.meet.swimmer.SwimmerManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSwimmer<teamSelect> extends JFrame{
    String[] testStrings = {"test1", "test2"};
    private JPanel AddSwimmer;
    private JRadioButton male;
    private JRadioButton female;
    private JTextField name;
    private JComboBox teamSelect;
    private JSpinner age;
    private JButton addSwimmerButton;
    private JButton closeButton;

    public AddSwimmer(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setupListeners();
        this.setContentPane(AddSwimmer);
        this.pack();
    }

    private void setupListeners() {
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        addSwimmerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nameTmp = name.getText();
                String genderTmp;
                int ageTmp = (int)age.getValue();
                String teamTmp = "null";

                if(male.isSelected()) {
                    genderTmp = "Male";
                } else if(female.isSelected()){
                    genderTmp = "Female";
                } else {
                    genderTmp = "Mixed";
                }
                Swimmer tmpSwimmer = new Swimmer(nameTmp, ageTmp, genderTmp, teamTmp);
                SwimmerManager.addSwimmer(tmpSwimmer);
                dispose();
            }
        });
    }
}

