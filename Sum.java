package tester;

public class Sum {
	
	public static int  sum_of_digits(int n) {
		int digit;
		int sum =0;
		while(n > 0) {
			digit = n % 10;
			sum = sum + digit;
			n = n /10;
		}
		return sum;
	} 
	
	public static void main(String[] args) {
		
		int number = 222;
		
		System.out.println(sum_of_digits(number));
		

	}

}
