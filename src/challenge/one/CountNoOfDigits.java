package challenge.one;

public class CountNoOfDigits {

	public static void main(String[] args) {

		int n=1245346;
		
		findNoOfDigit(n);
		
	}

	static void findNoOfDigit(int n) {

		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("No of digits are : "+count);
	}

}
