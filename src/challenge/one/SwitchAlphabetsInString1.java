package challenge.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SwitchAlphabetsInString1
{
    /*Program to switch alphabet characters in a String.
    Ex: 
    if  input String is "a$bc&de#fg!"
    
        output should be "g$fe&dc#ba!"*/

    public static void main(String[] args)
    {
        String s="a$bc&de#fg!";
        
        System.out.println("Original String is : \n"+s);
        
        switchAlphabets1(s);
        
        //switchAlphabets2(s);

    }


    // using ASCII values
    private static void switchAlphabets1(String s)
    {
        char[] ch=s.toCharArray();
        Stack<Character> stk = new Stack<>();

        // Push the alphabets from the String to the Stack.
        for(int i=0; i<ch.length;i++) {
            if((64<(int)ch[i] && (int)ch[i] <91) || (96<(int)ch[i] && (int)ch[i] <123)){
                stk.push(ch[i]);
            }
        }
        
        // Display the Stack contents.
        System.out.println(stk);
        
        // Switch the characters by taking it from the Stack.
        for(int i=0; i<ch.length;i++) {
            if((64<(int)ch[i] && (int)ch[i] <91) || (96<(int)ch[i] && (int)ch[i] <123)){
                ch[i]=stk.pop();
            }
        }
        
        for(Character c: ch) {
            System.out.print(c);
        }
        
        
    }

}
