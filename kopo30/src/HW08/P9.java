package HW08;

import java.util.Scanner;

public class P9 {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a = scan.nextInt();
		for (int i = 0; i < a; i++) {
			Thread thread = new MultiThread();
			thread.start();
			thread.sleep(15000);
		}
	}

}

class MultiThread extends Thread {
	public MultiThread() {
		
	}
	
	public void run() {
		double race = 0;
		while (true) {
			try {
				race += (Math.random() * 10);
				if (race > 50) {
					System.out.println("Finished");
					break;
				} else {
					System.out.printf("%.1f\t", race);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
