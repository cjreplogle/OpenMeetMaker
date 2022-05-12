package app.util.gui;

import javax.swing.*;
import app.util.gui.AddEvent;
import app.util.gui.AddSwimmer;
import app.util.gui.AddSwimmerToEvent;

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

    public MainGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JPanel);
        this.setupListeners();
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new MainGUI("OpenMeetMaker");
        frame.setVisible(true);
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
            public void actionPerformed(ActionEvent e) {
                JFrame eventFrame = new AddEvent("Add Event");
                eventFrame.setVisible(true);
            }
        });
    }
}
