package HW7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class P11classScoreArrayList {
	
	static ArrayList <P11OneRec> k30_ArrayOneRec = new ArrayList <P11OneRec>();//Ŭ������ ArrayLlist k30_ArrayOneRec�� �����Ѵ�.
	
	static int k30_sumkor = 0;//�������� k30_sumkor�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_sumeng = 0;//�������� k30_sumeng�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_summat = 0;//�������� k30_summat�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_sumsum = 0;//�������� k30_sumsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_sumavg = 0;//�������� k30_sumavg�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_cnt = 0;//�������� k30_cnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_pagecnt = 0;
	static int k30_pagesumkor = 0;// �������������� k30_pagekorsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pagesumeng = 0;// �������������� k30_pageengsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pagesummat = 0;// �������������� k30_pagematsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pagesumsum = 0;// �������������� k30_pagetotalsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pagesumavg = 0;// �Ǽ����������� k30_pageavg�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static final int k30_iPerson = 200;//�������� k30_iPerson�� �����ϰ� ���� 200���� �ʱ�ȭ�Ͽ���.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dataSet();//dataSet�Լ��� �����Ͽ� data�� �޾ƿ´�.
		dataSort();//dataSort�Լ��� �����Ͽ� data���� �����Ѵ�.
		for(int k30_i = 0; k30_i < k30_ArrayOneRec.size(); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_ArrayOneRec�� ũ����� k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			
			if(k30_cnt % 30 == 0) {//���� k30_cnt�� 30���� ���������� �������� 0�̶��
				HeaderPrint();//HeaderPrint�Լ��� �����Ͽ� Header�� ȭ�鿡 ����Ѵ�
			}
			
			ItemPrint(k30_i);//ItemPrint�Լ��� �Ķ���ͷ� k30_i�� �ְ� �����Ѵ�.
			k30_cnt++;//�������� k30_cnt�� 1�� ������Ų��.
			
			if(k30_cnt % 30 == 0) {//���� k30_cnt�� 30���� ���������� �������� 0�̶��
				TailPrint();//TailPrint�Լ��� �����Ͽ� Tail�� ȭ�鿡 ����Ѵ�.
				resetPagesum();//resetPagesum�Լ��� �����Ͽ� k30_pagesum�������� 0���� �����Ѵ�.
			}
			
		}
		TailPrint2();//TailPrint�Լ��� �����Ͽ� Tail�� ȭ�鿡 ����Ѵ�.


	}

	private static void dataSort() {//dataSort�Լ��� �����Ѵ�.
		Comparator<P11OneRec> k30_st = new Comparator<P11OneRec>() {//Comparator Ŭ������ �޾Ƽ� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
			public int compare1(P11OneRec k30_a1, P11OneRec k30_a2) {//�Լ� compare�� ����� �Ķ���ͷ� k30_a1�� k30_a2�� �޴´�.
				return (k30_a2.sum() - k30_a1.sum());//���ϰ����� k30_a2�� sum�Լ����� k30_a1�� sum�Լ��� �� ���� �޴´�.
			}

			@Override
			public int compare(P11OneRec k30_o1, P11OneRec k30_o2) {//compare �޼ҵ带 �����ε��ϰ� �Ķ���ͷ� k30_o1�� k30_o2�� �޴´�.
				// TODO Auto-generated method stub
				return (k30_o2.sum() - k30_o1.sum());//���ϰ����� k30_o2�� sum�Լ����� k30_o1�� sum�Լ��� �� ���� �޴´�.
			}

		};
		Collections.sort(k30_ArrayOneRec, k30_st);//Collections.sort�� k30_ArrayOneRec �迭�� �����Ѵ�.
		
	}

	private static void TailPrint() {
		// TODO Auto-generated method stub
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("����������\n");//������������ �ٹٲ��� ȭ�鿡 ����Ѵ�
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_pagesumkor, k30_pagesumkor / 30.);//���� k30_pagesumkor�� k30_cnt�� ���� k30_sumpagekor�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_pagesumeng, k30_pagesumeng / 30.);//���� k30_pagesumeng�� k30_cnt�� ���� k30_sumpageeng�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_pagesummat, k30_pagesummat / 30.);//���� k30_pagesummat�� k30_cnt�� ���� k30_sumpagemat�� ȭ�鿡 ����Ѵ�.
		System.out.printf("������հ� %d  �����: %6.2f\n", k30_pagesumavg, k30_pagesumavg / 30.);//���� k30_pagesumavg�� k30_cnt�� ���� k30_sumpageavg�� ȭ�鿡 ����Ѵ�.
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("����������\n");//������������ �ٹٲ��� ȭ�鿡 ����Ѵ�
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_sumkor, k30_sumkor / (double)k30_cnt);//���� k30_sumkor�� k30_cnt�� ���� k30_sumkor�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_sumeng, k30_sumeng / (double)k30_cnt);//���� k30_sumeng�� k30_cnt�� ���� k30_sumeng�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_summat, k30_summat / (double)k30_cnt);//���� k30_summat�� k30_cnt�� ���� k30_summat�� ȭ�鿡 ����Ѵ�.
		System.out.printf("������հ� %d  �����: %6.2f\n", k30_sumavg, k30_sumavg / (double)k30_cnt);//���� k30_sumavg�� k30_cnt�� ���� k30_sumavg�� ȭ�鿡 ����Ѵ�.
		System.out.println();//�ٹٲ��� ȭ�鿡 ����Ѵ�.

		
	}
	
	private static void TailPrint2() {
		System.out.printf("����������\n");//������������ �ٹٲ��� ȭ�鿡 ����Ѵ�
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_pagesumkor, k30_pagesumkor / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.)));//���� k30_pagesumkor�� k30_cnt�� ���� k30_sumpagekor�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_pagesumeng, k30_pagesumeng / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.)));//���� k30_pagesumeng�� k30_cnt�� ���� k30_sumpageeng�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_pagesummat, k30_pagesummat / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.)));//���� k30_pagesummat�� k30_cnt�� ���� k30_sumpagemat�� ȭ�鿡 ����Ѵ�.
		System.out.printf("������հ� %d  �����: %6.2f\n", k30_pagesumavg, k30_pagesumavg / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.)));//���� k30_pagesumavg�� k30_cnt�� ���� k30_sumpageavg�� ȭ�鿡 ����Ѵ�.
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("����������\n");//������������ �ٹٲ��� ȭ�鿡 ����Ѵ�
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_sumkor, k30_sumkor / (double)k30_cnt);//���� k30_sumkor�� k30_cnt�� ���� k30_sumkor�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_sumeng, k30_sumeng / (double)k30_cnt);//���� k30_sumeng�� k30_cnt�� ���� k30_sumeng�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_summat, k30_summat / (double)k30_cnt);//���� k30_summat�� k30_cnt�� ���� k30_summat�� ȭ�鿡 ����Ѵ�.
		System.out.printf("������հ� %d  �����: %6.2f\n", k30_sumavg, k30_sumavg / (double)k30_cnt);//���� k30_sumavg�� k30_cnt�� ���� k30_sumavg�� ȭ�鿡 ����Ѵ�.
		System.out.println();//�ٹٲ��� ȭ�鿡 ����Ѵ�.
	}

	private static void ItemPrint(int k30_i) {//ItemPring�Լ��� �����ϰ� �Ķ���ͷ� ������ ���� k30_i�� �־���..
		// TODO Auto-generated method stub
		P11OneRec k30_rec;//P9OneRec Ŭ������ �޾Ƽ� ��ü�� �����.
		
		k30_rec = k30_ArrayOneRec.get(k30_i);//�ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		System.out.printf("%3d  %-5s %3d  %3d  %3d  %3d  %6.2f\n", k30_rec.student_id(), k30_rec.name(), k30_rec.kor(), k30_rec.eng(), k30_rec.mat(), k30_rec.sum(), k30_rec.avg());
		//�������� ȭ�鿡 ����Ѵ�.
		k30_sumkor += k30_rec.kor();// ���� k30_sumkor�� k30_rec.kor()�� ���Ѵ�.
		k30_sumeng += k30_rec.eng();// ���� k30_sumeng�� k30_rec.eng()�� ���Ѵ�.
		k30_summat += k30_rec.mat();// ���� k30_summat�� k30_rec.mat()�� ���Ѵ�.
		k30_sumsum += k30_rec.sum();// ���� k30_sumsum�� k30_rec.sum()�� ���Ѵ�.
		k30_sumavg += k30_rec.avg();// ���� k30_sumavg�� k30_rec.avg()�� ���Ѵ�.
		k30_pagesumkor += k30_rec.kor();// ���� k30_pagesumkor�� k30_rec.kor()�� ���Ѵ�.
		k30_pagesumeng += k30_rec.eng();// ���� k30_pagesumeng�� k30_rec.eng()�� ���Ѵ�.
		k30_pagesummat += k30_rec.mat();// ���� k30_pagesummat�� k30_rec.mat()�� ���Ѵ�.
		k30_pagesumsum += k30_rec.sum();// ���� k30_pagesumsum�� k30_rec.sum()�� ���Ѵ�.
		k30_pagesumavg += k30_rec.avg();// ���� k30_pagesumavg�� k30_rec.avg()�� ���Ѵ�.
		
	}
	
	private static void resetPagesum() {//resetPagesum�Լ��� �����Ѵ�.
		// TODO Auto-generated method stub
		k30_pagesumkor = 0;// ���� k30_pagesumkor�� 0���� �ʱ�ȭ�Ѵ�.
		k30_pagesumeng = 0;// ���� k30_pagesumeng�� 0���� �ʱ�ȭ�Ѵ�.
		k30_pagesummat = 0;// ���� k30_pagesummat�� 0���� �ʱ�ȭ�Ѵ�.
		k30_pagesumsum = 0;// ���� k30_pagesumsum�� 0���� �ʱ�ȭ�Ѵ�.
		k30_pagesumavg = 0;// ���� k30_pagesumavg�� 0���� �ʱ�ȭ�Ѵ�.
		
	}

	private static void HeaderPrint() {//HeaderPring�Լ��� �����Ѵ�.

		Date k30_d = new Date();//�ý����� ��¥ �� �ð��� ���� �� �ֵ��� java.util ��Ű���� Date Ŭ������ �����Ѵ�.
		SimpleDateFormat k30_sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
		 //Format������ ("yyyy/MM/dd HH:mm:ss")�� �����Ѵ�.
		k30_pagecnt++;
		System.out.printf("%16s\n","��������ǥ");//��������ǥ�� �ٹٲ��� ȭ�鿡 ����Ѵ�
		System.out.printf("PAGE : %d  ������� : %s\n", k30_pagecnt, k30_sf.format(k30_d));//��¥�� �޾ƿ� ���� k30_d�� �Ʊ� ������ SimpleDateFormat���� yyyy.MM.dd HH:mm:ss ���·� ����Ѵ�.
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%2s%4s %3s %2s %2s %2s   %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");//Header�� ȭ�鿡 ����Ѵ�.
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
	}

	private static void dataSet() {//dataSetPrint�Լ��� �����Ѵ�.
		// TODO Auto-generated method stub
		for (int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for�ݺ������� k30_i�� 0���� k30_iPerson���� ���������� 1�� ������Ű�鼭 �����Ѵ�.
			String k30_name = String.format("ȫ��%02d", k30_i + 1);//���� k30_name�� k30_i + 1�� string���� ����ȯ�� ���� ȫ��%02d�� ������ �����Ѵ�. 
			int k30_kor = (int)(Math.random() * 100);//���� k30_kor�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_eng = (int)(Math.random() * 100);//���� k30_eng�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_mat = (int)(Math.random() * 100);//���� k30_mat�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			k30_ArrayOneRec.add(new P11OneRec(k30_i + 1, k30_name, k30_kor, k30_eng, k30_mat));//ArrayList�� P9OneRec �Լ��� ���ؼ� ������� ���� �����Ѵ�.
		}
	}
}

