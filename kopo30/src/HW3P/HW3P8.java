package HW3P;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.DateFormat;


public class HW3P8 {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		String s_date = scanner.next();
		int i = scanner.nextInt();
		Date date = new SimpleDateFormat("yyyyMMdd").parse(s_date);
		
		Calendar cmpDate = Calendar.getInstance();
		cmpDate.setTime(date);
		cmpDate.add(Calendar.DATE, i);
		SimpleDateFormat date1 = new SimpleDateFormat("yyyyMMdd");
		String strDate1 = date1.format(cmpDate.getTime());
		System.out.println(strDate1);

		}

}

