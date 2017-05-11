package ProxyPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class Client {
    public  static void main(String[] args){
        CollegeInternetAccess collegeInternetAccess = new ProxyInternetAccess("Nafisa");
        collegeInternetAccess.grantInternetAccess();
    }
}
