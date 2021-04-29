package HW2P;

import java.util.Scanner;

public class HW2P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int i;
		
		if (a > 1 && a < 10) {
			for (i = 2; i < 10; i++) {
				System.out.println(a + "X" + i + " = " + (a * i)); 
			}	
		}
	}
}


