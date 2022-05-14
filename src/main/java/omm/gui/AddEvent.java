package omm.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import omm.meet.event.Event;
import omm.meet.event.EventManager;

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
    private JButton cancelButton;
    private JComboBox ageGroup;
    private JComboBox distance;

    public AddEvent(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setupListeners();
        this.setContentPane(AddEvent);
        this.pack();
    }

    private void setupListeners(){
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmpStroke = "Freestyle";
                if(fly.isSelected()){
                    tmpStroke = "Butterfly";
                }
                if(back.isSelected()){
                    tmpStroke = "Backstroke";
                }
                if(breast.isSelected()){
                    tmpStroke = "Breastroke";
                }
                String tmpGender = "Mixed";
                if(mens.isSelected()){
                    tmpGender = "Mens";
                }
                if(womens.isSelected()){
                    tmpGender = "Womens";
                }
                String tmpAgeGroup = "8&Under";
                String tmpDistance = "25";
                //fix once figure out combobox selection/creation

                Event tmpEvent = new Event(tmpStroke, tmpDistance, tmpGender, tmpAgeGroup);
                EventManager.addEvent(tmpEvent);

                dispose();
            }
        });
    }
}
