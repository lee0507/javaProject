package HW07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Q1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> name = new HashSet<String>();
		name.add("kim");
		System.out.println(name);
		name.add("lee");
		System.out.println(name);
		name.add("kim");
		System.out.println(name);
		name.remove("kim");
		System.out.println(name);
		System.out.println(name.size());
		
		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("kim");
		name1.add("lee");
		name1.add("john");
		name1.add("park");
		name1.add("choi");
		name1.add("chang");
		name1.add("son");
		name1.add("hwang");
		name1.add("ryu");
		name1.add("yoon");
		name1.add("heo");
		name1.add("jeon");
		System.out.println(name1);
		System.out.println(name1.size());
		System.out.println(name1.get(2));
		
		name1.remove(1);
		System.out.println(name1);
		
		name1.set(1, "park");
		System.out.println(name1);
		System.out.println(name1.size());
		
		name1.add("kim");
		System.out.println(name1);
		
		Collections.sort(name1);
		System.out.println(name1);
		
		Collections.reverse(name1);
		System.out.println(name1);
		
		for (int i = 0; i < name1.size(); i++) {
			System.out.print(name1.get(i) + " ");
		}
	}

}
