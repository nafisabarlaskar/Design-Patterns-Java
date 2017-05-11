package FacadePattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class Client {
    public static void main(String args[]){
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.checkSystem(230,7);
    }
}
