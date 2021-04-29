package HW08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P2 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		P2 thread = new P2();
		
		thread.start();
		System.out.println("Check 1 : " + getCurrentTime() + " - " + thread.isAlive());
		Thread.sleep(n*1000);
		System.out.println("Check 2 : " + getCurrentTime() + " - " + thread.isAlive());
	}

	private static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
	
	public void run() {
		int cnt = 0;
		while (true) {
			if (cnt == 5) {
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + cnt);
				Thread.sleep(100);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
