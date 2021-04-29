package HW4P;

import java.util.Scanner;

public class HW4P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println(text);
		
		boolean i1 = (text.contains("+"));
		boolean i2 = (text.contains("-"));
		boolean i3 = (text.contains("*"));
		boolean i4 = (text.contains("/"));
		
		if (i1 == true) {
			String temp1 = text.substring(0 , text.indexOf("+"));
			String temp2 = text.substring(text.indexOf("+") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			addition(t1, t2);
		} else if (i2 == true) {
			String temp1 = text.substring(0 , text.indexOf("-"));
			String temp2 = text.substring(text.indexOf("-") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			subtraction(t1, t2);
		} else if (i3 == true) {		
			String temp1 = text.substring(0 , text.indexOf("*"));
			String temp2 = text.substring(text.indexOf("*") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			multiplication(t1, t2);
		} else if (i4 == true) {
			String temp1 = text.substring(0 , text.indexOf("/"));
			String temp2 = text.substring(text.indexOf("/") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			division(t1, t2);
		} else {
			System.out.println("error");
		}
	}
	public static void addition(double num1, double num2) {
		double add = num1 + num2;
		System.out.println(add);
	}
	public static void subtraction(double num1, double num2) {
		double sub = num1 - num2;
		System.out.println(sub);
	}
	public static void multiplication(double num1, double num2) {
		double mul = num1 * num2;
		System.out.println(mul);
	}
	public static void division(double num1, double num2) {
		double div = num1 / num2;
		System.out.println(div);
	}
}
