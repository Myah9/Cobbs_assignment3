package cobbs_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	static SecureRandom rand = new SecureRandom();
	static int randInt1 = rand.nextInt(10);
	static int randInt2 = rand.nextInt(10);
	static int correctAnswer;
	static int userAnswer;
	
	public static void main(String[] args )
	{//calls the quiz method
		quiz();	
	}
	
	public static void quiz()
	{//contains program logic
		correctAnswer	= randInt1 * randInt2; 
		askQuestion();
		readResponse();
		isAnswerCorrect();
	}
	
	
	public static void askQuestion()
	{//prints the problem 
		System.out.println("What is the result of " + randInt1 + " times " + randInt2 + "?");	
	}
	
	
	public static void readResponse()
	{//reads answer from student
	  Scanner sc = new Scanner(System.in);
	  userAnswer = sc.nextInt();
	}
	
	
	public static void isAnswerCorrect()
	{//checks to see if answer is correct
		if (correctAnswer == userAnswer)
		{
			SecureRandom randCorrect = new SecureRandom();
			int correctResponse = randCorrect.nextInt(5);
			switch(correctResponse)
			{
			 case 1: 
				 System.out.println("Very good!");	 
				 break;
			 case 2: 
				 System.out.println("Excellent!");
				 break;
			 case 3:
				 System.out.println("Nice Work!");
				 break;
			 case 4: 
				 System.out.println("Keep up the good work");
				 break;
			}
			displayCorrectResponse();
		}
		else 
		{
			displayIncorrectResponse();
		}
	}
	
	
	public static void displayCorrectResponse()
	{//prints out correct answer
		System.out.println("Your answer is " + correctAnswer + " that is correct!");	
	}
	
	public static void displayIncorrectResponse()
	{//prints out student's incorrect response
		SecureRandom randIncorrect = new SecureRandom();
		int incorrectResponse = randIncorrect.nextInt(5);
		switch(incorrectResponse)
		{
		 case 1: 
			 System.out.println("No. Please try again.");	 
			 break;
		 case 2: 
			 System.out.println("Wrong. Try once more.");
			 break;
		 case 3:
			 System.out.println("Don't give up!");
			 break;
		 case 4: 
			 System.out.println("No. Keep trying.");
			 break;	
		}
		quiz();
	}

}
