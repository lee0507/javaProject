package HW8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {//Ŭ���� ����

	public static void main(String[] args) throws IOException {//�������κ��� ���α׷�����, ���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.
		FileWrite();//FileWrite �޼ҵ带 �����Ѵ�.
		FileRead();//FileRead �޼ҵ带 �����Ѵ�.
	}
	
	public static void FileWrite() throws IOException {//FileWrite��� �޼ҵ带 �����Ѵ�.
		File k30_f  = new File("d:\\text123.txt");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
		//������ ��Ÿ���� ��ü�� �����Ϸ��� File Ŭ������ ������ �Լ��� �̿��Ѵ�.
		BufferedWriter k30_bw = new BufferedWriter(new FileWriter(k30_f));//BufferedWriter�� FileWriter�� ���� ����־ Bufferó���� �Ͽ���.
		
		k30_bw.write("�ȳ� ����");//���Ͽ� �ȳ� ������ �ۼ��Ѵ�.
		k30_bw.newLine();//���Ͽ� �ٹٲ��� �ۼ��Ѵ�.
		k30_bw.write("hello ���");//���Ͽ� hello ��θ� �ۼ��Ѵ�.
		k30_bw.newLine();//���Ͽ� �ٹٲ��� �ۼ��Ѵ�.
		
		k30_bw.close();//k30_bw bufferedWriter ������ �ݴ´�.
	}
	
	public static void FileRead() throws IOException {//FileRead��� �޼ҵ带 �����Ѵ�.
		File k30_f = new File("d:\\text123.txt");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
		//������ ��Ÿ���� ��ü�� �����Ϸ��� File Ŭ������ ������ �Լ��� �̿��Ѵ�.
		BufferedReader k30_br = new BufferedReader (new FileReader(k30_f));//BufferedReader�� FileReader�� ���� ����־ Bufferó���� �Ͽ���.
		String k30_readtxt;//���ڿ��� ���� k30_readtxt�� �����Ѵ�.
		
		while((k30_readtxt = k30_br.readLine()) != null) {//while �ݺ����� ������ (k30_readtxt = k30_br.readLine()) != null�� �����Ͽ� �о�� ���� ���������� ����ؼ� �ݺ��Ѵ�.
			System.out.printf("%s\n", k30_readtxt);// �о�� ������ ���� k30_readtxt�� ȭ�鿡 ����Ѵ�.
		}
		k30_br.close();//k30_br bufferedReader ������ �ݴ´�.
	}

}
