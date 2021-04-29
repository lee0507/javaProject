package HW08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P5 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P5 main = new P5();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		
		System.out.println(dateAndTime);
		System.out.println("start");
		
		try {
			for(int i = 0; i < 99; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("end");
	}

}
