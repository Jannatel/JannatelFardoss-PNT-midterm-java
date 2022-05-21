package beginnerjava;

import java.util.Scanner;

public class ReversDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, r, sum=0, tem;
		
		System.out.print("Enter any number:  ");
         num = input.nextInt();
         
         
         tem = num;
         
         while( tem != 0) {
        	 
        	 
        	 r = tem % 10;
        	 
        	 sum = sum * 10 + r;
        	 
        	 tem = tem/10;
        	 
        	 
        	 
         }System.out.println(" the revers number is: "+ sum);
	}

}
