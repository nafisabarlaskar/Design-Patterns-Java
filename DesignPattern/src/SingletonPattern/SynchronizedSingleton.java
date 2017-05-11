package SingletonPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton(){

    }

    public static synchronized SynchronizedSingleton getUniqueInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
