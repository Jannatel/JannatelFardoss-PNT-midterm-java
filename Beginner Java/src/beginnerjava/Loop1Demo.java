package beginnerjava;

import java.util.Scanner;

public class Loop1Demo {

	
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
		int sum=0;
		int m,n;
		
		System.out.print("Enter the initial number:  ");
		m = input.nextInt();
		
		System.out.print("Enter the final number:  ");
		n = input.nextInt();
		
		
		
		
		
		for(int x=m; x<=n; x++) {
			
			if (x%2!=0) {
				sum = sum + x;
				
				System.out.print(" "+x);
			}
				
			
			
		}
		
		System.out.println();
		System.out.println("The sum is: "+ sum);
	}
		
		
		
}		
		
		
		
		
		
