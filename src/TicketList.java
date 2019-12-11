import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a list of tickets
 * This class implements the singleton pattern
 * @author Tre
 */
public class TicketList {
    private static TicketList instance;
    private List<Ticket> tickets;
    private TicketList(){
        tickets=new ArrayList<Ticket>();
    }

    public static TicketList getInstance() {
        if(instance==null){
            instance=new TicketList();
        }
        return instance;
    }

    /**
     * Adds a list of tickets to the ticket list
     * @param tickets List of tickets to add to the ticket list
     */
    public void addAll(List<Ticket> tickets){
        this.tickets.addAll(tickets);
    }

    /**
     * Adds a ticket to the ticket list
     * @param ticket Ticket to add to the ticket list
     */
    public void add(Ticket ticket){
        this.tickets.add(ticket);
    }

    /**
     * @return The length of the ticket list
     */
    public int getLength(){
        return tickets.size();
    }

    /**
     * @param index The index of the ticket in the ticket list
     * @return The ticket at the index of the ticket list
     */
    public Ticket get(int index){
        return tickets.get(index);
    }

    /**
     * @param ticket The ticket to check out
     * @param lost If the ticket is lost or not
     */
    public void checkOutTicket(Ticket ticket,boolean lost){
        //change this to get real time v
        ticket.checkOut(ticket.checkOutTime,lost);
    }

}
