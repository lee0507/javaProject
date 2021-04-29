package test1;

import java.util.Scanner;

public class Strequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = "how are you?";
		
//		문자열은 equals를 사용하자!
//		if (a == ("Hello")) XXX
//		if (a.contains("Hello"))는 포함되는 것! 
		
		if (a.contains("how")) {
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}
	}

}
