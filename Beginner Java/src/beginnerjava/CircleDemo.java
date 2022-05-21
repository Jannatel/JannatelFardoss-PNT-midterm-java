package beginnerjava;

import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double r, area ;
		
		System.out.print("Enter radius: ");
		r = input.nextDouble();
		
		
     area = 3.1416 * r * r;
     
     System.out.print(" area = " + area);
     
     
	}

}
