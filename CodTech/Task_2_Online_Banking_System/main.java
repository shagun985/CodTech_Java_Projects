package in.sk.main;
import java.util.Scanner;

public class main 
{
	public static void main(String[] args)
	{
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no of Customers u have: ");
		n=obj.nextInt();
		BankDetails object[] = new BankDetails[n]; // n object's are declared.
		for(int i=0;i<object.length;i++)
		{
			object[i] = new BankDetails(); // object[i] is instantiated as well as initialized
			object[i].openAccount();
		}
		int choice;
		do
		{
			System.out.println("\n");
			System.out.println(" Online Banking System ");
			System.out.println("1. Display all account details\n"
					+ " 2. Search by Account number\n "
					+ "3. Deposit the amount \n "
					+ "4. Withdraw the amount \n "
					+ "5.Exit \n");
			System.out.println("Enter your Choice : ");  
			choice = obj.nextInt();
			switch(choice)
			{
			case 1:
				for (int i = 0; i < object.length; i++) 
				{  
                    object[i].showAccount_details();  
                }  
                break;  
            case 2:  
                System.out.print("Enter the Account no. you want to search: ");  
                String ac_no = obj.next();  
                boolean found = false;  
                for (int i = 0; i < object.length; i++) 
                {  
                    found = object[i].searchAccount(ac_no);  
                    if (found) 
                    {  
                        break;  
                    }  
                }  
                if (!found) 
                {  
                    System.out.println("Search failed! Account doesn't exist..!!");  
                }  
                break;  
            case 3:  
                System.out.print("Enter Account no. : ");  
                ac_no = obj.next();  
                found = false;  
                for (int i = 0; i < object.length; i++)
                {  
                    found = object[i].searchAccount(ac_no);  
                    if (found)
                    {  
                        object[i].depositMoney();  
                        break;  
                    }  
                }  
                if (!found)
                {  
                    System.out.println("Search failed! Account doesn't exist..!!");  
                }  
                break;  
            case 4:  
                System.out.print("Enter Account No : ");  
                ac_no = obj.next();  
                found = false;  
                for (int i = 0; i < object.length; i++)
                {  
                    found = object[i].searchAccount(ac_no);  
                    if (found)
                    {  
                        object[i].withdrawalMoney();  
                        break;  
                    }  
                }  
                if (!found)
                {  
                    System.out.println("Search failed! Account doesn't exist..!!");  
                }  
                break;  
            case 5:  
                System.out.println("See you soon...");  
                break;
			}
		}while(choice!=5);
	}
}