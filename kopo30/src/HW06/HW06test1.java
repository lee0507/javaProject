package HW06;

import java.util.ArrayList;

public class HW06test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		name.add("lee");
		name.add("park");
		name.add("kim");
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i));
		}
		System.out.println();
		
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
	}

}
