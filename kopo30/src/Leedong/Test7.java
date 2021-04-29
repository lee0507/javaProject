package Leedong;

import java.util.HashSet;

public class Test7 {
	public static HashSet<Integer> name = new HashSet<Integer>();
	
	public static void main(String[] args) {
		randomMath();
	}
	
	public static void randomMath() {
		int cnt = 0;
		while (true) {
			int M = (int)((Math.random() * 10) + 1);
			name.add(M);
			System.out.println("#" + (cnt + 1) + "-" + M);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cnt++;
			if (name.size() == 10) {
				System.out.println("Total Number of trials : " + cnt);
				break;
			}
		}
	}
}
