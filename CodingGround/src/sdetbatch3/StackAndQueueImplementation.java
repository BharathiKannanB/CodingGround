package sdetbatch3.stackqueue;

import java.util.Stack;

public class StackAndQueueImplementation {

	
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=1;i<=5;i++) {
		stack.push(i);
		stack.pop();}
		stack.peek();
		stack.empty();
		stack.search(5);
		System.out.println(stack.peek());
	}
	
}
