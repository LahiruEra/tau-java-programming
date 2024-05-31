package chapter3;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

public class GradeMessage {

	public static void main(String[] args) {
		
		System.out.println("Enter your letter grade(from A,B,C,D,F): ");
		Scanner scanner=new Scanner(System.in);
		String grade=scanner.next();
		
		scanner.close();
		
		String message;
		
		switch(grade) {
		case "A":
			message = "Excellent job";
			break;
			
		case "B":
			message ="Great job";
			break;
			
		case "C":
			message ="Good Job";
			break;
			
		case "D":
		    message = "You need to work bit harder";
		    break;
		    
		case "F":
			message = "Oh no!";
			break;
			
			default:
				message = "Error! Inavlid Grade";
		    
			
		}
		System.out.println(message);

	}

}
