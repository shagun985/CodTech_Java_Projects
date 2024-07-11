package in.sk.main;
import java.util.Scanner;

class BankDetails
{
	private String accno;
	private String name;
	private String acc_type;
	private long balance;
	Scanner obj = new Scanner(System.in);
	// method to open a new account
	public void openAccount()
	{
		System.out.println("Enter Account no:");
		accno=obj.next();
		System.out.println("Enter Account Name:");
		name=obj.next();
		System.out.println("Enter Account type:");
		acc_type=obj.next();
		System.out.println("Enter Account Balance:");
		balance=obj.nextLong();
		
	}
	// method to show the account details
	public void showAccount_details()
	{
		System.out.println(" Account name: "+name);
		System.out.println(" Account no: "+accno);
		System.out.println(" Account Type :"+acc_type);
		System.out.println(" Account Balance: "+balance);
		
	}
	// method to deposit money
	public void depositMoney()
	{
		long value;
		System.out.println("Enter Amount to be deposited :");
		value=obj.nextLong();
		balance=balance+value;
		System.out.println("Current Balance is: "+balance);
	}
	// method to withdraw money
	public void withdrawalMoney()
	{
		long value;
		System.out.println("Enter Amount to be Withdrawn :");
		value=obj.nextLong();
		if(balance>=value)
		{
			balance=balance-value;
			System.out.println("Balance After Withdrawal :"+balance);
		}
		else
		{
			System.out.println("Insufficient funds...Transaction Failed");
		}
	}
	// method to search for an exiting account
	public boolean searchAccount(String ac_no)
	{
		if(accno.equals(ac_no))
		{
			showAccount_details();
			return(true);
		}
		return (false);
	}	
}
