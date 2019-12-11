/**
 * This class implements the strategy pattern
 * @author Tre
 */
public class LostCheckOut implements CheckOutStrategy{
    @Override
    public void checkOut(Ticket ticket) {
        Runner.tickets.checkOutTicket(ticket, true);
    }
}
