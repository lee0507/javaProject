package HW8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P7_3 {//Ŭ���� ����

	public static void main(String[] args) throws IOException {//�������κ��� ���α׷�����, ���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.
		File k30_f = new File("d:\\day_data\\StockA005930.csv");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
		//�Ʊ� �������� d����̺��� �Ｚ�����ֽ�����������csv������ �о�´�.
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader�� FileReader�� ������ �ֽ����������͸� ����־ Bufferó���� �Ͽ���.
		
		String k30_readtxt;//���ڿ��� ������ k30_readtxt�� �����Ѵ�.
		int k30_max = 0;//������ ������ k30_max�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_min = Integer.MAX_VALUE;//������ ������ k30_min�� �����ϰ� ���� Integer.MAX_VALUE������ �ʱ�ȭ�Ѵ�.
		String k30_minname1 = "";//���ڿ��� ������ k30_minname1�� �����Ѵ�.
		String k30_maxname2 = "";//���ڿ��� ������ k30_maxname2�� �����Ѵ�.

		long start = System.currentTimeMillis();//�����ϴ� ���� �ð��� �޾ƿ´�.
		
		while ((k30_readtxt = k30_br.readLine()) != null) {//while �ݺ����� ������ (k30_readtxt = k30_br.readLine()) != null�� �����Ͽ� �о�� ���� ���������� ����ؼ� �ݺ��Ѵ�.
			
			String[] k30_field = k30_readtxt.split(",");//�޾ƿ� k30_readtxt�� , comma �������� �и��ؼ� ���ڿ� �迭 k30_field�� ���� �����Ѵ�.
			for (int k30_i = 0; k30_i < k30_field.length; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� field�� ���̺��� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
				if(k30_field[1].substring(0, 4).equals("2015")) {//���� k30_field[1]�� 4��°�ڸ����� �߶����� 2015��� 
					if (k30_min > Integer.parseInt(k30_field[3])) {//k30_field[3]�� ���������� ����ȯ�� ���� k30_min���� �۴ٸ�
						k30_min = Integer.parseInt(k30_field[3]);//k30_field[3]�� ���������� ����ȯ�� ���� k30_min���� �����Ѵ�.
						k30_minname1 = k30_field[1];//k30_field[1]�� k30_minname1���� �����Ѵ�.
						
					}
					if (k30_max < Integer.parseInt(k30_field[3])) {//k30_field[3]�� ���������� ����ȯ�� ���� k30_max���� ũ�ٸ�
						k30_max = Integer.parseInt(k30_field[3]);//k30_field[3]�� ���������� ����ȯ�� ���� k30_max���� �����Ѵ�.
						k30_maxname2 = k30_field[1];//k30_field[1]�� k30_maxname2���� �����Ѵ�.
					}
				}
			}

		}
		k30_br.close();//k30_br bufferedReader ������ �ݴ´�.
		
		long end = System.currentTimeMillis();//������ ���� �ð��� �޾ƿ´�.
		System.out.println("����ð� : " + (end - start) / 1000.0 + "��");//������ �ð����� ������ �ð��� ���� ���࿡ �ɸ� �ð��� ����Ѵ�.(1 / 1000�� ���� �����Ѵ�.)
		System.out.printf("��¥ %s ������ %d\n", k30_minname1, k30_min);//���� k30_minname1�� k30_min�� ȭ�鿡 ����Ѵ�.
		System.out.printf("��¥ %s �ְ� %d\n", k30_maxname2, k30_max);//���� k30_maxname2�� k30_max�� ȭ�鿡 ����Ѵ�.
		System.out.printf("*************************\n");
	}

}

