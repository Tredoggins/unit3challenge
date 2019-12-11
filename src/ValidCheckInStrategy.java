/**
 * This class implements the strategy pattern
 * @author Tre
 */
public class ValidCheckInStrategy implements CheckInStrategy{
    @Override
    public void checkIn() {
        Runner.addTicket(new Time(true));
    }
}
