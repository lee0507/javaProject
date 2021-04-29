package HW06;

public class HW06test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = new int[3][5];
		int cnt;
		cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				numbers[i][j] = cnt;
				System.out.print(numbers[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
	}

}
