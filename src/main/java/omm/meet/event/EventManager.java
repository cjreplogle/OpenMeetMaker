package omm.meet.event;

import java.util.ArrayList;
import omm.meet.event.Event;

public class EventManager {
    static ArrayList<Event> eventList = new ArrayList<Event>(0);

    public EventManager() { }

    public static void addEvent(Event tmpEvent){
        eventList.add(tmpEvent);
    }

}
