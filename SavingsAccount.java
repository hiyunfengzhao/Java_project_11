/**
 * Savings Account of Account
 * 
 * @author Yunfeng Zhao
 * 
 * @version Nov 21 2019
 * 
 * 
 */


public class SavingsAccount extends Account{
    
    private double interestRate;

    // using super to inherit Account class constructor and add set up interest rate
    public SavingsAccount(int id, double balance, double interestRate){
        super(id, balance);
        this.interestRate = interestRate;
    }
    
    // set up default values of savings account.
    public SavingsAccount(){
        this(1000, 0.0, 0.02);
    }

    public SavingsAccount(int id, double balance){
        this(id, balance, 0.02);
    }

    public void setInterestRate(double interestRate){

        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        
        return interestRate;

    }

    public void withdraw(double amount){
        if (amout > 0 && amount <= getbalance() - 500.00)
            setBalance(getbalance() - amount);

    }

    public void addInterest(){
        setBalance(getBalance() * (1+interestRate));
    }

    public String toString(){
        return super.toString() + "\nInterest Rate: " + interestRate;


    }




    }


