import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tre
 */
public class InMachine implements Machine{
    private CheckInStrategy[] strategies;
    public InMachine(){
        strategies= new CheckInStrategy[]{new InvalidCheckInStrategy(),new ValidCheckInStrategy()};
    }
    @Override
    public void run(){
        printMessage();
        Scanner scanner=new Scanner(System.in);
        int input=0;
        try {
            input = Integer.parseInt(scanner.nextLine());
        }
        catch (Exception e){

        }
        while(input!=3) {
            if(input==1){
                strategies[input].checkIn();
            }
            else{
                strategies[0].checkIn();
            }
            printMessage();
            try {
                input = Integer.parseInt(scanner.nextLine());
            }
            catch (Exception e){
                input=0;
            }
        }
    }

    @Override
    public void printMessage() {
        System.out.println("\nParking Garage\n");
        System.out.println("=========================\n");
        System.out.println("1 – Check/In\n");
        System.out.println("3 – Close Garage\n");
        System.out.print("=> ");
    }
}
