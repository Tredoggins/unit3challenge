/**
 * This class implements the strategy pattern
 * @author Tre
 */
public class InvalidCheckInStrategy implements CheckInStrategy{
    @Override
    public void checkIn() {
        System.out.println("Not a valid Choice. Try again.");
    }
}
