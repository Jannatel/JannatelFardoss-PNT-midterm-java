package array_demo;

import java.util.Scanner;

public class ArrayMaxMinDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		double [] number = new double [5];
		 double sum = 0;
		
		System.out.println("Please enter 5 digits: ");
		
		for (int i=0; i<number.length; i++) {
			
			number [i]= input.nextDouble();
			
			}
		
		for(int i=0; i<number.length; i++) {
			
			sum = sum + number[i];
			
			
			
		}
		
		System.out.println(" The sum is:  "+ sum);
		
		double avg = sum/ number.length;
		
		System.out.println("The average is:  "+ avg);
		
		double max = number[0];
		double min = number[0];
		
		for(int i=1; i<5; i++) {
			
			if( max < number[i]) {
				max = number[i];
			}
			if(min>number[i]) {
				  
				  min = number[i];
		 
		   }
		  
		}
		       
		
		System.out.println("The max number is:  "+ max);
				
		System.out.println("The min number is:  "+ min);

				
		
		
		
		  
		
	}

}
