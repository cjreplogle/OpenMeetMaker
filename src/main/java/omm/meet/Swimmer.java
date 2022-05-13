package omm.meet;

import omm.meet.event.SwimmerEvent;
import omm.meet.Team;

import java.util.List;

public class Swimmer {
    String name;
    int age;
    Team team;
    String gender;
    List<SwimmerEvent> swimmerEntrys;

    public Swimmer(String name, int age, Team team, String gender){
        this.name = name;
        this.age = age;
        this.team = team;
        this.gender = gender;
    }

    public void addEvent(SwimmerEvent entry){
        swimmerEntrys.add(entry);
    }


}
