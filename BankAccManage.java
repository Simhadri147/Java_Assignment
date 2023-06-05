import java.util.Scanner;
class BankAcc
{
	Scanner sc = new Scanner(System.in);
	double balance = 0.0;
	public void displaybal()
	{
		System.out.print("Available balance:"+balance);
	}
	public void deposit()
	{
		System.out.println("Enter amount you want to deposit:");
	double amount = sc.nextDouble();
		balance = balance+amount;
		System.out.println("Amount Deposited successfully");
		System.out.println("Total balance:"+balance);
	}
	public void withdraw()
	{
		System.out.println("Enter amount you want to withdraw:");
		double amount = sc.nextDouble();
		if(amount <= balance)
		{
	 	balance=balance - amount;
	 	System.out.println("Amount withdrawed successully");
		}
		else
		 System.out.println(" Transaction failed due to insufficient balance ..!");
		System.out.println("Available balance:"+balance);
		 
	}
	public void exit()
	{
			System.out.println("Thanks for the visit.\n Have a nice day");
			System.exit(0);
	}
}
class Main 
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
		BankAcc obj = new BankAcc();
		while(true)
		{
		   System.out.println("\n welcome to the bank account manager :");
	    System.out.println(" ");
	    System.out.println("1.Balance Enquiry");
	    System.out.println("2.Balance Deposit:");
	    System.out.println("3. Balance withdraw");
	    System.out.println("4.Quit");
	    System.out.println(" ");
	    System.out.println("Enter your choice(1 - 4):");
	   
	    int choice = sc.nextInt();
	   	switch(choice)
	    {
	    	case 1: 
	    	obj.displaybal();
	    	break;
	    	case 2:
	        obj.deposit();
	        break;
	        case 3:
	        obj.withdraw();
	        break;
	        case 4:
	        obj.exit();
	        break;
	        default :
	        System.out.println("Wrong choice try again.!!\n");
	     }
	    System.out.println("\n");
	    }
	}
}
	
