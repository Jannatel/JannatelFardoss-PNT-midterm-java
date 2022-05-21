package beginnerjava;

import java.util.Scanner;

public class Series2Demo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n, result = 1;
		
		System.out.print("Enter the last number:  ");
		n= input.nextInt();
		
	
		
		for(int x= 1; x<=n; x=x+2) {
			
			System.out.print(x+" ");
			result = result * x;
			
			
			}
             
		     System.out.println();
             
              System.out.println("The result is: "+ result);
	}

}
