import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * This class represents a point in time
 * @author Tre
 */
public class Time implements Serializable {
    public static LocalTime CURRENT= LocalTime.now();
    private final int TIME;
    private final boolean AM;
    //don't need this constructor when real time
    public Time(boolean am){
        AM=am;
        if (am) {
            TIME = (int) Math.floor(Math.random() * 6 + 7);
        } else {
            TIME = (int) Math.floor(Math.random() * 11 + 1);
        }
    }
    public Time(){
        if(CURRENT.getHour()>12){
            TIME=CURRENT.getHour()-12;
            AM=false;
        }
        else{
            TIME=CURRENT.getHour();
            AM=true;
        }
    }
    public int getTIME() {
        return TIME;
    }
    public boolean isAM() {
        return AM;
    }
    @Override
    public String toString(){
        if(AM) {
            return TIME + "am";
        }
        else{
            return TIME + "pm";
        }
    }
}
