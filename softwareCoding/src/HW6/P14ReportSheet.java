package HW6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P14ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date k30_d = new Date();//�ý����� ��¥ �� �ð��� ���� �� �ֵ��� java.util ��Ű���� Date Ŭ������ �����Ѵ�.
		SimpleDateFormat k30_sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
		 //Format������ ("yyyy/MM/dd HH:mm:ss")�� �����Ѵ�.
		int k30_iPerson = 30;//������ ���� iPerson�� �����ϰ� ���� 30���� �ʱ�ȭ�Ѵ�.
		
		int k30_pagekorsum = 0;//������ ���� k30_pagekorsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_pageengsum = 0;//������ ���� k30_pageengsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_pagematsum = 0;//������ ���� k30_pagematsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_pagetotalsum = 0;//������ ���� k30_pagetotalsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		double k30_pageavg = 0;//������ ���� k30_pageavg�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		
		P13InputData k30_inData = new P13InputData(k30_iPerson);//P13InputData Ŭ������ �Ķ���͸� inPerson���� �ش��� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		
		for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iPerson���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			String k30_name = String.format("ȫ��%02d", k30_i + 1);//���� k30_name�� k30_i�� string���� ����ȯ�� ���� ȫ��%02d�� ������ �����Ѵ�. 
			int k30_kor = (int)(Math.random() * 100);//���� k30_kor�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_eng = (int)(Math.random() * 100);//���� k30_eng�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_mat = (int)(Math.random() * 100);//���� k30_mat�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			k30_inData.SetData(k30_i, k30_name, k30_kor, k30_eng, k30_mat);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� P13InputDataŬ������ SetData�Լ��� �����Ѵ�.
		}

		System.out.printf("%s\n", "��������ǥ");//��������ǥ�� ȭ�鿡 ����Ѵ�.
		System.out.printf("%s\n", "��������ǥ");//��������ǥ�� ȭ�鿡 ����Ѵ�. 
		System.out.printf("������� : %s\n", k30_sf.format(k30_d));//��¥�� �޾ƿ� ���� k30_d�� �Ʊ� ������ SimpleDateFormat���� yyyy.MM.dd HH:mm:ss ���·� ����Ѵ�.
	    System.out.printf("=================================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
	    System.out.printf("%s %3s  %5s%5s%5s%5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
	    System.out.printf("=================================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		for(int i = 0; i < k30_iPerson; i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iPerson���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf("%03d %5s %6d %6d %6d %6d %8.2f\n",//�������� ȭ�鿡 ����Ѵ�.
					i + 1, k30_inData.k30_name[i], k30_inData.k30_kor[i], k30_inData.k30_eng[i], k30_inData.k30_mat[i], k30_inData.k30_sum[i], k30_inData.k30_avg[i]);
			k30_pagekorsum += k30_inData.k30_kor[i];//���� k30_pagekorsum �� k30_inData.k30_kor[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
			k30_pageengsum += k30_inData.k30_eng[i];//���� k30_pageengsum �� k30_inData.k30_kor[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
			k30_pagematsum += k30_inData.k30_mat[i];//���� k30_pagematsum �� k30_inData.k30_kor[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
			k30_pagetotalsum += k30_inData.k30_sum[i];//���� k30_pagetotalsum �� k30_inData.k30_kor[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
			k30_pageavg += k30_inData.k30_avg[i];//���� k30_pageavg �� k30_inData.k30_kor[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
			
		}
	    System.out.printf("=================================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
	    System.out.printf("�հ� :%12d %6d %6d %6d %8.2f\n", k30_pagekorsum, k30_pageengsum, k30_pagematsum, k30_pagetotalsum, k30_pageavg);
	    System.out.printf("��� :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_pagekorsum / (double)k30_iPerson), (k30_pageengsum / (double)k30_iPerson), 
	    		(k30_pagematsum / (double)k30_iPerson), (k30_pagetotalsum / (double)k30_iPerson), (k30_pageavg / (double)k30_iPerson));
	    //�������� ������� ȭ�鿡 ����Ѵ�.
	}

}
