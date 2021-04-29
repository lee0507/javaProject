package HW3P;

import java.util.Calendar;

public class HW3P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.YEAR) + 1);
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println((calendar.get(Calendar.MONTH)) + 3);
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DATE) - 7);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)- 5);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + 6);
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR) - 6);
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR) + 8);
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + 2);
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.MINUTE) + 10);
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.SECOND) + 15);
		System.out.println(calendar.get(Calendar.MILLISECOND));
		System.out.println(calendar.get(Calendar.MILLISECOND) - 15);

	}

}
