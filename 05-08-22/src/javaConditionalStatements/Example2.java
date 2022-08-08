package javaConditionalStatements;


import java.util.Scanner;

//if statement
public class Example2 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number");
		number = scanner.nextInt();
		
		scanner.close();
		
		//-5,-4,-3,-2,-1,0,1,2,3,4,5
		
		boolean condition = (number > 0);
		
		System.out.println("validation status: "+condition);
		
		System.out.println("================");
		
		if(condition)
		{
			System.out.println(number+" is positive number");
		}
		
	}

}
