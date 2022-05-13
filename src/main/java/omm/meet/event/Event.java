package omm.meet.event;

import java.util.List;

public class Event {
    private List<SwimmerEvent> participants;
    private String stroke;
    private int length;
    private String gender;
    private int age;

    public Event(String stroke, int length, String gender, int age) {
        this.stroke = stroke;
        this.length = length;
        this.gender = gender;
        this.age = age;
    }

}
