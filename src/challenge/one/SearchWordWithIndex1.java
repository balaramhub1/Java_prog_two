package challenge.one;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SearchWordWithIndex1 {

    static Map<String, ArrayList<Integer>> map1 = new HashMap<>();

    public static void main(String[] args) {    
        
        String s="Yodlee is an American software company that Yodlee develops an account aggregation service that allows users to see their credit card, "
                + "bank, investment, email, travel Yodlee reward accounts, etc. on one screen.";
        
        
        parseParagragh(s);
        
        /*public void searchWord(String word) {}
        
        Yodlee = [0, 14, 19]*/
        
        
        
    }

    /*
     * Method to parse the input string and add all the words in a datastructure(map
     * in this case ) so as to note all the index of the words.
     * Run the program to see the demo.
     */
    public static void parseParagragh(String str) {

        String s2[] = str.split(" ");
        ArrayList<Integer> l2;
        for (int i = 0; i < s2.length; i++) {
            if(!map1.containsKey(s2[i])) {
                l2=new ArrayList<Integer>();
                l2.add(i);
                map1.put(s2[i], l2);
            }else {
                map1.get(s2[i]).add(i);
            }
            
        }
        System.out.println(map1);
    }
    
    public static void searchWord(String word) {
        
    }
}
