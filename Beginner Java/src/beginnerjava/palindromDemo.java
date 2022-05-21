package beginnerjava;

import java.util.Scanner;

public class palindromDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
          int num, tem, r, sum=0 ;
          
          System.out.print("Enter any number:  ");
          num= input.nextInt();
          
          tem = num;
          
          while(tem!=0) {
        	  
        	  r = tem%10;
        	  
        	  sum= sum*10 +r;
        	  
        	  tem= tem/10;
        	  
        	  
          } if (num == sum) {
        	  
        	  
        	  System.out.println( "palindreon number: "+ sum );
        	  
          }else { 
        	  
        	  System.out.println(" not palindron number:  " + sum);
          }
          
		
		
		
	}

}
