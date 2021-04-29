package HW3P;

import java.util.Scanner;

public class HW3P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		int i;
		
		for (i = 0; i < temp.length(); i++) {
			byte M = (byte)(temp.charAt(i));
			if ((M >= 65) && (M < 91)) {
				M += 32;
				System.out.print((char)M);
			} else if ((M >= 96) && (M < 123)) {
				M -= 32;
				System.out.print((char)M);
			} else {
				System.out.print((char)M);
			}
		}
	}

}
