/**
 * This class implements the strategy pattern
 * @author Tre
 */
public class RegularCheckOut implements CheckOutStrategy{
    @Override
    public void checkOut(Ticket ticket) {
        Runner.tickets.checkOutTicket(ticket, false);
    }
}
