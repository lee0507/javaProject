package Leedong;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		abc();
		
	}
	
	public static void abc() throws InterruptedException {
		double sum = 0;
		double avg = 0;
		double min = 100;
		double max = 0;
		
		for (int i = 1; i < 10; i++) {
			double A = (Math.random() * 20);
			System.out.println(A);
			
			sum = sum + A;
	
			avg = sum / i;
			
			if (A < min) {
				min = A;
			}
			if (A > max) {
				max = A;
			}
			System.out.print("count - " + i + " ");
			System.out.print("SUM : " + sum + ", ");
			System.out.print("AVG : " + avg+ ", ");
			System.out.print("MIN : " + min+ ", ");
			System.out.print("MAX : " + max);
			System.out.println();
			System.out.println();
		}
	}
}
