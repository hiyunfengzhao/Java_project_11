/**
 * default account with Constructor id 1000 and zero balance
 * 
 * @author Yunfeng Zhao
 * 
 * @version Nov 21 2019
 * 
 * 
 */



public abstract class Account{

    private int id;
    private double balance;

    public Account(){
        id = 1000;
        balance = 0.0;

    }

    public Account(int id, double balance){

        this.id = id;
        this.balance = balance;

    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setID(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void deosit(double amount){
        if(amount <= 0)
            return;
        balance = balance + amount;

    }

    public abstract void withdraw(double amount);

    public String toString(){
        return "ID" + id + "\nBalance: $" + balance;
    }




}