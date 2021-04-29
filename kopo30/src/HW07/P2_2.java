package HW07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> name = new ArrayList<Integer>();
		int n = scanner.nextInt(); // first input number
		scanner.nextLine();
		int[] nums = new int[n]; // initialize the array with the user input number
		String m = scanner.nextLine();
		String[] p = m.split(" ");
		
		try {
		for(int i = 0; i < p.length; i++) {
			nums[i] = Integer.parseInt(p[i]);
			name.add(nums[i]);
		}
		Collections.sort(name);
		System.out.println(name);
		
		} catch(Exception e) {
			System.out.println("error");
		}

	}
}
