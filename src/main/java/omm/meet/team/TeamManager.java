package omm.meet.team;

import java.util.ArrayList;
import omm.meet.team.Team;

public class TeamManager {
    static ArrayList<Team> teamList = new ArrayList<Team>(0);

    public TeamManager(){ }

    public static void addTeam(String teamName) {
        Team tmpTeam = new Team(teamName);
        teamList.add(tmpTeam);
    }

    public static String[] getTeamNames() {
        int l = teamList.size();
        String[] teamNames = new String[l];
        int n = 0;
        for(Team t: teamList) {
            teamNames[n] = t.getName();
            n++;
        }
        return teamNames;
    }

}
