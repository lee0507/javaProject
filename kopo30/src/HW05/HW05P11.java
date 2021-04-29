package HW05;

import java.util.Scanner;

public class HW05P11 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revStr();
		}

	public static void revStr() {
		String str = scanner.nextLine();
		int strLeng = str.length();	
		
		int i = 0;
		while(i < str.length()) {
			System.out.print(str.charAt(strLeng - (i+1)));
			i++;
		}

	}
	
}
