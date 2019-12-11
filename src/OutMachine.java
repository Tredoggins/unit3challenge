import java.util.Scanner;

/**
 * This class simulates a machine for a car park that a user interacts with when leaving
 * @author Tre
 */
public class OutMachine implements Machine{
    private CheckOutStrategy[] strategies;
    public OutMachine(){
        strategies=new CheckOutStrategy[]{new InvalidCheckOut(),new RegularCheckOut(),new LostCheckOut()};
    }

    @Override
    public void run(){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<Runner.tickets.getLength();i++) {
            //checking out stuff
            if(!Runner.tickets.get(i).isClosed()) {
                printMessage();
                int input=0;
                try {
                    input = Integer.parseInt(scanner.nextLine());
                }
                catch (Exception e){
                }
                if(input!=1&&input!=2){
                    input=0;
                    i--;
                }
                strategies[input].checkOut(Runner.tickets.get(i));
            }
        }
        Runner.printFinalReceipt();
    }

    @Override
    public void printMessage() {
        System.out.println("\nParking Garage\n");
        System.out.println("=========================\n");
        System.out.println("1 – Check/Out\n");
        System.out.println("2 – Lost Ticket\n");
        System.out.print("=> ");
    }
}
