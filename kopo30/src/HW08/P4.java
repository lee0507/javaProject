package HW08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("start");
		Thread thread1 = new Test1("[Thread" + 1 + "]");
		thread1.start();
		Thread thread2 = new Test1("[Thread" + 2 + "]");
		thread2.start();
	}

}

class Test1 extends Thread {
	public Test1(String threadName) {
		this.setName(threadName);
	}
	
	public void run() {
		int sum = 0;
		SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		while(true) {
			int a = (int)(1 + Math.random() * 10);
			System.out.println(this.getName() + sum + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sum = sum + a;
			if(sum > 100) {
				break;
			} else {

			}
		}
		time = new Date();
		dateAndTime = format.format(time);
		System.out.println(dateAndTime + this.getName() +"end");
	}
}