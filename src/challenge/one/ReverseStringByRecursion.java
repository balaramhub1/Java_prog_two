package challenge.one;

public class ReverseStringByRecursion
{

    /*Reverse a String using Recursion.*/
    
    public static void main(String[] args)
    {

        String s="hello";
        
        System.out.println(recursiveReverseTheString(s));
    }

    private static String recursiveReverseTheString(String s)
    {
        if(s==null || s.length()<=1) {
            return s;
        }
        return recursiveReverseTheString(s.substring(1))+s.charAt(0);
    }

}
