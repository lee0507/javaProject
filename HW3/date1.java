package HW3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.printf("최종실행시간: %s\n", sdt.format(calt.getTime()));
		System.out.printf("******************************");
	}

}
