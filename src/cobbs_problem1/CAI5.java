package cobbs_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {
	
	static SecureRandom rand = new SecureRandom();
	static double randInt1 = rand.nextInt(10);
	static double randInt2 = rand.nextInt(10);
	static double correctAnswer;
	static double userAnswer;
	static double score;
	static double percentage;
	
	
	public static void main(String[] args )
	{//calls the quiz method
		quiz();	
		askQuestion();
	}
	
	
	
	public static void quiz()
	{//contains program logic
		System.out.println("What type of math problem would you like to do? 1 - addition, 2 - subtraction, 3 - mulitiplication, 4 - division, or 5 - random");
		Scanner mathType = new Scanner(System.in);
		int mathProblemType = mathType.nextInt(5);
		
		switch(mathProblemType)
		{
			case 1:
				correctAnswer = randInt1 + randInt2; 
			case 2:
				correctAnswer = randInt1 - randInt2;
			case 3:
				correctAnswer = randInt1 * randInt2;
			case 4:
				correctAnswer = randInt1 / randInt2;
			case 5:
				
		}
	}
	
	
	
	
	public static void askQuestion()
	{//prints the problem
		
		System.out.println("Choose your difficulty level from 1-4");
		Scanner choice = new Scanner(System.in);
		int level = choice.nextInt(4); 
		
		switch(level)
		{
			case 1: 		
				int i = 0;
			    for ( i = 0 ; i <= 9; i++ )
			    {
			      randInt1 = rand.nextInt(10);
			      randInt2 = rand.nextInt(10);
			      System.out.println("What is " + randInt1 + " times " + randInt2 + " ?");
			      readResponse();
			      quiz();
			      isAnswerCorrect();
			    }
			    break;
			case 2: 		
				int x = 0;
			    for ( x = 0 ; x <= 9; x++ )
			    {
			      randInt1 = rand.nextInt(99);
			      randInt2 = rand.nextInt(99);
			      System.out.println("What is " + randInt1 + " times " + randInt2 + " ?");
			      readResponse();
			      quiz();
			      isAnswerCorrect();
			    }
			    break;
			case 3: 		
				int j = 0;
			    for ( j = 0 ; j <= 9; j++ )
			    {
			      randInt1 = rand.nextInt(999);
			      randInt2 = rand.nextInt(999);
			      System.out.println("What is " + randInt1 + " times " + randInt2 + " ?");
			      readResponse();
			      quiz();
			      isAnswerCorrect();
			    }
			    break;
			case 4: 		
				int y = 0;
			    for ( y = 0 ; y <= 9; y++ )
			    {
			      randInt1 = rand.nextInt(9999);
			      randInt2 = rand.nextInt(9999);
			      System.out.println("What is " + randInt1 + " times " + randInt2 + " ?");
			      readResponse();
			      quiz();
			      isAnswerCorrect();
			    }
			    break;
		}
		displayCompletionMessage();
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
			score++;
			SecureRandom randCorrect = new SecureRandom();
			int correctResponse = randCorrect.nextInt(4);
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
			System.out.println("current score is: " + score  );
			
		}
		else 
		{
			displayIncorrectResponse();
		}
		randInt1 = rand.nextInt(10);
		randInt2 = rand.nextInt(10);	
	}
	
	
	
	
	public static void displayCompletionMessage()
	{
		percentage = (score * 100)/10 ; 
		System.out.println("Your percentage is " + percentage + "%" );
		
		if (percentage < 75)
		{
			System.out.println("Go see professor for help hoe");
		}
	}
	
	
	
	public static void displayCorrectResponse()
	{//prints out correct answer
		System.out.println("Your answer is " + correctAnswer + " that is correct!");	
	}
	
	
	
	public static void displayIncorrectResponse()
	{//prints out student's incorrect response
		SecureRandom randIncorrect = new SecureRandom();
		int incorrectResponse = randIncorrect.nextInt(4);
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
		
	}

}
