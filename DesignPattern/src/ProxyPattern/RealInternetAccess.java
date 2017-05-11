package ProxyPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class RealInternetAccess {

    private String employeeName;

    public RealInternetAccess(String employeeName){
        this.employeeName = employeeName;
    }

    public void grantInternetAccess(){
        System.out.println("Real internet access granted to " +  employeeName);
    }
}
