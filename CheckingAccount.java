/**
 * Checking Account of Account
 * 
 * @author Yunfeng Zhao
 * 
 * @version Nov 21 2019
 * 
 * 
 */


public class CheckingAccount extends Account{



    // using super to inherit Account class constructor
    public CheckingAccount(){
        super();
    }

    // same as above, create a corresponding constructor as default Account class
    public CheckingAccount(int id, double balance){
        super(id,balance);
    }

    public void withdraw(double amount){
        if (amount <= 0 || amount > getBalance())
            return;
        SetBalance(getBalance() - amount);
    }
}