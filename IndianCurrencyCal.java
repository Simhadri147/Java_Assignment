import java.util.Scanner;
class IndianCurrencyCal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount:\n");
		int amount = sc.nextInt();
		
		int count2000 = amount / 2000;
		amount = amount % 2000;
		
		int count500 = amount / 500;
		amount = amount %500;
		
		int count200 = amount /200;
		amount = amount % 200;
		
		int count100 = amount /100;
		amount = amount % 100;
		
		int count50 = amount / 50;
		amount = amount % 50;
		
		int count10 = amount / 10;
		amount = amount %10;
		
		int count5 = amount / 5;
		amount = amount %5;
		
		int count2 = amount / 2;
		amount = amount %2;
		
		int count1 = amount;
		
		//printing amount 
		
		System.out.println("2000 * "+count2000+ " = " +2000*count2000);
		
		System.out.println("500  * "+count500+ " = " +500*count500);
		
		System.out.println("200  * "+count200+ " = " +200*count200);
		
		System.out.println("100  * "+count100+ " = " +100*count100);
		
		System.out.println("50   * "+count50+ " = " +50*count50);
		
		System.out.println("10   * "+count10+ " = " +10*count10);
		
		System.out.println("5    * "+count5+ " = " +5*count5);
		
		System.out.println("2    * "+count2+ " = " +2*count2);
		
		System.out.println("1    * "+count1+ " = " +1*count1);
		
		
		
	}
}
