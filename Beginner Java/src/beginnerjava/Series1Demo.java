package beginnerjava;

import java.util.Scanner;

public class Series1Demo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	int n, sum=0;
		
	System.out.print("Enter the number:  ");
	n= input.nextInt();
	
		for(int x=1; x<=n; x++) {
			
			sum = sum + x*x;
			
			
			System.out.print(x+"x"+x+"  ");
			
			
			
			
		}
		System.out.println();
		System.out.println(" The sum is: "+ sum);
		
	}

}
