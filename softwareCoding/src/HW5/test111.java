package HW5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test111 {
//����ü�� ����ϱ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date k30_d = new Date();
		Calendar k30_cal = Calendar.getInstance();
		k30_cal.add(Calendar.HOUR_OF_DAY, -1);
		Date k30_date = k30_cal.getTime();
		SimpleDateFormat k30_sf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat k30_sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat k30_sf3 = new SimpleDateFormat("yyyyMMdd");
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###");
		String[] k30_name = {"����Ȩ SAFE365 �ڵ����", "(G) LH��������ȭ�� 10ȣ", "��������E", "���� ���Ϸ� �� �ѷ�", "��� �Ŷ�� 120g*5",
				"(��)����������", "���ѱ� ������� 155g", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����(g)", 
				"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK22", "DZ�ִϾ�縻3��C_WH22", "�����̾��������ʹ�", "����ũ ����̿���500g",
				"���� ���ִ� ����GT ������", "���������÷�10��", "�Ŷ�����(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼����� ����",
				"���Ϸν���������500g", "CJ ����Ĩ 20G", "����ũ ����̿���500g", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư��",
				"���׽����� �ѹ��� ������¡��", "���̼��� ��ȭǳ ������","�絵���� ���� �������� 1.5kg", "���� ���� ����� �η�ġ�� 500g", "���� �ӽ�ũ ��� 1.5kg"};
		int[] k30_price = {7500, 6900, 5980, 3300000, 3380, 6610, 2750, 10800, 4980, 2480, 
				7920, 4980, 4980, 7130, 3980, 4480, 4980, 3210, 6950, 2980,
				1990, 1980, 3980, 4480, 3480, 17400, 10900, 12800, 9990, 13900};
		int[] k30_amount = {19, 20, 1, 1, 1, 1, 1, 1, 1, 1, 
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		boolean[] k30_taxfree = {false, false, false, false, false, true, false, true, true, false, 
				false, false, false, false, false, true, false, false, false, false,
				false, false, false, false, false, true, false, true, false, true};
		int k30_taxfreesum = 0;
		int k30_taxsum = 0;
		int k30_count = 0;
		System.out.printf("%s%20s\n", "��-�� ***** **** *** *  ", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%s%20s\n", "* * * * *    * *   ***", "   �̸�Ʈ ������ (031)888-1234");
		System.out.printf("%s%20s\n", "*** * * * **** *   *", "206-86-50913 ����");
		System.out.printf("%s%24s\n", "*   * * * *  * *   *", "���� ������ �������");
		System.out.printf("%s%20s\n", "*** * * * **** *   ***", " �̸�Ʈ ������ (031)888-1234");
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n", "*�Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("[����]%s  %17s\n", k30_sf1.format(k30_d), "POS:0011-9861");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-18s %3s %2s %6s\n", "��ǰ��", "�ܰ�", "����", "�ݾ�");
		System.out.printf("-----------------------------------------\n");
		
		for (int k30_i = 0; k30_i < k30_name.length; k30_i++) {
			String k30_temp = k30_name[k30_i] + "                   ";
	        byte[] k30_bb = k30_temp.getBytes();
	        int k30_cnt = 0;
	        
	        for(int k30_j = 0; k30_j < 17; k30_j++) {
	        	if(k30_bb[k30_j] < 0)
	        		k30_cnt++;
	        }
	        if (k30_cnt % 2 == 0) {
		        k30_temp = new String(k30_bb, 0, 17) + " ";
	        } else if (k30_bb[17] < 0){
	        	k30_temp = new String(k30_bb, 0, 16) + "  ";
	        } else {
	        	k30_temp = new String(k30_bb, 0, 17) + " ";
	        }

			if (k30_taxfree[k30_i] == true) {
				System.out.printf("*%s%9s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]));
				k30_taxfreesum += (k30_amount[k30_i] * k30_price[k30_i]);
			} else {
				System.out.printf(" %s%9s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]));
				k30_taxsum += (k30_amount[k30_i] * k30_price[k30_i]);
			}
			k30_count++;
			if(k30_count % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
		}
		double k30_taxrate = 0.1;
		int k30_beforetax = (int)(k30_taxsum / (1 + k30_taxrate));
		int tax = k30_taxsum - k30_beforetax;
		int newpoint = (k30_taxfreesum + k30_taxsum) / 1000;
		int point = 5743;
		System.out.println();
		System.out.printf("%20s%16d\n","��ǰ�����", k30_count);
		System.out.printf("%21s%16s\n","(*)�鼼  ��ǰ",k30_df.format(k30_taxfreesum));
		System.out.printf("%21s%16s\n","����  ��ǰ", k30_df.format(k30_beforetax));
		System.out.printf("%22s%16s\n","��  ��  ��", k30_df.format(tax));
		System.out.printf("%23s%16s\n","��      ��", k30_df.format(k30_taxfreesum + k30_taxsum));
		System.out.printf("�� �� �� �� �� ��%24s\n", k30_df.format(k30_taxfreesum + k30_taxsum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-17s %17s", "0012 KEB �ϳ�", "541707**0484/35860658\n");
		System.out.printf("%-14s%20s\n","ī�����(IC)", "�Ͻú� / " + k30_df.format(k30_taxfreesum + k30_taxsum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%21.33s\n" , "[�ż�������Ʈ ����]");
		System.out.printf("%-33s\n" , "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("��ȸ�߻�����Ʈ       %10s     %5s\n", "9350**9995", k30_df.format(newpoint));
		System.out.printf("����(����)����Ʈ    %10s(    %s)\n", k30_df.format(newpoint + point), k30_df.format(point));
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22.33s\n" , "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("������ȣ : %29s\n", "244��6241");
		System.out.printf("�����ð� : %30s\n", k30_sf2.format(k30_date));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("ĳ��:084599 ��00 %25s", "1150\n");
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("%15s/00119861/00164980/31\n", k30_sf3.format(k30_date));
		
		

		
		
	}
	
}
