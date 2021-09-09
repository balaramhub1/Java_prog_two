package challenge.one;

import java.util.Stack;

public class BalancedParenthesisCheck1 {
	
	public static void main(String[] args) {

		/*Example of Balanced String : "[{()}]"
			
		Programm to check if input String is balanced.*/
			
		String s1="[({({[]})})]";
		String s2="[({({[))]})}]";
		String s3="[({({[]})])]";
		
		checkIfBalanced(s1);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		checkIfBalanced(s2);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		checkIfBalanced(s3);
		
	}

	private static void checkIfBalanced(String s1) {
		
		if(s1.length()%2!=0) {
			System.out.println("String is not Balanced, as no of characters in not Even.");
		}else {
			Stack<Character> stk=new Stack<>();
			for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(i);
				if(stk.empty()) {
					stk.push(ch);
				}else if(ch=='(' || ch=='{' || ch=='[') {
					stk.push(ch);
				}else if(ch==')' && stk.peek()=='(') {
					stk.pop();
				}else if(ch=='}' && stk.peek()=='{') {
					stk.pop();			
				}else if(ch==']' && stk.peek()=='[') {
					stk.pop();
				}
			}
			
			if(stk.empty()) {
				System.out.println("String is Balanced.");
			}else {
				System.out.println("String is Not Balanced.");
			}
		}
		
	}

}
