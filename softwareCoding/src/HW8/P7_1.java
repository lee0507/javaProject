package HW8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7_1 {//Ŭ���� ����

	public static void main(String[] args) throws IOException {//�������κ��� ���α׷�����, ���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.
		// TODO Auto-generated method stub
		File k30_f = new File("d:\\day_data\\StockDailyPrice.csv");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
		//�Ʊ� �������� d����̺��� �ֽ�����������csv������ �о�´�.
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader�� FileReader�� ������ �ֽ����������͸� ����־ Bufferó���� �Ͽ���.
		
		File k30_f1 = new File("d:\\\\day_data\\\\StockA005930.csv");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
		//���ο� StockDailyPrice20150112.csv������ �����.
		BufferedWriter k30_bw = new BufferedWriter(new FileWriter(k30_f1));//BufferedWriter�� FileWriter�� ���� ����־ Bufferó���� �Ͽ���.
		
		int k30_cnt = 0;//������ ������ k30_cnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_wcnt = 0;//������ ������ k30_wcnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		String k30_readtxt;//���ڿ��� ���� k30_readtxt�� �����Ѵ�.

		long start = System.currentTimeMillis();//�����ϴ� ���� �ð��� �޾ƿ´�.
		
		while ((k30_readtxt = k30_br.readLine()) != null) {//while �ݺ����� ������ (k30_readtxt = k30_br.readLine()) != null�� �����Ͽ� �о�� ���� ���������� ����ؼ� �ݺ��Ѵ�.
			StringBuffer k30_s = new StringBuffer();// Bufferó���� �� ���� k30_s�� �����Ѵ�.
			String[] k30_field = k30_readtxt.split(",");//�޾ƿ� k30_readtxt�� , comma �������� �и��ؼ� ���ڿ� �迭 k30_field�� ���� �����Ѵ�.
			
			if(k30_field.length > 2 && k30_field[2].equals("A005930")) {//���࿡ �ʵ��� ���̰� 2���� ũ�� field[2]�� ���ڰ� A005930�̶��
				k30_s.append(k30_field[0]);//k30_s�� field[0]�� ���� �����Ѵ�.
				for (int j = 1; j < k30_field.length; j++) {//for�ݺ����� k30_j�� 1���� k30_j�� field�� ���̺��� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
					k30_s.append("," + k30_field[j]);//k30_s�� ,�� field[j]�� ���� �����Ѵ�.
				}
				k30_bw.write(k30_s.toString());//���� k30_s�� ���ڿ��� ����ȯ�ϰ� k30_bw�� �ۼ��Ѵ�.
				k30_bw.newLine();//�ٹٲ��� �ۼ��Ѵ�.
				k30_wcnt++;// �ݺ����� �ѹ� ����ɶ����� ���� k30_wcnt�� 1�� ������Ų��.
			}
			k30_cnt++;// �ݺ����� �ѹ� ����ɶ����� ���� k30_cnt�� 1�� ������Ų��.
		}
		
		k30_br.close();//k30_br bufferedReader ������ �ݴ´�.
		k30_bw.close();//k30_bw bufferedWriter ������ �ݴ´�.
		
		long end = System.currentTimeMillis();//������ ���� �ð��� �޾ƿ´�.
		System.out.println("����ð� : " + (end - start) / 1000.0 + "��");//������ �ð����� ������ �ð��� ���� ���࿡ �ɸ� �ð��� ����Ѵ�.(1 / 1000�� ���� �����Ѵ�.)
		System.out.printf("Program End[%d][%d]records\n", k30_cnt, k30_wcnt);//���� k30_cnt�� k30_wcnt�� ȭ�鿡 ����Ѵ�.

		}

}

