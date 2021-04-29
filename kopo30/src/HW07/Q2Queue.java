package HW07;

import java.util.LinkedList;
import java.util.Queue;

public class Q2Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> name = new LinkedList<String>();// First In First Out
		name.offer("kim");
		name.offer("lee");
		name.offer("park");
		System.out.println(name);
		name.size();
		
		for (int i = 0; i < 3; i++) {
			name.poll();
		}
		System.out.println(name);
	}

}
