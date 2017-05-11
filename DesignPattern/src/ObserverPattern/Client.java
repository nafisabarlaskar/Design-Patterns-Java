package ObserverPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class Client {
    public static void main(String[] args){
        Subject subject = new Subject();

        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        subject.setState(7);
        subject.setState(11);

    }
}
