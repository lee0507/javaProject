package HW08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		
		System.out.println(dateAndTime);
		int A = scanner.nextInt();
		try {
			Thread.sleep(A*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println("time is over(" + dateAndTime + ")");
	}

}
