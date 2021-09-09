package challenge.one;

import java.util.HashSet;
import java.util.Set;

public class FindLongestSubstringWithoutRepeat2 {

	public static void main(String[] args) {
		
		/*This program is to find the longest substring having no repetation of char.
		Exmaple:
			"abcdbcdefgab"
		Diff substrings are without repeat characters are : "abcd","bcdefga"
		There may be case where more than 1 substring can be longest without any repeat.
		In that case first substring to be considered.
		Space character not to be considered within substring.*/

		String s="abcdbcdefgab";
		
		findLongestStr(s);

	}

	private static void findLongestStr(String s) {
		// current longest sub string
		String longestSubStrNow = "";
		
		// final longest sub string.
		String longestSubStr="";
		
		Set<Character> charSet=new HashSet<>();
		
		char c1[]=s.toCharArray();
		
		for(int i=0;i<c1.length;i++) {
			if(charSet.contains(c1[i])) {
				charSet.clear();
				longestSubStrNow="";
			}else {
				charSet.add(c1[i]);
				longestSubStrNow+=c1[i];
				if(longestSubStr.length()<longestSubStrNow.length()) {
					longestSubStr=longestSubStrNow;
				}
			}
		}
		System.out.println(longestSubStr);
	}

}
