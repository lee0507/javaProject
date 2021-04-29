package HW2;

public class P2 {

	public static void main(String[] args) {
		int k30_x = 10;
		int k30_y = 20;
		int k30_tmp = 0;
		
		System.out.println("x:" + k30_x + " y:" + k30_y);
		
		k30_tmp = k30_x;
		k30_x = k30_y;
		k30_y = k30_tmp;
		
		System.out.println("x:" + k30_x + " y:" + k30_y);
	}

}
