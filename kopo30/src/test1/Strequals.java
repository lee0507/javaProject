package test1;

import java.util.Scanner;

public class Strequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = "how are you?";
		
//		���ڿ��� equals�� �������!
//		if (a == ("Hello")) XXX
//		if (a.contains("Hello"))�� ���ԵǴ� ��! 
		
		if (a.contains("how")) {
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}
	}

}
