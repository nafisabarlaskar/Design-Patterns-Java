package ObserverPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class HexaObserver extends Observer {

    private int state;

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public void update(){
        state = subject.getState();
        System.out.println("State of subject in hexadecimal is " + Integer.toHexString(state));
    }
}
