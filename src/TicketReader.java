import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * This class reads the tickets from a file
 * @author Tre
 */
public class TicketReader {
    public static List<Ticket> readTicketFile(String fileName) throws IOException, ClassNotFoundException {
        List<Ticket> ticketList=new ArrayList<Ticket>();
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(file);
        Object obj = null;try {// Allow the EOF Exception to happen
            while ((obj = ois.readObject()) != null) {Ticket ticket= (Ticket) obj;ticketList.add(ticket);}} catch (EOFException e) {// Do nothing, we expect this to happen
        }
        file.close();
        ois.close();
        return ticketList;

    }
}
