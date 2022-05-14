package omm.meet.swimmer;

import java.lang.reflect.Array;
import java.util.ArrayList;

import omm.meet.swimmer.Swimmer;

public class SwimmerManager {
    static ArrayList<Swimmer> swimmerList = new ArrayList<Swimmer>(0);

    public SwimmerManager(){

    }

    public static void addSwimmer(Swimmer swimmer){
        swimmerList.add(swimmer);
    }

}
