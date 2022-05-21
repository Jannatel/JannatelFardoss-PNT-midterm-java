package array_demo;

import java.util.Arrays;

public class ArraySorting8 {

	public static void main(String[] args) {
		
		// number namer array toiri kore er value diya hoise ekhane
		
		int[] number = {10,-3,18,5,25};

		// Arrays is a class & sort is a method & name is Array's name 
		Arrays.sort(number);
		
		//smaller to larger
		
		System.out.print("Ascending:  " );
		for(int i=0; i<5; i++) {
			
			System.out.print(" " +number[i]);
		}
		
		
		System.out.println();
		//Larger to smaller
		System.out.print("Descending: " );
		
              for(int i=4; i>=0 ; i--) {
			
			System.out.print(" " +number[i]);
		}
		System.out.println();
             
		//string er sorting kora
              
              String[] name = {"Jannatel", "Yusuf", "Rokon", "Nargish"};
              
              Arrays.sort(name);
              System.out.print("Ascending:  " );
              for(int i=0; i<4; i++) {
            	  System.out.print(" " +name[i]);
              }
             
              System.out.println();
               
              System.out.print("Descending: " );
             
              for(int i=3; i>=0; i--) {
            	 
            	  System.out.print(" " +name[i]);
              }
	
	}
	
	

}
