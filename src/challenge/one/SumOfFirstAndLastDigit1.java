package challenge.one;

public class SumOfFirstAndLastDigit1 {

	public static void main(String[] args) {
		
		/*Program to get the Sum of First and Last Digit of a number.
		 * Described are two logics to do the same
		 */

		int n=34586;
		
		System.out.println("Sum of First and Last Digit of the Number is : "+sufFirstLastDigit(n));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Sum of First and Last Digit of the Number is : "+sufFirstLastDigit2(n));
	}

	private static int sufFirstLastDigit2(int n) {
		int lastDigit=n%10;
		while(n>=10) {
			n=n/10;
		}
		int firstDigit=n;
		return (firstDigit+lastDigit);
	}

	private static int sufFirstLastDigit(int n) {

		int firstDigit = 0,lastDigit;
		lastDigit=n%10;
		while(n>0) {
			n=n/10;
			if(n <10) {
				firstDigit=n;
				break;
			}
		}
		return (firstDigit+lastDigit);
	}

}
