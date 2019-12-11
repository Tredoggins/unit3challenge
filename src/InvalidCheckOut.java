/**
 * This class implements the strategy pattern
 * @author Tre
 */
public class InvalidCheckOut implements CheckOutStrategy{
    @Override
    public void checkOut(Ticket ticket) {
        System.out.println("Not a valid Choice. Try again.");
    }
}
