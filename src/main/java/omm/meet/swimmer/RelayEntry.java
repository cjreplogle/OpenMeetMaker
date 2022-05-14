package omm.meet.swimmer;

import omm.meet.swimmer.Swimmer;
import omm.meet.event.Event;
import omm.meet.swimmer.Entry;

public class RelayEntry extends Entry{
    private Swimmer swimmer1;
    private Swimmer swimmer2;
    private Swimmer swimmer3;
    private Swimmer swimmer4;

    public RelayEntry(Swimmer swimmer1, Swimmer swimmer2, Swimmer swimmer3, Swimmer swimmer4, Event event, Swimmer swimmer, int mins, int secs, int hunds){
        this.swimmer1 = swimmer1;
        this.swimmer2 = swimmer2;
        this.swimmer3 = swimmer3;
        this.swimmer4 = swimmer4;
        super(event, swimmer, mins, secs, hunds);
    }

    // Eventually, potentially make something that calculates known splits. For now this just inherits from a typical entry where the swimmer would just be designated as the team
}
