package HW07;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HW07P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.nextLine();
		String[] text2 = text.split(" ");
		
		Queue<String> num = new LinkedList<String>();
		
		Collections.addAll(num, text2);
		Iterator<String> iterator = num.iterator();
		
		String input = scanner.nextLine();
		
		int count = 0;
		while (iterator.hasNext()) {
			count++;
			if (iterator.next().equals(input) == true) {
				System.out.println(count);
				break;
			}
		}
		
		
	}

}
