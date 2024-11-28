package chapter2;

import java.util.Scanner; 

public class OptionalExercise {  
	
	public static void main(String arg[]) {
		
		//Ask user for a season of the year 
		
		System.out.println("Enter a season of the year");
		Scanner scanner = new Scanner(System.in);
		String season = scanner.next();
		
		
		//Ask for a whole number
		System.out.println("Enter a whole number");
		int num = scanner.nextInt();
		
		//Ask for an adjective.
		System.out.println("Enter an adjective");
		String adj = scanner.next();
		
		scanner.close();
		
		
		
		//Print 'On a <adjective><season> day, I drink a minimum of <number> cups of tea.'
		System.out.println("On a " + adj +" "+ season + " day, I drink a minimum of " +num+ " cups of tea..");
		
	}

}
