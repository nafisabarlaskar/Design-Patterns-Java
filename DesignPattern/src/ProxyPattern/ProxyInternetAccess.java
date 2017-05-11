package ProxyPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class ProxyInternetAccess implements CollegeInternetAccess {

    private String employeeName;
    RealInternetAccess realInternetAccess;


    public ProxyInternetAccess(String employeeName){
        this.employeeName = employeeName;
    }

    public void grantInternetAccess(){
        if( getRole(employeeName) > 4 ){
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        } else{
            System.out.println("Internet access cannot be granted to " +  employeeName);
        }
    }

    int  getRole(String employeeName){
        if(employeeName.equals("ADMIN")){
            return 9;
        }else
            return 1;
    }
}
