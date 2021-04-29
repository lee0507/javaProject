package HW06;

import java.util.Scanner;

public class HW06P8 {

	public static void main(String[] args) {
		char[] original = {'z', 'y', 'x', 'w', 'v', 'u', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
		char[] decryption = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 'u', 'v', 'w', 'x', 'y', 'z'};
	   
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
//		char[] s = new char[str.length()];// String 길이만한 배열을 만들겠다.
		
		for(int i = 0; i < str.length(); i++) {
			int reference = 0;
			for(int j = 0; j < original.length; j++) {
				if(str.charAt(i) == original[j]) {
					reference = j; 
					System.out.print(decryption[j]);
				}
			}
		}	
	}
}
