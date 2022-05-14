package omm.meet.swimmer;

import java.util.List;

public class Swimmer {
    private final String name;
    private final int age;
    private final String team;
    private final String gender;
    List<Entry> swimmerEntrys;

    public Swimmer(String name, int age, String team, String gender){
        this.name = name;
        this.age = age;
        this.team = team;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void addEvent(Entry entry){
        swimmerEntrys.add(entry);
    }


}
