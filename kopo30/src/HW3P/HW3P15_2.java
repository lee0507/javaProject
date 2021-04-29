package HW3P;

import java.util.Scanner;

public class HW3P15_2 {

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
		float mul1 = t1 + t2;
		System.out.println(mul1);
		} else if (i2 == true) {
			String temp1 = text.substring(0 , text.indexOf("-"));
			String temp2 = text.substring(text.indexOf("-") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			float mul1 = t1 - t2;
			System.out.println(mul1);
		} else if (i3 == true) {		
		String temp1 = text.substring(0 , text.indexOf("*"));
		String temp2 = text.substring(text.indexOf("*") + 1, (text.length()));
		float t1 = Float.parseFloat(temp1);
		float t2 = Float.parseFloat(temp2);
		float mul1 = t1 * t2;
		System.out.println(mul1);
		} else if (i4 == true) {
			String temp1 = text.substring(0 , text.indexOf("/"));
			String temp2 = text.substring(text.indexOf("/") + 1, (text.length()));
			float t1 = Float.parseFloat(temp1);
			float t2 = Float.parseFloat(temp2);
			float mul1 = t1 / t2;
			System.out.println(mul1);
		} else {
			System.out.println("error");
		}
		
	}

}
