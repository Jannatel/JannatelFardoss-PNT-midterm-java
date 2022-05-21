package beginnerjava;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
	
		
		int num1, num2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number:  ");
		num1 = input.nextInt();
		
		System.out.print("Enter second number:  ");
		num2 = input.nextInt();

		result = num1 + num2;
		System.out.println("sum = "+ result );
		
		result = num1 - num2;
		System.out.println("sub = "+ result );
		
	     result = num1 * num2;
		System.out.println("multiplication = "+ result );
		
		double result2 = (double) num1 / num2;
		System.out.println("divided = "+ result2 );
		
		result = num1 % num2;
		System.out.println("reminder = "+ result );
		

	}

}
