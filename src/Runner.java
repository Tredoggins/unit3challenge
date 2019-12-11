import java.io.IOException;
import java.util.*;

/**
 * @author Tre
 */
public class Runner {
    public static TicketList tickets;
    private static Time realTime;
    public static boolean keepGoing=true;
    public static void main(String[] args){
        tickets=TicketList.getInstance();
        Runner runner=new Runner();
    }
    public Runner(){
        try {
            tickets.addAll(TicketReader.readTicketFile("tickets.txt"));
        }
        catch (Exception e){

        }
        MachineFactory factory=new MachineFactory();
        Machine in=factory.getMachine("in");
        Machine out=factory.getMachine("out");
        in.run();
        out.run();
    }

    /**
     * Prints the receipt for the parking garage
     */
    public static void printFinalReceipt(){
        System.out.println("\nParking Garage\n");
        System.out.println("=========================\n");
        System.out.println("Activity to Date\n");
        System.out.println("\n$"+Ticket.totalNormal+" Collected from "+Ticket.amountNormal+" Check/Ins\n");
        System.out.println("$"+Ticket.totalLost+" Collected from "+Ticket.amountLost+" Lost Tickets\n");
        System.out.println("\n$"+(Ticket.totalNormal+Ticket.totalLost)+" was collected overall\n");
        keepGoing=false;
        try {
            TicketWriter.writeTicketFile("tickets.txt", tickets);
        }
        catch (IOException e){

        }
    }
    public static void addTicket(Time intime){
        tickets.add(new Ticket(intime));
    }

}
