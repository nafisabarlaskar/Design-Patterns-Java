package SingletonPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class DoubleCheckedLocking {

    private volatile static DoubleCheckedLocking uniqueInstance;

    private DoubleCheckedLocking(){

    }

    public static DoubleCheckedLocking getUniqueInstance(){
        if(uniqueInstance == null){
            synchronized (DoubleCheckedLocking.class){
                if(uniqueInstance==null){
                    uniqueInstance = new DoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }
}
