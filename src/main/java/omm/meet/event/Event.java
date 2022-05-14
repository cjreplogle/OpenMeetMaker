package omm.meet.event;

import com.itextpdf.kernel.pdf.PdfDocument;
import omm.meet.swimmer.Entry;

import java.util.ArrayList;

public class Event {
    private ArrayList<Entry> participants;
    private String stroke;
    private String distance;
    private String gender;
    private String ageGroup;

    public Event(String stroke, String distance, String gender, String ageGroup) {
        this.stroke = stroke;
        this.distance = distance;
        this.gender = gender;
        this.ageGroup = ageGroup;
    }

    public String[] getParticipants() {
        String[] particpantNames = new String[participants.size()];
        for(int i=0; i< participants.size(); i++){
            particpantNames[i] = participants.get(i).getName();
        }
        return particpantNames;
    }

    public ArrayList<Entry> seedParticipants() {
        int seedNumber = 0;
        ArrayList<Entry> seeding = new ArrayList<Entry>(participants.size());
        for(int i=0; i<participants.size(); i++){
            double max = Double.MAX_VALUE;
            int maxIndex = -1;
            for(int j=1; j<participants.size()-i; j++){
                if(participants.get(j).getEntryTimeMS()<max){
                    max = participants.get(j).getEntryTimeMS();
                    maxIndex = j;
                }
            }
            if(maxIndex != -1) {
                seeding.add(participants.get(maxIndex));
            } else {
                System.out.println("Skill issue");
            }
            participants.remove(maxIndex);
        }
        return seeding;
    }

}
