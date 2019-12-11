import java.io.Serializable;
import java.util.ArrayList;

/**
 * This class represents a ticket a user would get at a parking garage
 * @author Tre
 */
public class Ticket implements Serializable {
    private final Time checkInTime;
    public static int amount;
    private final int id;
    private boolean closed=false;
    public static int totalNormal;
    public static int totalLost;
    public static int amountNormal;
    public static int amountLost;
    //comment this out v
    public final Time checkOutTime;
    public Ticket(Time intime){
        checkInTime=intime;
        //comment this out v
        checkOutTime=new Time(false);
        amount++;
        id=amount;
    }

    /**
     * @param outtime Time the ticket is to be checked out
     * @param lost If the ticket was lost
     */
    public void checkOut(Time outtime,boolean lost){
        int cost=25;
        System.out.println("\nParking Garage\n");
        System.out.println("=========================\n");
        System.out.println("Reciept for Vehicle id: "+id+"\n");
        if(!lost) {
            int time = Math.abs(outtime.getTIME()+12 - checkInTime.getTIME());
            if(time>=3){
                cost =5+(time-3);
            }
            else{
                cost=5;
            }
            if(cost>15){
                cost=15;
            }
            System.out.println("\n"+time+" hours parked "+checkInTime.toString()+" - "+outtime.toString()+" \n");
            System.out.println("$"+cost+".00");
            totalNormal+=cost;
            amountNormal++;
        }
        else{
            System.out.println("\nLost Ticket\n");
            System.out.println("$ "+cost+".00");
            totalLost+=cost;
            amountLost++;
        }
        closed=true;

    }

    public boolean isClosed() {
        return closed;
    }
}
