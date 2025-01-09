package chapter3;  

import java.util.Scanner; 

/* 
 * Logical Operators: 
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */ 
 
public class LoanQualifierUsingLogicalOperator {

	public static void main(String[] args) {
		
		
		//Initialize what we know
		int reqSalary = 30000;
		int reqYears = 2;
		
		//Get the unknown
		System.out.println("Enter your salary: ");
		Scanner scanner=new Scanner(System.in);
		double salary=scanner.nextDouble();
		
		System.out.println("Enter the number of years with your current employer: ");
		double empYears=scanner.nextDouble();
		scanner.close();
		
		//Make decision
		
		if (salary >= reqSalary && empYears >= reqYears) {
				System.out.println("You are eligible to apply for a loan");
			
		}
		else {
			System.out.println("Sorry you are not eligible to apply for a loan");
		}
		

	}

}
