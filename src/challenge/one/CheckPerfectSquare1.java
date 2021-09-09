package challenge.one;

import java.util.Scanner;

public class CheckPerfectSquare1 {

	public static void main(String[] args) {

		/*Program to chekc if a number is a Perfect Square.
		Ex: 4, 16, 25, 36...etc.*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ot check if its Perfect Square : ");
		int sq=sc.nextInt();
		
		isPerfectSquare1(sq);
		sc.close();
	}

	/**
	 * This is one way of implementation.
	 * iterating for 2 to n/2 and finding if i*i is equal to the number.
	 * @param n
	 */
	private static void isPerfectSquare1(int n) {
		boolean isSquare=false;
		int i=2;
		while(i<=n/2) {
			if(i*i==n) {
				isSquare=true;
			}
			i++;
		}
		if(isSquare) {
			System.out.println(n+" - is a Perfect Square");
		}else {
			System.out.println(n+" - is NOT a Perfect Square");
		}
		
	}

}
