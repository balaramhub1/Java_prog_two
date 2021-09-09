package challenge.one;

public class FindOccuranceOfAnyCharacter1 {
		
	public static void main(String[] args) {

		String s="How are you doing any ways";
		
		findOccurance1(s,'w');
		
		findOccurance2(s,"y");
		
		
	}

	/*Find occurrence of a character by eliminating the character from the string and comparing the 
	length of the resultant string with the original string.*/
	
	private static int findOccurance2(String s,String c) {
		int originalLength=s.length();
		s=s.replace(c,"");
		System.out.println(s);
		int newLength=s.length();
		System.out.println("The Character : '"+c+"' occurrs "+(originalLength-newLength)+" times in the Original String");
		
		return (originalLength-newLength);
		
		
	}

	/*Find the occurrence of character by converting to char array and iterating over the same,
	and incrementing a counter when the character is found.*/
	
	private static int findOccurance1(String s,char c) {
		char[] cx=s.toCharArray();
		int count=0;
		for(int i=0;i<cx.length;i++) {
			if(cx[i]==c) {
				count++;
			}
		}
		System.out.println("The Character : '"+c+"' occurrs "+count+" times in the Original String");
		return count;
	}
}
