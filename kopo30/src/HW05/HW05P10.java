package HW05;

import java.util.Scanner;

public class HW05P10 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = scanner.next();
		for (int i = temp.length() - 1; i>= 0; i--) {
			System.out.print(temp.charAt(i));
		}

	}

}
