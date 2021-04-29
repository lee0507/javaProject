package HW7;

import java.util.ArrayList;

public class P9classScoreArrayList {//Ŭ���� ����
	
	static ArrayList <P9OneRec> k30_ArrayOneRec = new ArrayList <P9OneRec>();//Ŭ������ ArrayLlist k30_ArrayOneRec�� �����Ѵ�.
	
	static int k30_sumkor = 0;//�������� k30_sumkor�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_sumeng = 0;//�������� k30_sumeng�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_summat = 0;//�������� k30_summat�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_sumsum = 0;//�������� k30_sumsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static int k30_sumavg = 0;//�������� k30_sumavg�� �����ϰ� ���� 0���� �ʱ�ȭ�Ͽ���.
	static final int k30_iPerson = 20;//�������� k30_iPerson�� �����ϰ� ���� 20���� �ʱ�ȭ�Ͽ���.
	
	
	
	
	public static void main(String[] args) {//�������κ��� ���α׷�����
		dataSet();//dataSet�Լ��� �����Ͽ� data�� �޾ƿ´�.
		HeaderPrint();//HeaderPrint�Լ��� �����Ͽ� Header�� ȭ�鿡 ����Ѵ�
		for(int k30_i = 0; k30_i < k30_ArrayOneRec.size(); k30_i++) {//for�ݺ������� k30_i�� 0���� k30_ArrayOneRec�� ũ�⺸�� ���������� 1�� ������Ű�鼭 �����Ѵ�.
			ItemPrint(k30_i);//ItemPrint�Լ��� �Ķ���ͷ� k30_i�� �ְ� �����Ѵ�.
		}
		TailPrint();//TailPrint�Լ��� �����Ͽ� Tail�� ȭ�鿡 ����Ѵ�.
	}

	private static void TailPrint() { //TailPrint�Լ��� �����Ѵ�.
		System.out.printf("*****************************************\n");//*���� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_sumkor, k30_sumkor / (double)k30_ArrayOneRec.size());//���� k30_sumkor�� Array�� ũ��� ���� k30_sumkor�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_sumeng, k30_sumeng / (double)k30_ArrayOneRec.size());//���� k30_sumeng�� Array�� ũ��� ���� k30_sumeng�� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����հ� %5d  �������: %6.2f\n", k30_summat, k30_summat / (double)k30_ArrayOneRec.size());//���� k30_summat�� Array�� ũ��� ���� k30_summat�� ȭ�鿡 ����Ѵ�.
		System.out.printf("*****************************************\n");//*���� ȭ�鿡 ����Ѵ�.
		System.out.printf("������հ� %d  �����: %6.2f\n", k30_sumavg, k30_sumavg / (double)k30_ArrayOneRec.size());//���� k30_sumavg�� Array�� ũ��� ���� k30_sumavg�� ȭ�鿡 ����Ѵ�.
	}

	private static void ItemPrint(int k30i) {//ItemPring�Լ��� �����ϰ� �Ķ���ͷ� ������ ���� k30_i�� �־���..
		P9OneRec k30_rec;//P9OneRec Ŭ������ �޾Ƽ� ��ü�� �����.
		
		k30_rec = k30_ArrayOneRec.get(k30i);//�ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		System.out.printf("%3d  %s %3d  %3d  %3d  %3d  %6.2f\n", k30_rec.student_id(), k30_rec.name(), k30_rec.kor(), k30_rec.eng(), k30_rec.mat(), k30_rec.sum(), k30_rec.avg());
		//�������� ȭ�鿡 ����Ѵ�.
		k30_sumkor += k30_rec.kor();// ���� k30_sumkor�� k30_rec.kor()�� ���Ѵ�.
		k30_sumeng += k30_rec.eng();// ���� k30_sumeng�� k30_rec.eng()�� ���Ѵ�.
		k30_summat += k30_rec.mat();// ���� k30_summat�� k30_rec.mat()�� ���Ѵ�.
		k30_sumsum += k30_rec.sum();// ���� k30_sumsum�� k30_rec.sum()�� ���Ѵ�.
		k30_sumavg += k30_rec.avg();// ���� k30_sumavg�� k30_rec.avg()�� ���Ѵ�.
		
	}

	private static void HeaderPrint() {//TailPrint�Լ��� �����Ѵ�.
		System.out.printf("*****************************************\n");//*���� ȭ�鿡 ����Ѵ�.
		System.out.printf("%2s%4s %3s %2s %2s %2s   %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");//Header�� ȭ�鿡 ����Ѵ�.
		System.out.printf("*****************************************\n");//*���� ȭ�鿡 ����Ѵ�.
	}

	private static void dataSet() {//dataSet�Լ��� �����Ѵ�.
		for (int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for�ݺ������� k30_i�� 0���� k30_iPerson���� ���������� 1�� ������Ű�鼭 �����Ѵ�.
			String k30_name = String.format("ȫ��%02d", k30_i);//���� k30_name�� k30_i�� string���� ����ȯ�� ���� ȫ��%02d�� ������ �����Ѵ�. 
			int k30_kor = (int)(Math.random() * 100);//���� k30_kor�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_eng = (int)(Math.random() * 100);//���� k30_eng�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_mat = (int)(Math.random() * 100);//���� k30_mat�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			k30_ArrayOneRec.add(new P9OneRec(k30_i, k30_name, k30_kor, k30_eng, k30_mat));//ArrayList�� P9OneRec �Լ��� ���ؼ� ������� ���� �����Ѵ�.
		}
	}
}
