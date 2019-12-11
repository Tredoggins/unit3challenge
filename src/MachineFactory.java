/**
 * This class implements the factory pattern
 * @author Tre
 */
public class MachineFactory {
    public Machine getMachine(String machineType){
        switch (machineType){
            case "in":
                return new InMachine();
            case "out":
                return new OutMachine();
            default:
                return new InMachine();
        }
    }
}
