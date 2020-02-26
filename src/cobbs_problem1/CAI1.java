package cobbs_problem1;

import java.security.SecureRandom;
import java.util.Scanner;


public class CAI1 {
	
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
			System.out.println("Very good!");
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
		System.out.println("No. Please try again. Your answer was: " + userAnswer + "");
		quiz();
	}
}
