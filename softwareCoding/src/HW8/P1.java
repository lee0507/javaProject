package HW8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		try {//try catch ������ ������ �ڵ���� ǥ���ϰ� ���ܰ� �߻��� ����� ������ �����Ѵ�.
			File k30_f = new File("d:\\Mytest.txt");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
			//������ ��Ÿ���� ��ü�� �����Ϸ��� File Ŭ������ ������ �Լ��� �̿��Ѵ�.
			FileWriter k30_fw = new FileWriter(k30_f);//������ �ۼ��ϱ� ���ؼ� java.io ��Ű���� FileWriter Ŭ������ �����Ѵ�.
			//������ ��Ÿ���� ��ü�� �����Ϸ��� FileWriter Ŭ������ ������ �Լ��� �̿��Ѵ�.
			
			k30_fw.write("�ȳ� ���� \n");//���Ͽ� �ȳ� ���ϰ� �ٹٲ��� �ۼ��Ѵ�.
			k30_fw.write("hello ��� \n");//���Ͽ� hello ��ο� �ٹٲ��� �ۼ��Ѵ�.
			
			k30_fw.close();//k30_fw ������ �ݴ´�. ����θ� �ٸ� ���α׷��� �۾��� �� ����.
			
			FileReader k30_fr = new FileReader(k30_f);//������ �о� ���� ���ؼ� java.io ��Ű���� FileReader Ŭ������ �����Ѵ�.
			//������ ��Ÿ���� ��ü�� �����Ϸ��� FileReader Ŭ������ ������ �Լ��� �̿��Ѵ�.
			
			int k30_n = -1;// ������ ���� k30_n�� �����ϰ� ���� -1�� �ʱ�ȭ�Ѵ�.
			char [] k30_ch;// ������ �迭 k30_ch�� �����Ѵ�.
			
			while (true) {//while �ݺ����� ������ true�� �����Ͽ� �������� �ݺ��ǵ��� �Ѵ�.
				k30_ch = new char[100];//���� k30_ch�� 100ũ���� �迭�� �����Ѵ�.
				k30_n = k30_fr.read(k30_ch);//���� k30_ch�� 100ũ�� ��ŭ ����� ������ FileReader�� �о�ͼ� ���� k30_n�� �����Ѵ�.
				
				if(k30_n == -1) break;//���� k30_n�� -1�̶�� break���� �����Ѵ�.(-1�� ���Դٴ� ���� ���̻� �ҷ��� ������ ���ٴ� ���� ���Ѵ�)
				
				for(int k30_i = 0; k30_i < k30_n; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_n���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
					System.out.printf("%c", k30_ch[k30_i]);//���� k30_ch�� k30_i �ε����� ����Ѵ�.
				}
			}
			k30_fr.close();//k30_fr ������ �ݴ´�.
			
			System.out.println("\n FILE READ END ");//�ٹٲް� FILE READ END�� ȭ�鿡 ����Ѵ�.
		} catch(Exception k30_e) {//catch ����� try��� �ȿ��� ���ܰ� �߻��ϴ� ��� ������ ���� ����ϴ� �ڵ带 �����Ѵ�.
			System.out.printf("�� ����[%s]\n", k30_e);
		}
	}

}
