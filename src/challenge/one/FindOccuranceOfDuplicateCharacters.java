package challenge.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindOccuranceOfDuplicateCharacters
{

    /*Find duplicate characters in a String.*/
    
    public static void main(String[] args)
    {
        String s = "lemontree in an summer";
        
        findDuplicateChar1(s);
        
    }

    private static void findDuplicateChar1(String s)
    {

        char ch1[]=s.toCharArray();
        Map<Character,Integer> map1=new HashMap<>();
        ArrayList<Integer> occurance = new ArrayList<>();
        
        /*Add all entries of character array ch1 into the hash map.*/
        for(Character c:ch1) {
            if(!map1.containsKey(c)) {
                map1.put(c, 1);
            }else {
                map1.put(c, map1.get(c)+1);
            }
        }
        
        for(Character ch:map1.keySet()) {
            System.out.println(ch+" - "+map1.get(ch));
        }
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        
        for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+ " - "+entry.getValue());
        }
        
    }

}
