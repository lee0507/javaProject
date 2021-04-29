package HW5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class receipt2 {//Ŭ���� ����
//courier new�� ����ϱ�
   public static void main(String[] args) {//�������κ��� ���α׷�����
      // TODO Auto-generated method stub
      Date k30_d = new Date();//�ý����� ��¥ �� �ð��� ���� �� �ֵ��� java.util ��Ű���� Date Ŭ������ �����Ѵ�.
      //Date �����ڴ� ��ǻ���� ���� ��¥�� �о� Date ��ü�� �����.
      Calendar k30_cal = Calendar.getInstance();//�޷��� ǥ���� abstract Ŭ�����̱� ������ new �����ڸ� ����ؼ� �ν��Ͻ��� ������ �� ����
      //Calendar Ŭ������ static �޼����� getInstance() �޼��带 ���� �ü���� �����Ǿ� �ִ� �ð��븦 �������� �� Calendar ���� ��ü�� ���� �� �ִ�.
      k30_cal.add(Calendar.DAY_OF_MONTH, +14);//Calendar Ŭ������ ���� ������ ��¥�� 14���� ���Ͽ��� ��ȯ/ȯ�� �Ⱓ�� 2�� ���� ��¥�� ǥ���Ѵ�.
      Date k30_date = k30_cal.getTime();//Date ������ ������ 14���� ���� ��¥�� �޾ƿ´�.
      SimpleDateFormat k30_sf1 = new SimpleDateFormat("MM��dd��");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
      //Format������ ("MM��dd��")�� �����Ѵ�.
      SimpleDateFormat k30_sf2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
      //Format������ ("yyyy/MM/dd HH:mm:ss")�� �����Ѵ�.
      DecimalFormat k30_df = new DecimalFormat("###,###,###,###,###");// 3�ڸ� ������ , comma�� ��� ���ؼ� DecimalFormat Ŭ������ �����ϰ�
      //Format������ ("###,###,###,###,###")�� �����Ѵ�.
      String k30_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";//���ڿ��� ���� k30_itemname1�� ���� ǻ��� �����ܿ븶��ũ (�ְ����)���� �ʱ�ȭ�Ѵ�.
      String k30_itemcode1 = "1031615";//���ڿ��� ���� k30_itemcode1�� ���� 1031615�� �ʱ�ȭ�Ѵ�.
      int k30_price1 = 30000;//������ ���� k30_price1�� ���� 30000���� �ʱ�ȭ�Ѵ�.
      int k30_amount1 = 4;//������ ���� k30_amount1�� ���� 4�� �ʱ�ȭ�Ѵ�.
      
      String k30_itemname2 = "�����̵�ĸ���(������)(100ȣ)";//���ڿ��� ���� k30_itemname2�� ���� �����̵�ĸ���(������)(100ȣ)���� �ʱ�ȭ�Ѵ�.
      String k30_itemcode2 = "1008152";//���ڿ��� ���� k30_itemcode2�� ���� 1008152�� �ʱ�ȭ�Ѵ�.
      int k30_price2 = 10000;//������ ���� k30_price2�� ���� 10000���� �ʱ�ȭ�Ѵ�.
      int k30_amount2 = 1;//������ ���� k30_amount2�� ���� 1�� �ʱ�ȭ�Ѵ�.
      
      String k30_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";//���ڿ��� ���� k30_itemname3�� ���� �������� ���׸�����ũ(�˷�̴�Ÿ��)���� �ʱ�ȭ�Ѵ�.
      String k30_itemcode3 = "1020800";//���ڿ��� ���� k30_itemcode3�� ���� 1020800�� �ʱ�ȭ�Ѵ�.
      int k30_price3 = 10000;//������ ���� k30_price3�� ���� 10000���� �ʱ�ȭ�Ѵ�.
      int k30_amount3 = 20;//������ ���� k30_amount3�� ���� 20�� �ʱ�ȭ�Ѵ�.
      
      String[] k30_itemname = {k30_itemname1, k30_itemname2, k30_itemname3};// ���ڿ��� �迭 k30_itemname�� �����ϰ� k30_itemname1 ~ 3������ ���� ������� �����Ѵ�.
      String[] k30_itemcode = {k30_itemcode1, k30_itemcode2, k30_itemcode3};// ���ڿ��� �迭 k30_itemcode�� �����ϰ� k30_itemcode1 ~ 3������ ���� ������� �����Ѵ�.
      int[] k30_price = {k30_price1, k30_price2, k30_price3};// ������ �迭 k30_price�� �����ϰ� k30_itemprice1 ~ 3������ ���� ������� �����Ѵ�.
      int[] k30_amount = {k30_amount1, k30_amount2, k30_amount3};// ������ �迭 k30_amount�� �����ϰ� k30_amount1 ~ 3������ ���� ������� �����Ѵ�.
      int k30_sum = 0;
      
      
      System.out.printf("%22s\n" , "\"���ΰ���, ���̼�\"");//���ΰ���, ���̼ҿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%s\n", "(��)�Ƽ����̼�_�д缭����");//(��)�Ƽ����̼�_�д缭������ �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("��ȭ:031-702-6016\n");//��ȭ��ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");//�����ּҿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("��ǥ:������,��ȣ�� 213-81-52063\n");//��ǥ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (������)\n");//�����ּҿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("=========================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%24s\n", "�Һ����߽ɰ濵(CCM) �������");//�Һ����߽ɰ濵(CCM) ��������� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%26s\n", "ISO 9001 ǰ���濵�ý��� �������");//ISO 9001 ǰ���濵�ý��� ��������� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("=========================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("       ��ȯ/ȯ�� 14��(%s)�̳�,\n", k30_sf1.format(k30_date));//��¥�� �޾ƿ� ���� k30_date�� �Ʊ� ������ SimpleDateFormat���� MM��dd�� ���·� ����Ѵ�.
      System.out.printf("%24s\n", "(����)������, ����ī�� ���� ��");//ȯ�ҽ� �ֿ䳻��� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%21s\n", "���Ը��忡�� ����");//ȯ�ҽ� �ֿ䳻��� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%24s\n", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");//ȯ�ҽ� �ֿ䳻��� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%24s\n", "üũī�� ��� �� �ִ� 7�� �ҿ�");//ȯ�ҽ� �ֿ䳻��� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("=========================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-21s%20s\n", "[POS 1058231]", k30_sf2.format(k30_d));//��¥�� �޾ƿ� ���� k30_d�� �Ʊ� ������ SimpleDateFormat���� yyyy.MM.dd HH:mm:ss ���·� ����Ѵ�.
      System.out.printf("=========================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      
      for (int k30_i = 0; k30_i < k30_itemname.length; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_itemname.length���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
         String k30_temp = k30_itemname[k30_i] + "                   ";//���ڿ��� ���� k30_temp�� �����ϰ� ���� k30_itemname[k30_i]���� ������ �߰��� ������ �ʱ�ȭ�Ѵ�.
           byte[] k30_bb = k30_temp.getBytes();//����Ʈ�� �迭 k30_bb�� �����ϰ� k30_temp�� ����Ʈ���� �迭�� ������� �����Ѵ�.
           int k30_cnt = 0;//�ѱ��� ������ �������ؼ� ������ ���� k30_cnt�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
           
           for(int k30_j = 0; k30_j < 20; k30_j++) {//for�ݺ����� k30_j�� 0���� k30_j�� 20���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
              if(k30_bb[k30_j] < 0)// ���࿡ k30_bb[k30_j]�� 0���� �۴ٸ� k30_cnt�� ���� 1��ŭ ������Ų��.
                 k30_cnt++;//�ѱ��� ����Ʈ�� �ٲپ������� ������ ǥ�õǰ� �ѱ��� 2����Ʈ�̱⶧���� �ѱ� �ϳ��� k30_cnt�� 2���� �����Ѵ�. 
           }
           if (k30_cnt % 2 == 0) {//���� k30_cnt�� ¦���̸�(�ѱ��� �߸��� �ʰ� ���������� �� ��µ� �����)
              k30_temp = new String(k30_bb, 0, 20) + " ";//����Ʈ�� 21��°���� �ڸ��� string���� ��ȯ�Ͽ� k30_temp�� �����Ѵ�.
           } else if (k30_bb[19] < 0){//���� ����Ʈ�� �߶��� �� 20��°�� �κ��� �ѱ��̶�� (�ѱ��� ������ �߷��� �����)
              k30_temp = new String(k30_bb, 0, 19) + "  ";//����Ʈ�� 20��°���� �ڸ��� string���� ��ȯ�ϰ� �� �߸� �κп� ���ؼ� ������ �ϳ� �� �߰��ؼ� k30_temp�� �����Ѵ�.
           }
           
         System.out.printf("%s%7s%3s%10s\n", k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_price[k30_i] * k30_amount[k30_i]));
         //���� k30_temp, k30_df.format(k30_price[k30_i]), k30_amount[k30_i], k30_df.format(k30_price[k30_i] * k30_amount[k30_i]�� ȭ�鿡 ����Ѵ�.
         System.out.printf("[%s]\n", k30_itemcode[k30_i]);// ���� k30_itemcode[k30_i]�� ȭ�鿡 ����Ѵ�.
         k30_sum = k30_sum + k30_price[k30_i] * k30_amount[k30_i];// ���� k30_sum�� k30_price[k30_i]�� k30_amount[k30_i]�� ���� ���� ���ؼ� �߰��Ѵ�.
      }
      double k30_taxrate = 0.1;// �Ǽ��� ���� k30_taxrate�� �����ϰ� ���� 0.1�� �ʱ�ȭ�Ѵ�.
      int k30_beforetax = (int)(k30_sum / (1 + k30_taxrate));//������ ���� k30_beforetax�� �����ϰ� ���������� ����ȯ�� (k30_sum / (1 + k30_taxrate) ���� �����Ѵ�.
      int k30_tax = k30_sum - k30_beforetax;//������ ���� k30_tax�� �����ϰ� k30_sum - k30_beforetax ���� �����Ѵ�.
      System.out.printf("%22s %14s\n", "�����հ�", k30_df.format(k30_beforetax));// 3�ڸ����� ,�� ��� format���� k30_beforetax�� ȭ�鿡 ����Ѵ�.
      System.out.printf("%23s %14s\n", "�ΰ���",  k30_df.format(k30_tax));// 3�ڸ����� ,�� ��� format���� k30_tax�� ȭ�鿡 ����Ѵ�.
      System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-20s%17s\n", "�Ǹ��հ�", k30_df.format(k30_sum));// 3�ڸ����� ,�� ��� format���� k30_sum�� ȭ�鿡 ����Ѵ�.
      System.out.printf("=========================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-20s%17s\n", "�ſ�ī��", k30_df.format(k30_sum));// 3�ڸ����� ,�� ��� format���� k30_sum�� ȭ�鿡 ����Ѵ�.
      System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-20s%17s\n", "�츮ī��", "538720**********");//�츮ī���, ī���ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-18s%15s\n", "���ι�ȣ 77982843(0)", "���αݾ� " + k30_df.format(k30_sum));// 3�ڸ����� ,�� ��� format���� k30_sum�� ȭ�鿡 ����Ѵ�.
      System.out.printf("=========================================\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%24s %5s\n", k30_sf2.format(k30_d)," �д缭����");//��¥�� �޾ƿ� ���� k30_d�� �Ʊ� ������ SimpleDateFormat���� yyyy.MM.dd HH:mm:ss ���·� ����Ѵ�.
      System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");//��ǰ �� ��Ÿ ���ǹ�ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");//����� ���� ���ǹ�ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%32s\n", "|||||||||||||||||||||||");//���ڵ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%32s\n", "|||||||||||||||||||||||");
      System.out.printf("%32s\n", "|||||||||||||||||||||||");
      System.out.printf("%29s\n", "2112820610158231");//���ڵ��ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("-----------------------------------------\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("�� ���̼� ����� �� �Ǵ�\n");//���̼� �������� ȭ�鿡 ����Ѵ�.
      System.out.printf("   Ȩ�������� �����ϼż� ȸ������ ��\n");
      System.out.printf("   �پ��� ������ ����������! ��\n");

   }

}