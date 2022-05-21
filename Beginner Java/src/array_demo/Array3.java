package array_demo;

public class Array3 {

	public static void main(String[] args) {
		
		int[] num = {10,20,30,40,50,60};
		int sum=0;
		
		System.out.println(num.length);
		
		for(int x : num) {
			
			sum = sum + x;
		}
		
		System.out.println(sum);
		
		

	}

}
