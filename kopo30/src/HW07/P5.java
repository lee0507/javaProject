package HW07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();// Array�� ũ�Ⱑ ������ ������ Arraylist�� �Է��� �� ������ ũ�Ⱑ �þ��.
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		String target = scanner.nextLine();
		String[] B = A.split(" ");
		for (int i = 0; i < B.length; i++) {
			list.add(B[i]);
		}
		Iterator<String> iterator = list.iterator();
		int count= 1;
		while(iterator.hasNext()) {
			String t = iterator.next();
			if(t.equals(target)) {
				break;
			} else {
				count ++;
				
			}
			
		} System.out.println(count);

		}
	}

