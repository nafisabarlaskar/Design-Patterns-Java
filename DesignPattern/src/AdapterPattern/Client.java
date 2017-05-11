package AdapterPattern;

/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class Client {
    public static void main(String[] args){
        CreditCard creditCard = new BankCustomer();
        creditCard.giveBankDetails();
        creditCard.getCreditCard();
    }
}
