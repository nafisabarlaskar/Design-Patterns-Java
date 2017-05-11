package ObserverPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
