package HW8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P3 {//Ŭ��������

	public static void main(String[] args) throws IOException {//�������κ��� ���α׷�����, ���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.
		File k30_f = new File("d:\\12_04_07_E_���������������.csv");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
		//d����̺��� �����������csv������ �о�´�.
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader�� FileReader�� ������ ����������������� ����־ Bufferó���� �Ͽ���.
		
		String k30_readtxt;//���ڿ��� ���� k30_readtxt�� �����Ѵ�.
		
		if((k30_readtxt = k30_br.readLine()) == null) {//���࿡ k30_readtxt���Ͽ� k30_br.readLine�� null���̶�� 
			System.out.printf("�� �����Դϴ�\n");//�� �����Դϴٿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		}
		//ù��° ���� ���� �о�� �ʵ���� �� ���ִ�.(�ʵ���� ���� ������ ��� ���������ϴ�.)
		String[] k30_field_name = k30_readtxt.split(",");//�޾ƿ� k30_readtxt�� , comma �������� �и��ؼ� ���ڿ� �迭 k30_field_name�� ���� �����Ѵ�.
		
		int k30_LineCnt = 0;//�� ���� üũ�ϱ� ���� ������ ���� k30_LineCnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		while ((k30_readtxt = k30_br.readLine()) != null) {//while �ݺ����� ������ (k30_readtxt = k30_br.readLine()) != null�� �����Ͽ� �о�� ���� ���������� ����ؼ� �ݺ��Ѵ�.
			
			String[] k30_field = k30_readtxt.split(",");//�޾ƿ� k30_readtxt�� , comma �������� �и��ؼ� ���ڿ� �迭 k30_field�� ���� �����Ѵ�.
			System.out.printf("**[%d��° �׸�]***************\n", k30_LineCnt);// ���� k30_LineCnt�� ȭ�鿡 ����Ѵ�.
			for (int k30_j = 0; k30_j < k30_field_name.length; k30_j++) {//for�ݺ����� k30_j�� 0���� k30_j�� k30_field_name.length���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
				System.out.printf(" %s : %s\n", k30_field_name[k30_j], k30_field[k30_j]);//���� k30_field_name[k30_j]�� k30_field[k30_j]�� ȭ�鿡 ����Ѵ�.
			}
			System.out.printf("*************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
			if (k30_LineCnt == 100) break;//�鰳������ ����ϱ� ���ؼ� ���� k30_LineCnt�� 100�̶�� break���� �����Ѵ�.
			k30_LineCnt++;// �ݺ����� �ѹ� ����ɶ����� ���� k30_LineCnt�� 1�� ������Ų��.
		}
		k30_br.close();//k30_br bufferedReader ������ �ݴ´�.
	}
}
