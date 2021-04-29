package HW2P;

public class test22c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M;
		for (int i = 0; i < 5; i++) {
			int F = (int)(Math.random() * 10);
			System.out.print(F);
			for (int j = 0; j < 10; j++) {
				M = (int)(Math.random() * 2);
				if (M == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} 	System.out.println();
		}
	}
}