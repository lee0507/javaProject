package HW6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P15ReportSheet {
	static int k30_korsum = 0;// ���������� k30_korsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_engsum = 0;// ���������� k30_engsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_matsum = 0;// ���������� k30_matsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_totalsum = 0;// ���������� k30_totalsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pagekorsum = 0;// ���������� k30_pagekorsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pageengsum = 0;// ���������� k30_pageengsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pagematsum = 0;// ���������� k30_pagematsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pagetotalsum = 0;// ���������� k30_pagetotalsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static double k30_pageavg = 0;// �Ǽ������� k30_pageavg�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static double k30_avg = 0;// �Ǽ������� k30_avg�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_cnt = 0;// ���������� k30_cnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	static int k30_pagecnt = 0;
	
	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		Date k30_d = new Date();//�ý����� ��¥ �� �ð��� ���� �� �ֵ��� java.util ��Ű���� Date Ŭ������ �����Ѵ�.
		SimpleDateFormat k30_sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
		 //Format������ ("yyyy/MM/dd HH:mm:ss")�� �����Ѵ�.
		
		int k30_iPerson = 200;//���������� k30_iPerson�� �����ϰ� ���� 200���� �ʱ�ȭ�Ѵ�.

		P13InputData k30_inData = new P13InputData(k30_iPerson);//P13InputData Ŭ������ �Ķ���͸� inPerson���� �ش��� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		
		for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iPerson���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			String k30_name = String.format("ȫ��%02d", k30_i + 1);//���� k30_name�� k30_i�� string���� ����ȯ�� ���� ȫ��%02d�� ������ �����Ѵ�. 
			int k30_kor = (int)(Math.random() * 100);//���� k30_kor�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_eng = (int)(Math.random() * 100);//���� k30_eng�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_mat = (int)(Math.random() * 100);//���� k30_mat�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			k30_inData.SetData(k30_i, k30_name, k30_kor, k30_eng, k30_mat);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� P13InputDataŬ������ SetData�Լ��� �����Ѵ�.
		}
		
			for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iPerson���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.

				if(k30_cnt % 30 == 0) {//���� cnt�� 30���� ���������� �������� 0�̶�� ���� ������ ����Ѵ�.
					System.out.printf("%13s\n", "��������ǥ");//��������ǥ�� ȭ�鿡 ����Ѵ�.
					System.out.printf("PAGE : %d         ������� : %20s\n", k30_pagecnt + 1, k30_sf.format(k30_d));//��������ǥ�� ȭ�鿡 ����Ѵ�.
				    System.out.printf("=================================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				    System.out.printf("%s %3s  %5s%5s%5s%5s%5s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				    System.out.printf("=================================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				    k30_pagecnt++;
				}
				
				System.out.printf("%03d %5s %6d %6d %6d %6d %8.2f\n",k30_i + 1, k30_inData.k30_name[k30_i], k30_inData.k30_kor[k30_i], 
						k30_inData.k30_eng[k30_i], k30_inData.k30_mat[k30_i], k30_inData.k30_sum[k30_i], k30_inData.k30_avg[k30_i]);//�������� ������� ȭ�鿡 ����Ѵ�.
				k30_korsum += k30_inData.k30_kor[k30_i];//���� k30_korsum �� k30_inData.k30_kor[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_engsum += k30_inData.k30_eng[k30_i];//���� k30_engsum �� k30_inData.k30_eng[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_matsum += k30_inData.k30_mat[k30_i];//���� k30_matsum �� k30_inData.k30_mat[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_totalsum += k30_inData.k30_sum[k30_i];//���� k30_totalsum �� k30_inData.k30_sum[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_avg += k30_inData.k30_avg[k30_i];//���� k30_avg �� k30_inData.k30_avg[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_cnt++;//���� k30_cnt�� �ϳ��� ������Ų��.
				k30_pagekorsum += k30_inData.k30_kor[k30_i];//���� k30_pagekorsum �� k30_inData.k30_kor[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_pageengsum += k30_inData.k30_eng[k30_i];//���� k30_pageengsum �� k30_inData.k30_eng[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_pagematsum += k30_inData.k30_mat[k30_i];//���� k30_pagematsum �� k30_inData.k30_mat[i]�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_pagetotalsum = k30_pagekorsum + k30_pageengsum + k30_pagematsum;//���� k30_pagematsum �� k30_pagekorsum�� k30_pageengsum�� k30_pagematsum�� �ϳ��� ���Ͽ� ���� �����Ѵ�.
				k30_pageavg = k30_pagetotalsum / 3.;//���� k30_pageavg �� k30_pagetotalsum ���� 3���� ������ ���� �����Ѵ�.
				
				if(k30_cnt % 30 == 0) {//���� cnt�� 30���� ���������� �������� 0�̶�� ���� ������ ����Ѵ�.
					System.out.printf("=================================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
					System.out.printf("����������\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
					System.out.printf("�հ� :%12d %6d %6d %6d %8.2f\n", k30_pagekorsum, k30_pageengsum, k30_pagematsum, k30_pagetotalsum, k30_pageavg);//�������� ������� ����Ѵ�.
					System.out.printf("��� :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_pagekorsum / 30.), (k30_pageengsum / 30.), (k30_pagematsum / 30.), (k30_pagetotalsum / 30.), (k30_pageavg / 30.));
					System.out.printf("=================================================\n");//�������� 30���� ���� �� ������� ����ϰ� =���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
					System.out.printf("����������\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
					System.out.printf("�հ� :%12d %6d %6d %6d %8.2f\n", k30_korsum, k30_engsum, k30_matsum, k30_totalsum, k30_avg);//�������� ������� ����Ѵ�.
					System.out.printf("��� :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_korsum / (double)(k30_i + 1)), (k30_engsum / (double)(k30_i + 1)), 
							(k30_matsum / (double)(k30_i + 1)), (k30_totalsum / (double)(k30_i + 1)), (k30_avg / (double)(k30_i + 1)));//k30_i�� 0���� �����ؼ� +1�Ͽ��� ������ �־���.
					System.out.println();
					
					k30_pagekorsum = 0;// ���������� k30_pagekorsum�� ���� 0���� �ʱ�ȭ�Ѵ�.
					k30_pageengsum = 0;// ���������� k30_pageengsum�� ���� 0���� �ʱ�ȭ�Ѵ�.
					k30_pagematsum = 0;// ���������� k30_pagematsum�� ���� 0���� �ʱ�ȭ�Ѵ�.
					k30_pagetotalsum = 0;// ���������� k30_pagetotalsum�� ���� 0���� �ʱ�ȭ�Ѵ�.
					k30_pageavg = 0;// ���������� k30_pageavg�� ���� 0���� �ʱ�ȭ�Ѵ�.
				}
				
			}
			if(k30_cnt % 30 != 0) {
				System.out.printf("=================================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				System.out.printf("����������\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				System.out.printf("�հ� :%12d %6d %6d %6d %8.2f\n", k30_pagekorsum, k30_pageengsum, k30_pagematsum, k30_pagetotalsum, k30_pageavg);//�������� ������� ����Ѵ�.
				System.out.printf("��� :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_pagekorsum / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))), (k30_pageengsum / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))), 
						(k30_pagematsum / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))), (k30_pagetotalsum / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))), (k30_pageavg / (double)(k30_iPerson % ((k30_pagecnt - 1) * 30.))));
			    System.out.printf("=================================================\n");//�������� 30���� ���� �� ������� ����ϰ� =���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				System.out.printf("����������\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
				System.out.printf("�հ� :%12d %6d %6d %6d %8.2f\n", k30_korsum, k30_engsum, k30_matsum, k30_totalsum, k30_avg);//�������� ������� ����Ѵ�.
				System.out.printf("��� :%12.2f %6.2f %6.2f %6.2f %8.2f\n", (k30_korsum / (double)k30_iPerson), (k30_engsum / (double)k30_iPerson), 
						(k30_matsum / (double)k30_iPerson), (k30_totalsum / (double)k30_iPerson), (k30_avg / (double)k30_iPerson));//������ k30_iPerson���� �������� ����� ����Ͽ���.
			}


		}

		
	}


