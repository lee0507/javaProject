package HW3P;

import java.math.BigDecimal;

public class HW3PCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "-31.5555555555555555555555555123157";
		System.out.println(text);
		System.out.println(Float.parseFloat(text));
		System.out.println(Double.parseDouble(text));
		Double d = Double.parseDouble(text);
		System.out.println(d);
		System.out.println(d.intValue());
		BigDecimal bd = new BigDecimal(text);
		System.out.println(bd);
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));
		float f = 3.26f;
		System.out.println(f);
		System.out.println((int)f);
		
	}

}
