package HW06;

public class HW06test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = {{1,2,3},{4,5},{7,8,9}};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
