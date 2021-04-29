package HW6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P3 {
	static String[] k30_name = {"����Ȩ SAFE365 �ڵ����", "(G) LH��������ȭ�� 10ȣ", "��������E", "���� ���Ϸ� �� �ѷ�", "��� �Ŷ�� 120g*5",
			"(��)����������", "���ѱ� ������� 155g", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰�����(g)", 
			"(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK22", "DZ�ִϾ�縻3��C_WH22", "�����̾��������ʹ�", "����ũ ����̿���500g",
			"���� ���ִ� ����GT ������", "���������÷�10��", "�Ŷ�����(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ��Ʈ", "Ǫ���� �̼����� ����",
			"���Ϸν���������500g", "CJ ����Ĩ 20G", "����ũ ����̿���500g", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư��",
			"���׽����� �ѹ��� ������¡��", "���̼��� ��ȭǳ ������","�絵���� ���� �������� 1.5kg", "���� ���� ����� �η�ġ�� 500g", "���� �ӽ�ũ ��� 1.5kg"};
	// ���ڿ��� �迭 k30_name�� �����ϰ� ������ ��ǰ�� �̸��� �����Ѵ�.
	static int[] k30_price = {7500, 6900, 5980, 3300000, 3380, 6610, 2750, 10800, 4980, 2480, 
			7920, 4980, 4980, 7130, 3980, 4480, 4980, 3210, 6950, 2980,
			1990, 1980, 3980, 4480, 3480, 17400, 10900, 12800, 9990, 13900};
	// ������ �迭 k30_price�� �����ϰ� ������ ��ǰ�� ������ �����Ѵ�.
	static int[] k30_amount = {19, 20, 1, 1, 1, 1, 1, 1, 1, 1, 
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	// ������ �迭 k30_amount�� �����ϰ� ������ ��ǰ�� ������ �����Ѵ�.
	static boolean[] k30_taxfree = {false, false, false, false, false, true, false, true, true, false, 
			false, false, false, false, false, true, false, false, false, false,
			false, false, false, false, false, true, false, true, false, true};
	
	static int k30_count = 0;//������ ���� k30_count�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k30_itemCount = 30;
		TitlePrint();
		TimeStamp();
		HeaderPrint();
		
		for(int k30_i = 0; k30_i < k30_itemCount; k30_i++) {
			ItemPrint(k30_i);
		}
		
		TotalPrint();
	}
	
	public static void TitlePrint() {
		System.out.printf("%34s\n", "�̸�Ʈ ������ (031)888-1234");//�̸�Ʈ ������ ��ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%9s%20s\n",  "emart", "206-86-50913 ����");//�̸�Ʈ ������ ����ڸ�� ����ڹ�ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%28s\n", "���� ������ ������� 552");//�̸�Ʈ ������ �ּҿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");//��ȯȯ�� ������ �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
	}
	
	public static void TimeStamp() {
		Date k30_d = new Date();//�ý����� ��¥ �� �ð��� ���� �� �ֵ��� java.util ��Ű���� Date Ŭ������ �����Ѵ�.
	    //Date �����ڴ� ��ǻ���� ���� ��¥�� �о� Date ��ü�� �����.
		SimpleDateFormat k30_sf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
	    //Format������ ("yyyy/MM/dd HH:mm")�� �����Ѵ�.
		System.out.printf("[����]%s  %17s\n", k30_sf1.format(k30_d), "POS:0011-9861");//��¥�� �޾ƿ� ���� k30_d�� �Ʊ� ������ SimpleDateFormat���� yyyy.MM.dd HH:mm ���·� ����Ѵ�.
		System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.

	}
	
	public static void HeaderPrint() {
		System.out.printf(" %-16s  %3s %2s %6s\n", "��ǰ��", "�� ��", "����", "�� ��");//��ǰ��, �ܰ�, ����, �ݾ��� ȭ��� �ٹٲ��� ����Ѵ�.
		System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
	}
	
	public static void ItemPrint(int k30_i) {
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###");// 3�ڸ� ������ , comma�� ��� ���ؼ� DecimalFormat Ŭ������ �����ϰ�
	      //Format������ (###,###,###,###")�� �����Ѵ�.

		String k30_temp = k30_name[k30_i] + "                   ";//���ڿ��� ���� k30_temp�� �����ϰ� ���� k30_name[k30_i]���� ������ �߰��� ������ �ʱ�ȭ�Ѵ�.
	    byte[] k30_bb = k30_temp.getBytes();//����Ʈ�� �迭 k30_bb�� �����ϰ� k30_temp�� ����Ʈ���� �迭�� ������� �����Ѵ�.
	    int k30_cnt = 0;//�ѱ��� ������ �������ؼ� ������ ���� k30_cnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	        
	    for(int k30_j = 0; k30_j < 17; k30_j++) {//for�ݺ����� k30_j�� 0���� k30_j�� 17���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
	    	if(k30_bb[k30_j] < 0)// ���࿡ k30_bb[k30_j]�� 0���� �۴ٸ� k30_cnt�� ���� 1��ŭ ������Ų��.
	        		k30_cnt++;//�ѱ��� ����Ʈ�� �ٲپ������� ������ ǥ�õǰ� �ѱ��� 2����Ʈ�̱⶧���� �ѱ� �ϳ��� k30_cnt�� 2���� �����Ѵ�. 
	    }
	    if (k30_cnt % 2 == 0) {//���� k30_cnt�� ¦���̸�(�ѱ��� �߸��� �ʰ� ���������� �� ��µ� �����)
	    	k30_temp = new String(k30_bb, 0, 17) + " ";//����Ʈ�� 18��°���� �ڸ��� string���� ��ȯ�Ͽ� k30_temp�� �����Ѵ�.
	    } else if (k30_bb[17] < 0) {//���� ����Ʈ�� �߶��� �� 18��°�� �κ��� �ѱ��̶�� (�ѱ��� ������ �߷��� �����)
	        k30_temp = new String(k30_bb, 0, 16) + "  ";//����Ʈ�� 17��°���� �ڸ��� string���� ��ȯ�ϰ� �� �߸� �κп� ���ؼ� ������ �ϳ� �� �߰��ؼ� k30_temp�� �����Ѵ�.
	    }

		if (k30_taxfree[k30_i] == true) {//���࿡ k30_taxfree[k30_i]�� true���(�鼼�� �Ǵ� ��ǰ�̶��)
			System.out.printf("*%s%9s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]));
			//���� k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]�� �ٹٲ��� ȭ�鿡 ����Ѵ�.

		} else {//���࿡ ���� ���� k30_taxfree[k30_i]�� false���(�鼼�� ���� �ʴ� ��ǰ�̶��)
			System.out.printf(" %s%9s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]));
			//���� k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_amount[k30_i] * k30_price[k30_i]�� �ٹٲ��� ȭ�鿡 ����Ѵ�.

		}
		
		if((k30_i + 1) % 5 == 0) {//���࿡ k30_i + 1�� 5�� ���������� �������� 0�̶��(5��° ����)
			System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
			}
		}
	
	
	public static void TotalPrint() {
		Calendar k30_cal = Calendar.getInstance();//�޷��� ǥ���� abstract Ŭ�����̱� ������ new �����ڸ� ����ؼ� �ν��Ͻ��� ������ �� ����
	      //Calendar Ŭ������ static �޼����� getInstance() �޼��带 ���� �ü���� �����Ǿ� �ִ� �ð��븦 �������� �� Calendar ���� ��ü�� ���� �� �ִ�.
		k30_cal.add(Calendar.HOUR_OF_DAY, -1);//Calendar Ŭ������ ���� ������ �ð��� 1�ð��� ���� ���� �ð��� ǥ���Ѵ�.
		Date k30_date = k30_cal.getTime();//Date ������ ������ 14���� ���� ��¥�� �޾ƿ´�.
		SimpleDateFormat k30_sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
	      //Format������ ("yyyy/MM/dd HH:mm:ss")�� �����Ѵ�.
		SimpleDateFormat k30_sf3 = new SimpleDateFormat("yyyyMMdd");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
	      //Format������ ("yyyyMMdd")�� �����Ѵ�.
		DecimalFormat k30_df = new DecimalFormat("###,###,###,###");// 3�ڸ� ������ , comma�� ��� ���ؼ� DecimalFormat Ŭ������ �����ϰ�
	      //Format������ (###,###,###,###")�� �����Ѵ�.
		int k30_count = 0;//������ ���� k30_count�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_taxfreesum = 0;//������ ���� k30_taxfreesum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		int k30_taxsum = 0;//������ ���� k30_taxsum�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		double k30_taxrate = 0.1;// �Ǽ��� ���� k30_taxrate�� �����ϰ� ���� 0.1�� �ʱ�ȭ�Ѵ�.
		int k30_beforetax = (int)(k30_taxsum / (1 + k30_taxrate));//������ ���� k30_beforetax�� �����ϰ� ���������� ����ȯ�� (k30_sum / (1 + k30_taxrate) ���� �����Ѵ�.
		int k30_tax = k30_taxsum - k30_beforetax;//������ ���� k30_tax�� �����ϰ� k30_taxsum - k30_beforetax ���� �����Ѵ�.
		int k30_newpoint = (k30_taxfreesum + k30_taxsum) / 1000;//������ ���� k30_newpoint�� �����ϰ� k30_taxfreesum�� k30_taxsum�� ���� ���� �����Ѵ�.
		int k30_point = 5743;//������ ���� k30_point�� �����ϰ� ���� 5743���� �ʱ�ȭ�Ѵ�.
		
	
		for (int k30_i = 0; k30_i < k30_price.length; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_itemname.length���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.

			if (k30_taxfree[k30_i] == true) {//���࿡ k30_taxfree[k30_i]�� true���(�鼼�� �Ǵ� ��ǰ�̶��)
				k30_taxfreesum += (k30_amount[k30_i] * k30_price[k30_i]);// ����_taxfreesum�� k30_amount[k30_i]�� k30_price[k30_i] ���� ���� ���ؼ� �����Ѵ�.
			} else {//���࿡ ���� ���� k30_taxfree[k30_i]�� false���(�鼼�� ���� �ʴ� ��ǰ�̶��)
				k30_taxsum += (k30_amount[k30_i] * k30_price[k30_i]);// ����_taxsum�� k30_amount[k30_i]�� k30_price[k30_i] ���� ���� ���ؼ� �����Ѵ�.
			}
			k30_count++;
		}

			
		System.out.println();//�ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%20s%16d\n","��ǰ�����", k30_count);//���� k30_count�� ȭ�鿡 ����Ѵ�. 
		System.out.printf("%21s%16s\n","(*)�鼼  ��ǰ",k30_df.format(k30_taxfreesum));// 3�ڸ����� ,�� ��� format���� k30_taxfreesum�� ȭ�鿡 ����Ѵ�.
		System.out.printf("%21s%16s\n","����  ��ǰ", k30_df.format(k30_beforetax));// 3�ڸ����� ,�� ��� format���� k30_beforetax�� ȭ�鿡 ����Ѵ�.
		System.out.printf("%22s%16s\n","��  ��  ��", k30_df.format(k30_tax));// 3�ڸ����� ,�� ��� format���� k30_tax�� ȭ�鿡 ����Ѵ�.
		System.out.printf("%23s%16s\n","��      ��", k30_df.format(k30_taxfreesum + k30_taxsum));// 3�ڸ����� ,�� ��� format���� k30_taxfreesum�� k30_taxsum�� ���� ���� ȭ�鿡 ����Ѵ�.
		System.out.printf("�� �� �� �� �� ��%24s\n", k30_df.format(k30_taxfreesum + k30_taxsum));// 3�ڸ����� ,�� ��� format���� k30_taxfreesum�� k30_taxsum�� ���� ���� ȭ�鿡 ����Ѵ�.
		System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%-17s %17s", "0012 KEB �ϳ�", "541707**0484/35860658\n");//ī�� ��ȣ�� ī���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%-14s%20s\n","ī�����(IC)", "�Ͻú� / " + k30_df.format(k30_taxfreesum + k30_taxsum));// 3�ڸ����� ,�� ��� format���� k30_taxfreesum�� k30_taxsum�� ���� ���� ȭ�鿡 ����Ѵ�.
		System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%21.33s\n" , "[�ż�������Ʈ ����]");//�ż�������Ʈ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%-33s\n" , "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");//����Ʈ��Ȳ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("��ȸ�߻�����Ʈ       %10s     %5s\n", "9350**9995", k30_df.format(k30_newpoint));// 3�ڸ����� ,�� ��� format���� k30_newpoint�� ���� ���� ȭ�鿡 ����Ѵ�.
		System.out.printf("����(����)����Ʈ    %10s(    %s)\n", k30_df.format(k30_newpoint + k30_point), k30_df.format(k30_point));
		// 3�ڸ����� ,�� ��� format���� k30_newpoint�� k30_point�� ���� ���� k30_point�� ȭ�鿡 ����Ѵ�.
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");//�ż�������Ʈ�� ��ȿ�Ⱓ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("%22.33s\n" , "���űݾױ��� ���������ð� �ڵ��ο�");//���������ð������� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("������ȣ : %29s\n", "244��6241");//������ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("�����ð� : %30s\n", k30_sf2.format(k30_date));//��¥�� �޾ƿ� ���� k30_d�� �Ʊ� ������ SimpleDateFormat���� yyyy-MM-dd HH:mm:ss ���·� ����Ѵ�.
		System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("ĳ��:084599 ��00 %25s", "1150\n");//ĳ�������� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");//���ڵ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("    ||||||||||||||||||||||||||||||||||\n");
		System.out.printf("%15s/00119861/00164980/31\n", k30_sf3.format(k30_date));//��¥�� �޾ƿ� ���� k30_d�� �Ʊ� ������ SimpleDateFormat���� yyyyMMdd ���·� ����Ѵ�.
		
	}

}
