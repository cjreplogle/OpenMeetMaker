package swimmer;

import swimmer.event.SwimmerEvent;

import java.util.List;

public class Swimmer {
    String name;
    int age;
    Team team;
    boolean gender;
    List<SwimmerEvent> swimmerEntrys;

    public Swimmer(String name, int age, Team team, boolean gender){
        this.name = name;
        this.age = age;
        this.team = team;
        this.gender = gender;
    }

    public void addEvent(SwimmerEvent entry){
        swimmerEntrys.add(entry);
    }


}
