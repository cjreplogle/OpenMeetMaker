package omm.meet.swimmer;

import omm.meet.event.Event;

public class Entry {
    private Event event;
    private Swimmer swimmer;
    int mins;
    int secs;
    int hunds;
    private double entryTimeMS;

    public Entry(Event event, Swimmer swimmer, int mins, int secs, int hunds){
        this.event = event;
        this.swimmer = swimmer;
        this.mins = mins;
        this.secs = secs;
        this.hunds = hunds;
        this.entryTimeMS = mins*60*100+secs*100+hunds;
    }

    public double getEntryTimeMS(){
        return entryTimeMS;
    }

    public Swimmer getSwimmer(){
        return swimmer;
    }

    public String getName(){
        return swimmer.getName();
    }

}
