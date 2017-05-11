package ObserverPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class BinaryObserver extends Observer{

    private int state;

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public void update(){
        state = subject.getState();
        System.out.println("State of subject in binary is " + Integer.toBinaryString(state));
    }
}
