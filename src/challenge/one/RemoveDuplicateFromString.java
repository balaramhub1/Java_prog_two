package challenge.one;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString
{

    /*Program to remove the duplicate elements in a String. */
    
    public static void main(String[] args)
    {
    
        String s="helloabbccc";
        
        System.out.println(removeDuplicate1(s));
        
        System.out.println(removeDuplicate2(s));

    }

    private static String removeDuplicate1(String s)
    {

        Set<Character> set1=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        char c[]=s.toCharArray();
        for(Character x:c) {
            if(!set1.contains(x)) {
                set1.add(x);
                sb.append(x);
            }
        }
        
        return sb.toString();
    }
    
    
    /*Another implementation to remove the Duplicate characters.*/
    
    private static String removeDuplicate2(String s)
    {
        Set<Character> set1=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        char c[]=s.toCharArray();
        for(Character x:c) {
                set1.add(x);
        }
        
        for(Character y: set1) {
            sb.append(y);
        }
        
        return sb.toString();
    }

}
