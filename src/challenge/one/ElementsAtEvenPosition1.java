package challenge.one;

import java.util.Scanner;

public class ElementsAtEvenPosition1 {

	static Scanner sc;
	static int[] x;
	public static void main(String[] args) {

		/*To Display elements at even positions.*/
		
		sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int n=sc.nextInt();
		
		int x[] =new int[n];
		System.out.println("Enter the Elements of Array : ");
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		System.out.println("Array is initialized with below values : ");
		for(int i=0;i<n;i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("Elements at Even positions are : ");
		for(int i=2;i<n;i=i+2) {
			System.out.println(x[i]);
		}
	}

}
