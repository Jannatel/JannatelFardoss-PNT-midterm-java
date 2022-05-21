package beginnerjava;


public class FibonacciDemo1 {

	public static void main(String[] args) {
	
		
	
	
	
	
	int n= 40;
	
	int first= 0;
	int second= 1;
	int fib;
	
	System.out.print(first+" "+second);
	
	for(int i=3; i<=n; i++) {
		
		fib= first + second;
		System.out.print(" "+ fib);
		
		first= second;
		second = fib;
		
		
	}
	
		
		

	}

}
