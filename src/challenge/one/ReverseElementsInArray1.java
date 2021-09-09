package challenge.one;

public class ReverseElementsInArray1 {

	/*Program to reverse elements in an Integer Array, without using another Array*/
	
	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int b[]= {2,4,6,8,10,11};
		
		reverseIntArray(b);
		
		reverseIntArray(a);
	}

	private static void reverseIntArray(int[] x) {
		
		System.out.print("Array before Reversing : ");
		for(int n:x) {
			System.out.print(n);
			System.out.print(',');
		}
		System.out.println("\n+++++++++++++++++++++++++++++++++++++=");
		
		int left=0,right=x.length-1;
		
		while(left<right) {
			int temp=x[left];
			x[left]=x[right];
			x[right]=temp;
			
			left++;
			right--;
		}
		
		System.out.print("Array after Reversing : ");
		for(int n:x) {
			System.out.print(n);
			System.out.print(',');
		}
		System.out.println("\n+++++++++++++++++++++++++++++++++++++=");
	}


}
