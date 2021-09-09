package challenge.one;

public class StackImplementation1 {
	
	/*This class is to demonstrate how to implement 
	Stack using Array.
	
	Top Value 			Meaning
		-1			It shows the stack is empty
		0			The stak has only an element.
		N-1			The stack is full.
		N			The stack is overflow.*/
	
	int array[] =new int[10];
	int top=0; // its -1 for stack when empty
	
	private boolean push(int x) {
		top++;
		array[top]=x;
		System.out.println("Element pushed into stack : "+x);
		return true;
	}
	
	private int pop() {
		int x=array[top--];
		System.out.println("Element popped from stack : "+x);
		return x;
	}
	
	private int peek() {
		System.out.println("Element peeked into : "+array[top]);
		return array[top];
	}
	
	public static void main(String[] args) {
		StackImplementation1 stack1=new StackImplementation1();
		
		stack1.push(4);
		stack1.push(6);
		stack1.push(10);
		stack1.push(13);
		stack1.push(17);
		
		stack1.pop();
		
		stack1.peek();
		
	}
	
	

}
