package HW06;

public class HW06P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {33, 7, 5, 12, 34, 99, 25, 28, 53, 20, 2};
		int temp;
		
//		for (int i = 0; i < 11; i++) {
//			System.out.print(a[i] + " ");
//		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					}	
				}
				System.out.print(a[i] + " ");
			}
			System.out.println();
			
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					}	
				}
				System.out.print(a[i] + " ");
			}
		
	
	
	
	
	
		}
	}
