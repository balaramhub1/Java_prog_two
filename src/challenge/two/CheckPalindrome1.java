package challenge.two;

public class CheckPalindrome1
{

    /*Program to check a string is Palindrome or Not.*/
    
    public static void main(String[] args)
    {
        String s="malayalam";
        
        System.out.println(checkPalindromeString1(s));
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println(checkPalindromeString2(s));
        
    }

    /**
     * Method to check if the input string is a Palindrome.
     * by comparing 1st element with last element, 1st +1 element with last -1 element and so on.
     * @param s
     * @return
     */
    private static boolean checkPalindromeString1(String s)
    {
        System.out.println("By traversing through individual elements.");
        if(s==null || s.isEmpty() || s.equals(" ") || s.length()%2==0) {
            System.out.println("Incorrect input..");
            return false;
        }
        
        int i=0, j=s.length()-1,mid=j/2;
        
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
       return true; 
        
    }
    
    /**
     * Method to check the input string is Palindrome or not.
     * By using reverse method and String builder.
     * @param s
     * @return
     */
    private static boolean checkPalindromeString2(String s)
    {
        System.out.println("By reversing the input and checking with original input String.");
        if(s==null || s.isEmpty() || s.equals(" ") || s.length()%2==0) {
            System.out.println("Incorrect input..");
            return false;
        }
        StringBuilder sb=new StringBuilder(s);
        String revStr = sb.reverse().toString();
        if(s.equals(revStr)) {
            return true;
        }else {
            return false;
        }
    }

}
