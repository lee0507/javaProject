package HW3P;

import java.util.Scanner;

public class HW3P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String temp = "abcdefghijk";
		String temp1 = temp.substring(3, 7);
		System.out.println(temp1);
		String temp2 = temp.substring(6);
		System.out.println(temp2);
		String temp3 = temp.substring(temp.indexOf("d"));
		System.out.println(temp3);
		String temp4 = temp.substring(temp.indexOf("d"),temp.indexOf("g"));
		System.out.println(temp4);
		float d = 123.785f;
		System.out.println((int)d);
		
//		String D = "123";
//		int d = Integer.parseInt(D);
//		System.out.println(d);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
