package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void notifyAllObservers(){
        for(Observer observer : observerList){
            observer.update();
        }
    }

    public void addObserver(Observer observer){
        observerList.add(observer);
    }
}
