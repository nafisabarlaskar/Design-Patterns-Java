package SingletonPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class LazyInitialization {

    private static LazyInitialization uniqueInstance;
    private LazyInitialization(){

    }

    public static LazyInitialization getUniqueInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new LazyInitialization();
        }

        return uniqueInstance;

    }
}
