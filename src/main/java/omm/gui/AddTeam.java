package omm.gui;

import javax.swing.*;
import omm.meet.Team;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTeam extends JFrame {
    private JPanel AddTeam;
    private JTextField teamName;
    private JButton createButton;
    private JButton cancelButton;

    private String inputTeamName;

    public AddTeam(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setContentPane(AddTeam);
        this.setupListeners();
        this.pack();
    }

    private void setupListeners(){
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {
                dispose();
            }
        });
    }


}
