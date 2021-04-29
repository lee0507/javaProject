package HW4P;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HW02P2 {


	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		
		String s_date = scanner.next();
		Date date = new SimpleDateFormat("hhmmss").parse(s_date);
		Calendar cmpDate = Calendar.getInstance();
		cmpDate.setTime(date);
		
		String s_date1 = scanner.next();
		Date date1 = new SimpleDateFormat("hhmmss").parse(s_date1);
		Calendar cmpDate1 = Calendar.getInstance();
		cmpDate1.setTime(date1);
		
		long diffSec = (cmpDate.getTimeInMillis() - cmpDate1.getTimeInMillis()) / 1000;
		
		System.out.printf("%ds", Math.abs(diffSec));
	}

}

