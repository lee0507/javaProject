package HW4P;

public class HW4Ptest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] para = {3, 4, 5, 6, 7};
		for (int i = 0; i < para.length; i++) {
			System.out.print(func(para)[i]);
		}
	}
	
	public static int[] func(int[] para) {

		int[] elem = new int[para.length];
		for (int i = 0; i < para.length; i++) {
			elem[i] = para[i] + 1;
		}
		return elem;
	}

}
