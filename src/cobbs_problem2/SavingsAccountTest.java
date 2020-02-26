package cobbs_problem2;

public class SavingsAccountTest {

	public static void main(String args[])
	{
		SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        
        SavingsAccount.modifyInterestRate(.04);
        saver1.calculateMonthlyInterest();
        SavingsAccount.modifyInterestRate(.04);
        saver2.calculateMonthlyInterest();
       
        SavingsAccount.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        SavingsAccount.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();
	}
	
	
	
}
