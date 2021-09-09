package challenge.two;

import java.util.Scanner;

public class BubbleSort1
{

    /*1. In this, the elements are sorted in ascending or descending order
    by comparing two adjacent elements and place them based on ascending or descending order.
    
    2. If we have n elements, this sorting technique requires n-1 passess to sort.*/
    
    public static void main(String[] args)
    {
        int n[],sortedN[];
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the Array Size : ");
        int size=sc.nextInt();
        n=new int[size];
        
        // Fill the integer array.
        System.out.println("Enter the elements of the Integer array.");
        for(int i=0;i<size;i++) {
            n[i]=sc.nextInt();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        
        // Iterate through the elements.
        for(int x:n) {
            System.out.println(x);
        }
                
        sortedN=bubbleSortDesc(n);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Sorted Integer array in Descending order : ");
        for(int x:sortedN) {
            System.out.println(x);
        }
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        sortedN=bubbleSortAsc(n);
        System.out.println("Sorted Integer array in Ascending order : ");
        for(int x:sortedN) {
            System.out.println(x);
        }
        
    }

    /**
     * Bubble sort the integer array in Descending order.
     * @param n
     * @return the sorted integer array.
     */
    private static int[] bubbleSortDesc(int[] n)
    {
        int temp;
        for(int i=0;i<n.length;i++) {
            for(int j=1;j<n.length-i;j++) {
                if(n[j]>n[j-1]) {
                    temp=n[j-1];
                    n[j-1]=n[j];
                    n[j]=temp;
                }
            }
        }
        return n;
    }
    
    /**
     * Bubble sort the integer array in Ascending order.
     * @param n
     * @return the sorted integer array.
     */
    private static int[] bubbleSortAsc(int[] n)
    {
        int temp;
        for(int i=0;i<n.length;i++) {
            for(int j=1;j<n.length-i;j++) {
                if(n[j]<n[j-1]) {
                    temp=n[j-1];
                    n[j-1]=n[j];
                    n[j]=temp;
                }
            }
        }
        return n;
    }

}
