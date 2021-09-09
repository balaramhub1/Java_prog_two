package challenge.one;

public class CountEvenOddDigits1 {

	public static void main(String[] args) {

		int n=12456789;
		
		countEvenOddDigits(n);
		
	}

	private static void countEvenOddDigits(int n) {
		int evenCount=0,oddCount=0, d;
		while(n>0) {
			d=n%10;
			if(d%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			n=n/10;
		}
		System.out.println("No of Even Digits is : "+evenCount + "\nNo of Odd Digits is : "+oddCount);
	}

}
