/**
 * Main function to implement Account class
 * 
 * @author Yunfeng Zhao
 * 
 * @version Nov 21 2019
 * 
 * 
 */

public class Application{

    public static void main (String[] args){
// array accts with 4 elements
        Account [] accts = new Account[4];

        accts[0] = new CheckingAccount();
        accts[1] = new CheckingAccount(1001,5670.00);
        accts[2] = new SavingsAccount(2001,60000, 0.03);
        accts[3] = new SavingsAccount(1001,42000, 0.02);

        for(int i = 0; i < accts.length; i++)
            System.out.println("Account #" + (i+1) + " information: \n" + accts[i]);
        
        accts[0].withdraw(3000);
        accts[1].withdraw(10000);
        ((SavingsAccount) accts[2]).addInterest();
        accts[3].withdraw(60000);

        for(int i = 0; i < accts.length; i++)
            System.out.println("Now Account #" + (i+1) + " information: \n" + accts[i]);

}
}


/*SAMPLE RUN
Balance: $0.0
Account #2 information:
ID1001
Balance: $5670.0
Account #3 information:
ID2001
Balance: $60000.0
Interest Rate: 0.03
Account #4 information:
ID1001
Balance: $42000.0
Interest Rate: 0.02
*/