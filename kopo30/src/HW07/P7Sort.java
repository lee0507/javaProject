package HW07;

import java.util.Arrays;
import java.util.Collections;

public class P7Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] temp = {1,9,5,7,4};
		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("=================");
		Arrays.sort(temp, Collections.reverseOrder());
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
	}

}
