package HW2P;

import java.util.Scanner;

public class HW2P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		if (text.toLowerCase().contains("car".toLowerCase()) == true) {
			System.out.println("car is included.");
		} else {
			System.out.println("car is not included.");
		}
	}

}
