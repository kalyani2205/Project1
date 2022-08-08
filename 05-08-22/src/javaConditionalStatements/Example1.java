package javaConditionalStatements;

import java.util.Scanner;

/**
 * Relational oprators(>,<.>=,<=,==,and!=);
 * 
 * these operators will generate output in the 
 * form of boolean(true or false)
 */

public class Example1 {

	public static void main(String[] args) {
         
		int num1,num2;
		
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		
		Scanner scanner = new Scanner(System.in);
		num2 = scanner.nextInt();
		
		scanner.close();
		
	System.out.println("============");
	
	    System.out.println(">: "+(num1>num2));
	    System.out.println("<: "+(num1<num2));
	    System.out.println(">=: "+(num1=num2));
	    System.out.println("<=: "+(num1<=num2));
	    System.out.println("==: "+(num1==num2));
	    System.out.println("!=: "+(num1!=num2));


	   
    
	}

}
