package HW07;

import java.util.Stack;
import java.util.ArrayList;

public class Q3Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>(); // First In Last Out, Last In First Out
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		System.out.println(stack.size());
		 
		System.out.println(stack);
		
		for (int i = 0; i < 5; i++) {
			stack.pop();
		}
		
		System.out.println(stack);
	}

}
