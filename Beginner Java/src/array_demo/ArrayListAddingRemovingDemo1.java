package array_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddingRemovingDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> number = new ArrayList<Integer>();

		System.out.println("size = "+ number.size());
		
		
		// Adding elements
		// .add method using
		
		number.add(10);
		number.add(20);
		number.add(30);
		// adding elememts value with index number
		number.add(3,40);
		
		System.out.println("ArrayList contains: " + number);
		
		System.out.println();
		
		System.out.println("size = "+ number.size());
		
		
		//Removing
		
		number.remove(2);
		System.out.println("After removing:   " + number);
		
		number.removeAll(number);
		System.out.println("After removing all: " + number);
		
	}

}
