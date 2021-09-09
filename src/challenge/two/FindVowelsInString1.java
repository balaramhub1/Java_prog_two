package challenge.two;

import java.util.Scanner;

public class FindVowelsInString1
{

    /*Find vowels in a input String.*/
    
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : - ");
        
        String str=sc.nextLine();
        char ch[] = str.toCharArray();
        int count=0;
        
        for(char c: ch) {
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                break;
            }
        }
        
        System.out.println("No of vowels in the input String = "+count);
    }

}
