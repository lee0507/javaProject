package HW8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P5 {//Ŭ���� ����

	public static void main(String[] args) throws IOException {//�������κ��� ���α׷�����, ���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.
		// TODO Auto-generated method stub
		File k30_f = new File("d:\\day_data\\THTSKS010H00.dat");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
		//d����̺��� �ֽ�����������dat������ �о�´�.
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader�� FileReader�� ������ �ֽ����������͸� ����־ Bufferó���� �Ͽ���.
		
		int k30_LineCnt = 0;//������ ������ k30_LineCnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_n = -1;//������ ������ k30_n�� �����ϰ� ���� -1���� �ʱ�ȭ�Ѵ�.
		StringBuffer k30_s = new StringBuffer();// Bufferó���� �� ���� k30_s�� �����Ѵ�.
		while (true) {//while �ݺ����� ������ true�� �����Ͽ� �������� �ݺ����� ����ǵ��� �Ѵ�.
			char[] k30_ch = new char[1000];//���� k30_ch�� 1000ũ���� �迭�� �����Ѵ�.
			
			k30_n = k30_br.read(k30_ch);//���� k30_ch�� 1000ũ�� ��ŭ ����� ������ FileReader�� �о�ͼ� ���� k30_n�� �����Ѵ�.
			
			if(k30_n == -1) break;//���� k30_n�� -1�̶�� break���� �����Ѵ�.(-1�� ���Դٴ� ���� ���̻� �ҷ��� ������ ���ٴ� ���� ���Ѵ�)
			
			for (char k30_c : k30_ch) {//k30_ch������ �ٽ� character�� ��ȯ�Ͽ� k30_s�� �����Ѵ�.
				if (k30_c == '\n') {//���� k30_c�� \n�ٹٲ��̶��  
					System.out.printf("[%s]***\n", k30_s.toString());//k30_s�� ���ڿ��� ����ȯ�ϰ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				} else {//k30_c�� �ٹٲ��� �ƴ϶��
					k30_s.append(k30_c);// ���� k30_s�� k30_c�� �߰��Ѵ�.
				}
			}
			
			k30_LineCnt++;// �ݺ����� �ѹ� ����ɶ����� ���� k30_LineCnt�� 1�� ������Ų��.
		}
		System.out.printf("[%s]***\n", k30_s.toString());//�ݺ����� ������ ���� k30_s�� ���ڿ��� ����ȯ�ϰ� ȭ�鿡 ����Ѵ�.
		k30_br.close();//k30_br bufferedReader ������ �ݴ´�.
	}

}
