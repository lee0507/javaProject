package HW7;

import java.util.ArrayList;

public class P7ArrayList1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		ArrayList k30_iAL = new ArrayList();//ArrayList Ŭ������ �޾Ƽ� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		k30_iAL.add("abc");//ArrayList�� �� abc�� �����Ѵ�.
		k30_iAL.add("abcd");//ArrayList�� �� abcd�� �����Ѵ�.
		k30_iAL.add("efga");//ArrayList�� �� efga�� �����Ѵ�.
		k30_iAL.add("������0");//ArrayList�� �� ������0�� �����Ѵ�.
		k30_iAL.add("1234");//ArrayList�� �� 1234�� �����Ѵ�.
		k30_iAL.add("12rk34");//ArrayList�� �� 12rk34�� �����Ѵ�.
		
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf(" ���� ArraySize %d \n", k30_iAL.size());//���� k30_iAL�� ũ�⸦ ȭ�鿡 ����Ѵ�.
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iAl�� ũ�⺸�� ���������� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//���� k30_i�� k30_iAL�� k30_i�ε��� ���� ȭ�鿡 ����Ѵ�.
		}
		
		k30_iAL.set(3,  "������");
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf(" ���뺯�� ArraySize %d \n", k30_iAL.size());
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iAl�� ũ�⺸�� ���������� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//���� k30_i�� k30_iAL�� k30_i�ε��� ���� ȭ�鿡 ����Ѵ�.
		}
		
		k30_iAL.remove(4);
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf(" ������� ArraySize %d \n", k30_iAL.size());
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iAl�� ũ�⺸�� ���������� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//���� k30_i�� k30_iAL�� k30_i�ε��� ���� ȭ�鿡 ����Ѵ�.
		}
		
		k30_iAL.sort(null);;
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf(" ����Ʈsort ArraySize %d \n", k30_iAL.size());
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iAl�� ũ�⺸�� ���������� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//���� k30_i�� k30_iAL�� k30_i�ε��� ���� ȭ�鿡 ����Ѵ�.
		}
		
		k30_iAL.clear();;
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf(" ���� ���� ArraySize %d \n", k30_iAL.size());
		for(int k30_i = 0; k30_i < k30_iAL.size(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iAl�� ũ�⺸�� ���������� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf(" ArraySize %d = %s\n", k30_i,k30_iAL.get(k30_i));//���� k30_i�� k30_iAL�� k30_i�ε��� ���� ȭ�鿡 ����Ѵ�.
		}
		
	}

}
