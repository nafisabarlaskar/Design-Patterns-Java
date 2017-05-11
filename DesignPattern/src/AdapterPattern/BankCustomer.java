package AdapterPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * Created by NafisaBarlaskar on 07-02-2017.
 */
public class BankCustomer extends BankDetailsAdaptee implements CreditCard{

    public void giveBankDetails(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter bank name:");
            String bankName = bufferedReader.readLine();
            setBankName(bankName);

            System.out.println("Enter account holder name:");
            String accountHolderName = bufferedReader.readLine();
            setAccountHolderName(accountHolderName);

            System.out.println("Enter account number:");
            long accountNumber = Long.parseLong(bufferedReader.readLine());
            setAccountNumber(accountNumber);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void getCreditCard(){
        long accountNumber = getAccountNumber();
        String accountHolderName = getAccountHolderNameName();
        String bankName = getBankName();

        System.out.println(" " + accountHolderName + "has an account in " + bankName + " bank with account number " + accountNumber);
    }
}
