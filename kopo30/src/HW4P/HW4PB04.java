package HW4P;

import java.util.Scanner;

public class HW4PB04{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println(text);
		operation(text);
		
	}
	public static double addition(double num1, double num2) {
		double add = num1 + num2;
		return add;
	}
	public static double subtraction(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}
	public static double multiplication(double num1, double num2) {
		double mul = num1 * num2;
		return mul;
	}
	public static double division(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}
	public static float operation(String text) {
		
		boolean i1 = (text.contains("+"));
		boolean i2 = (text.contains("-"));
		boolean i3 = (text.contains("*"));
		boolean i4 = (text.contains("/"));
		
		if (i1 == true) {
			String temp1 = text.substring(0 , text.indexOf("+"));
			String temp2 = text.substring(text.indexOf("+") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			System.out.printf("%.1f", addition(t1, t2));
			return t1 + t2;
		} else if (i2 == true) {
			String temp1 = text.substring(0 , text.indexOf("-"));
			String temp2 = text.substring(text.indexOf("-") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			System.out.printf("%.1f", subtraction(t1, t2));
			return t1 - t2;
		} else if (i3 == true) {		
			String temp1 = text.substring(0 , text.indexOf("*"));
			String temp2 = text.substring(text.indexOf("*") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			System.out.printf("%.1f", multiplication(t1, t2));
			return t1 * t2;
		} else if (i4 == true) {
			String temp1 = text.substring(0 , text.indexOf("/"));
			String temp2 = text.substring(text.indexOf("/") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			System.out.printf("%.1f", division(t1, t2));
			return t1 / t2;
		} else {
			System.out.println("error");
			return 0;
		}
	}

}
