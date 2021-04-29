package HW06;

import java.util.Scanner;

public class HW06P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		String[] names = words.split(" ");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
