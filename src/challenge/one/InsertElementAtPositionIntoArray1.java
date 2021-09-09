package challenge.one;

import java.util.Scanner;

public class InsertElementAtPositionIntoArray1 {

	public static void main(String[] args) {

		/*Initial array a1= {2,4,6,8,10}, element to be inserted 5 between 4 and 6.
		Final array a1= {2,4,5,6,8,10}
		Precondition: the array should have sufficient space available for the insertion.*/
		
		int [] arr1 =new int[6];
		
		// Create the Array
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert a zero value as the last element of the Array");
		System.out.println("Enter the Individual Elements of the Integer Array : ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		// Output the Array
		System.out.println("Array before new element insertion :-");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		// Get the index position / location where new element is to be inserted.
		System.out.println("Enter the location for new Element : ");
		int ind=sc.nextInt();
		
		System.out.println("Enter the value to be inserted : ");
		int val=sc.nextInt();
		
		sc.close();
		
		// Swapping the element to right to make way for the new insertions.
		System.out.println("Swapping the element to right to make way for the new insertions.");
		for(int i=arr1.length-1;i>=ind;i--){
			arr1[i]=arr1[i-1];
		}
		arr1[ind]=val;
		
		// Output the Array.
		System.out.println("Array after new element is inserted : ");
		for(int n:arr1) {
			System.out.println(n);
		}
		
		
		
	}

}
