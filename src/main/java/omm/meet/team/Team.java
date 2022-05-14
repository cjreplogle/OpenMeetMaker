package omm.meet.team;

import omm.meet.swimmer.Swimmer;

import java.util.List;

public class Team {
    final String name;
    private List<Swimmer> teamMembers;
    private int score;

    public Team(String name){
        this.name = name;
    }

    public void addSwimmerToTeam(Swimmer swimmer){
        teamMembers.add(swimmer);
    }

    public String getName(){
        return name;
    }

    public int calculateScore(){
        return 0;
        // not implimented yet
    }
}
