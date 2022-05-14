package omm;

import javax.swing.*;
import omm.gui.MainGUI;
import omm.meet.team.TeamManager;
import omm.meet.event.EventManager;
import omm.meet.swimmer.SwimmerManager;

public class Init {

    public static void main(String[] args) {
        TeamManager teamManager = new TeamManager();
        EventManager eventManager = new EventManager();
        SwimmerManager swimmerManager = new SwimmerManager();
        JFrame frame = new MainGUI("OpenMeetMaker");
        frame.setVisible(true);

    }

}
