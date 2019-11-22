# Java_project_11
Bank Account implementation. 

******

Write bank Account family classes. The Account class is base class. CheckingAccount and SavingsAccount are derived classes. The class diagrams are following:

******

The Account class withdraw method is implemented by doing nothing.

The CheckingAccount withdraw method must fulfill the policy that the withdraw amount must greater than 0 and less than or equal to current account balance.

The SavingsAccount withdraw method must fulfill the policy that the minimum balance of the account must be 500 all the time. Also the withdraw amount must greater than 0.

If the condition cannot be fulfilled, either withdraw method will do nothing but return. When addInterest method in SavingsAccount class, the account balance updated to current_balance * (1 + interestRate) where interestRate is in decimal form. For instane, 6% is 0.06.

We have to write a main function to test these accounts, but for main function, we have to polymorphism to handle a collection of accounts.

Also, for main function,

1. Declare an array of Account, named accounts, of size 4

2. Initialize every element in accounts array.

Make accounts[0] and accounts[1] be CheckingAccount and accounts[2] and accounts[3] be SavingsAccount

3. Make deposit and withdraw for each account and print out the account information to see the result

4. If the account is SavingsAccount, call addInterest function to update the account balance. Then print out the account information
