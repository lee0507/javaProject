package HW8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P4 {//Ŭ���� ����

	public static void main(String[] args) throws IOException {//�������κ��� ���α׷�����, ���ܰ� �߻��ϸ� �ش� Ŭ�������� ����� �ȴ�.
		// TODO Auto-generated method stub
		File k30_f = new File("D:\\12_04_07_E_���������������.txt");//������ �����̳� ������ ���� ��� �ϱ� ���ؼ� java.io ��Ű���� File Ŭ������ �����Ѵ�.
		//d����̺��� �����������txt������ �о�´�.(tab�������� �и��� �����̴�)
		BufferedReader k30_br = new BufferedReader(new FileReader(k30_f));//BufferedReader�� FileReader�� ������ ����������������� ����־ Bufferó���� �Ͽ���.
		
		String k30_readtxt;//���ڿ��� ���� k30_readtxt�� �����Ѵ�.
		
		if((k30_readtxt = k30_br.readLine()) == null) {//���࿡ k30_readtxt���Ͽ� k30_br.readLine�� null���̶�� 
			System.out.printf("�� �����Դϴ�\n");//�� �����Դϴٿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		}
		//ù��° ���� ���� �о�� �ʵ���� �� ���ִ�.(�ʵ���� ���� ������ ��� ���������ϴ�.)
		String[] k30_field_name = k30_readtxt.split("\t");//�޾ƿ� k30_readtxt�� \t tab �������� �и��ؼ� ���ڿ� �迭 k30_field_name�� ���� �����Ѵ�.
		
		double k30_lat = 37.3860521;//�Ǽ��� ���� k30_lat�� �����ϰ� ���� 37.3860521�� �ʱ�ȭ�Ѵ�.
		double k30_lng = 127.1214038;//�Ǽ��� ���� k30_lng�� �����ϰ� ���� 127.1214038�� �ʱ�ȭ�Ѵ�.
		
		int k30_LineCnt = 1;//������ ���� k30_LineCnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		double k30_min = Integer.MAX_VALUE;//�Ǽ��� ���� k30_min�� �����ϰ� ���� Integer.MAX_VALUE���� �ʱ�ȭ�Ѵ�.
		double k30_max = 0;//�Ǽ��� ���� k30_max�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		String k30_name1 = "";//���ڿ��� ���� k30_name1�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.
		String k30_name2 = "";//���ڿ��� ���� k30_name2�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.
		String k30_name3 = "";//���ڿ��� ���� k30_name3�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.
		String k30_name4 = "";//���ڿ��� ���� k30_name4�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.
		String k30_mindistlat = null;//���ڿ��� ���� k30_mindistlat�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.
		String k30_mindistlng = null;//���ڿ��� ���� k30_mindistlng�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.
		String k30_maxdistlat = null;//���ڿ��� ���� k30_maxdistlat�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.
		String k30_maxdistlng = null;//���ڿ��� ���� k30_maxdistlng�� �����ϰ� ���� �ʱ�ȭ�Ѵ�.
		
		long start = System.currentTimeMillis();//�����ϴ� ���� �ð��� �޾ƿ´�.
		
		while((k30_readtxt = k30_br.readLine()) != null) {//while �ݺ����� ������ (k30_readtxt = k30_br.readLine()) != null�� �����Ͽ� �о�� ���� ���������� ����ؼ� �ݺ��Ѵ�.
			
			String[] k30_field = k30_readtxt.split("\t");//�޾ƿ� k30_readtxt�� \t tab �������� �и��ؼ� ���ڿ� �迭 k30_field�� ���� �����Ѵ�.
			if (k30_field[13] == "" || k30_field[14] == "" || k30_field[13] == "0" || k30_field[14] == "0" ) {//���� k30_field[28]�̳� k30_field[29]���� ����ִٸ� ���� 0���� �ٲپ� �����Ѵ�.
				
			} else {
				System.out.printf("**[%d��° �׸�]***************\n", k30_LineCnt);// ���� k30_LineCnt�� ȭ�鿡 ����Ѵ�.
				System.out.printf(" %s : %s\n", k30_field_name[9], k30_field[9]);//���� k30_field_name[9]�� k30_field[9]�� ȭ�鿡 ����Ѵ�.
				System.out.printf(" %s : %s\n", k30_field_name[13], k30_field[13]);//���� k30_field_name[13]�� k30_field[13]�� ȭ�鿡 ����Ѵ�.
				System.out.printf(" %s : %s\n", k30_field_name[14], k30_field[14]);//���� k30_field_name[14]�� k30_field[14]�� ȭ�鿡 ����Ѵ�.
				double k30_dist = Math.sqrt(Math.pow(Double.parseDouble(k30_field[13]) - k30_lat, 2 )//�Ǽ��� ���� k30_dist�� �����ϰ� �Ǽ������� ����ȯ�� k30_field[13]������ k30_lat�� ���� �� ���� �����Ѵ�.
						+ Math.pow(Double.parseDouble(k30_field[14]) - k30_lng, 2));//�Ǽ������� ����ȯ�� k30_field[14]������ k30_lng�� ���� �� ���� �����ϰ� �� ���� ���� ���� Math.sqrt���� ��Ʈ�� ���� ���� �����Ѵ�.
				System.out.printf(" ���������� �Ÿ� : %f\n", k30_dist);//�Ǽ��� ���� k30_dist�� ȭ�鿡 ����Ѵ�.
				System.out.printf("***************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				
				k30_LineCnt++;// �ݺ����� �ѹ� ����ɶ����� ���� k30_LineCnt�� 1�� ������Ų��.
				
				if (k30_dist < k30_min) {//���࿡ k30_dist�� k30_min���� �۴ٸ�
					k30_min = k30_dist;//k30_min�� k30_dist���� �����Ѵ�.
					k30_name1 = k30_field[9];//�׸��� k30_name1�� k30_field[1]�� ���� �̸��� �����Ѵ�.
					k30_name3 = k30_field[2];
					k30_mindistlat = k30_field[13];
					k30_mindistlng = k30_field[14];
					
				}
				if (k30_dist > k30_max) {//���࿡ k30_dist�� k30_max���� ũ�ٸ�
					k30_max = k30_dist;//k30_max�� k30_dist���� �����Ѵ�.
					k30_name2 = k30_field[9];//�׸��� k30_name2�� k30_field[1]�� ���� �̸��� �����Ѵ�.
					k30_name4 = k30_field[2];
					k30_maxdistlat = k30_field[13];
					k30_maxdistlng = k30_field[14];
				}
			}


		}
		
		k30_br.close();//k30_br bufferedReader ������ �ݴ´�.
		long end = System.currentTimeMillis();//������ ���� �ð��� �޾ƿ´�.
		System.out.println("ó���Ǽ� : " + (k30_LineCnt - 1) + "��");
		System.out.println("����ð� : " + (end - start) / 1000.0 + "��");//������ �ð����� ������ �ð��� ���� ���࿡ �ɸ� �ð��� ����Ѵ�.(1 / 1000�� ���� �����Ѵ�.)
		System.out.printf("�д����ձ���������� ���� ����� ���� %s %s�̸� �Ÿ��� %f�̰� ������ %s, �浵�� %s�Դϴ�.\n", k30_name1, k30_name3, k30_min, k30_mindistlat, k30_mindistlng);//���� k30_name1�� k30_min�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�д����ձ���������� ���� �� ���� %s %S�̸� �Ÿ��� %f�̰� ������ %s, �浵�� %s�Դϴ�.\n", k30_name2, k30_name4, k30_max, k30_maxdistlat, k30_maxdistlng);//���� k30_name2�� k30_max�� ȭ�鿡 ����Ѵ�.
	}

}
