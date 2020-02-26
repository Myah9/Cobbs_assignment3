package cobbs_problem2;

public class SavingsAccount {

	private static double annualInterestRate;
	private double savingBalance;
	
	
	public SavingsAccount(double balance) 
	{
		savingBalance = balance;
	}

	public void calculateMonthlyInterest()
	{/*calculate the monthly interest by multiplying the 
		savingsBalance by annualInterestRate divided by 12—this 
		interest should be added to savingsBalance. 
	 */ 
	  System.out.println("Your current savings balance: " + savingBalance);
	  double monthlyInt;
	  monthlyInt = (savingBalance*annualInterestRate)/12;
	  savingBalance = monthlyInt + savingBalance;
	  System.out.println("Your updated saving balance: " + savingBalance);
	}
	
	public static void modifyInterestRate(double newInterest)
	{// annualInterestRate to a new value
		annualInterestRate = newInterest; 
	}

	
}
