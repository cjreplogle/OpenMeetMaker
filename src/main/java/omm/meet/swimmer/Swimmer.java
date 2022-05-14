package omm.meet.swimmer;

import java.util.List;

public class Swimmer {
    private String name;
    private int age;
    private String team;
    private String gender;
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
