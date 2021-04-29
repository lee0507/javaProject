package HW01;

import java.util.Scanner;

public class Lee1 implements CalculatorInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lee1 m = new Lee1();
		m.calculator();
	}

	public static void calculator() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Lee1 m = new Lee1();
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
			float mul1 = (float) m.calAddition(t1, t2);
			System.out.println(mul1);
		} else if (i2 == true) {
			String temp1 = text.substring(0 , text.indexOf("-"));
			String temp2 = text.substring(text.indexOf("-") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			float mul1 = (float) m.calSubtraction(t1, t2);
			System.out.println(mul1);
		} else if (i3 == true) {		
			String temp1 = text.substring(0 , text.indexOf("*"));
			String temp2 = text.substring(text.indexOf("*") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			float mul1 = (float) m.calMultiplication(t1, t2);
			System.out.println(mul1);
		} else if (i4 == true) {
			String temp1 = text.substring(0 , text.indexOf("/"));
			String temp2 = text.substring(text.indexOf("/") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			float mul1 = (float) m.calDivision(t1, t2);
			System.out.println(mul1);
		} else {
			System.out.println("error");
		}
		
	}

	@Override
	public double calAddition(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public double calSubtraction(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public double calMultiplication(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double calDivision(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}

	@Override
	public char getOperator(String formula) {
		// TODO Auto-generated method stub
		return 0;
	}

}
