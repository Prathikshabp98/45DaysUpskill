package qa_upskilling_45.Day7;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void deposit(double amount)
	{
		if (amount > 0)
		{
			balance += amount ;
			
		}
		else
		{
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	public void withdrawn(double amount)
	{
         if (amount <= 0)
         {
        	 System.out.println("Withdrawal amount must be positive.");
         }
         else if(amount > balance)
         {
				System.out.println("Insufficient funds. Withdrawal failed.");
	     } 
         else 
         {
				balance -= amount;
        	 
         }
	}
	
	public double getBalance()
    {
		return balance;
	}
	
}
