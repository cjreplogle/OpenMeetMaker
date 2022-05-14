package omm.gui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame{
    private JPanel mainPanel;
    private javax.swing.JPanel JPanel;
    private JButton addSwimmerButton;
    private JButton generateHeatSheetButton;
    private JButton addEventButton;
    private JButton addTeamButton;
    private JButton importNotWorkingButton;
    private JButton saveAsMshNotButton;
    private JButton enterSwimmerButton;

    public MainGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JPanel);
        this.setupListeners();
        this.pack();
    }

    private void setupListeners(){
        addSwimmerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {
                JFrame swimmerFrame = new AddSwimmer("Add Swimmer");
                swimmerFrame.setVisible(true);
            }
        });
        addEventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {
                JFrame eventFrame = new AddEvent("Add Event");
                eventFrame.setVisible(true);
            }
        });
        addTeamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {
                JFrame teamFrame = new AddTeam("Add Team");
                teamFrame.setVisible(true);
            }
        });
        enterSwimmerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {
                JFrame enterFrame = new AddSwimmerToEvent("Enter Swimmer");
                enterFrame.setVisible(true);
            }
        });
    }
}
