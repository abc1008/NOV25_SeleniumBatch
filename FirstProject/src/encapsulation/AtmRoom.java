package encapsulation;

public class AtmRoom
{
	
	public static void main(String[] args)
	{
		BankAccount bankAcc = new BankAccount();
		
		double bal = bankAcc.getBalance();
		System.out.println(bal);
		
		
		
	}

}
