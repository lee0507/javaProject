package HW7;

import java.util.ArrayList;

public class P8ArrayList2 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_iTestMax = 10;//������ ���� k30_iTestMax�� �����ϰ� ���� 1000000���� �ʱ�ȭ�Ѵ�.
		ArrayList k30_iAL = new ArrayList();//ArrayList Ŭ������ �޾Ƽ� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		for(int k30_i = 0; k30_i < k30_iTestMax; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iTestMax���� ���������� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_iAL.add((int)(Math.random() * 1000000));//���� k30_iAl�� ���� 0 ~ 1000000������ ���� ���������� ����ȯ�ϰ� �����Ѵ�.
		}
		
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iAl�� ũ�⺸�� ���������� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf(" ArrayList %d = %d\n", k30_i, k30_iAL.get(k30_i));//���� k30_i�� k30_iAL�� k30_i�ε��� ���� ȭ�鿡 ����Ѵ�.
		}
		
		System.out.printf("************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		k30_iAL.sort(null);//k30_iAL.sort�� ���� �����Ѵ�.
		
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iAl�� ũ�⺸�� ���������� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf(" ArrayList %d = %d\n", k30_i, k30_iAL.get(k30_i));//���� k30_i�� k30_iAL�� k30_i�ε��� ���� ȭ�鿡 ����Ѵ�.
		}
	}

}
