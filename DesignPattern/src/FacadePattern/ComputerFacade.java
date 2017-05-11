package FacadePattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class ComputerFacade {

    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade(){
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();
    }

    public void checkSystem(int hardDiskSize, int ramSize){

        if(hardDiskSize > 220 || ramSize > 6){
            hardDrive.diskSpaceLimit();
            memory.memoryExceeded();
            cpu.freeze();
        }
    }
}
