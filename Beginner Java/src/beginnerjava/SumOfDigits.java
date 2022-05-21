package beginnerjava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int num, r, tem, sum=0;
		
		
		System.out.print("Enter any number:  ");
		num=input.nextInt();
		
		tem = num;
		
		while(tem!=0) {
			
			
			r = tem%10;
			
			sum = sum + r;
			
			tem = tem/10;
			
			
			
			
		}System.out.println("The sum of number is:   " + sum);
	
	}    

}
