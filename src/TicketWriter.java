import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * This class writes tickets to a file
 * @author Tre
 */
public class TicketWriter {
    public static void writeTicketFile(String fileName, TicketList list) throws IOException {
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        for(int i=0;i<list.getLength();i++) {
            out.writeObject(list.get(i));
        }
        out.close();
        file.close();
    }
}