package HW07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P8 {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scanner.nextLine();
		String[] s = str.split(" ");
		ArrayList<Double> intArray = new ArrayList<Double>();
		
		try {
			int target = scanner.nextInt();
			
			for (int i = 0; i < s.length; i++) {
				intArray.add(Double.parseDouble(s[i]));
			}
			
			Iterator<Double> iterator = intArray.iterator();
			
			int i = 0;
			
			while(iterator.hasNext()) {
				if (iterator.next() % target == 0) {
					System.out.print(intArray.get(i).intValue());
					System.out.print(" ");
				}
				i++;
			}
		} catch(Exception e) {
			System.out.println("Try again");
		}
		
		scanner.close();

	}

}
