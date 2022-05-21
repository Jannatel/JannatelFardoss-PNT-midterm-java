package beginnerjava;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int num, fact = 1;
		
		System.out.print(" Enter any positive integer: ");
		num= input.nextInt();
		
		
		for( int x= num; x>=1; x--) {
			
			
			
			fact = fact * x;
			
		}
             System.out.println("Factorial of " + num + " = " + fact);
	}

}
