package HW5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class receipt1 {// Ŭ���� ����

   public static void main(String[] args) {//�������κ��� ���α׷�����
      int k30_iPrice = 33000;//������ ���� k30_iPrice�� �����ϰ� ���� 33000���� �ʱ�ȭ�Ѵ�.
      Date k30_d = new Date();//�ý����� ��¥ �� �ð��� ���� �� �ֵ��� java.util ��Ű���� Date Ŭ������ �����Ѵ�.
      //Date �����ڴ� ��ǻ���� ���� ��¥�� �о� Date ��ü�� �����.
      int k30_netPrice = (int)((k30_iPrice / 11.) * 10.);//���� �ݾ��� ����ϱ� ���� ������ ���� k30_netPrice�� �����ϰ�
      //���������� ����ȯ�� ((k30_iPrice / 11.) * 10.)�� ������ �����Ѵ�.
      SimpleDateFormat k30_sf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
      //Format������ ("yyyy/MM/dd HH:mm:ss")�� �����Ѵ�.
      DecimalFormat k30_df = new DecimalFormat("###,###,###,###,###");// 3�ڸ� ������ , comma�� ��� ���ؼ� DecimalFormat Ŭ������ �����ϰ�
      //Format������ ("###,###,###,###,###")�� �����Ѵ�.
      System.out.printf("�ſ����\n");//�ſ���ο� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-16s %17s\n" , "�ܸ��� : 2N68665898", "��ǥ��ȣ : 041218");//�ܸ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-15s\n", "������ : �Ѿ��ġ�");//�������� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-15s\n", "��  �� : ��� ������ �д籸 Ȳ�����351���� 10 , 1��");//�ּҿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-15s\n", "��ǥ�� : ��â��");//��ǥ�ڿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-18s%20s\n" , "����� : 752-53-00558", "TEL : 7055695");//����ڿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-22s%14s ��\n", "��  ��", k30_df.format(k30_netPrice));//���� k30_netPrice�� �Ʊ� ������ DecimalFormat���� 3�ڸ������� ,�� ����Ѵ�.
      System.out.printf("%-23s%12s ��\n", "�ΰ���", k30_df.format(k30_iPrice - k30_netPrice));//���� (k30_iPrice - k30_netPrice)�� �Ʊ� ������ DecimalFormat���� 3�ڸ������� ,�� ����Ѵ�.
      System.out.printf("%-22s%14s ��\n", "��  ��", k30_df.format(k30_iPrice));//���� k30_netPrice�� �Ʊ� ������ DecimalFormat���� 3�ڸ������� ,�� ����Ѵ�.
      System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("�츮ī��\n");//�츮ī��� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%-25s%5s\n", "ī���ȣ : 5387-20**-****-4613(S)", "�Ͻú�");//ī���ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("�ŷ��Ͻ� : %s\n", k30_sf.format(k30_d));//��¥�� �޾ƿ� ���� k30_d�� �Ʊ� ������ SimpleDateFormat���� yyyy/MM/dd HH:mm:ss ���·� ����Ѵ�.
      System.out.printf("%s\n" , "���ι�ȣ : 70404427");//���ι�ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%s\n" , "�ŷ���ȣ : 357734873739");//�ŷ���ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("���� : ��ī���    ���� : 702068568\n");//ī���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("�˸� : EDC����ǥ\n");//�˸��� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("���� : TEL)1544-4700\n");//���ǹ�ȣ�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("- - - - - - - - - - - - - - - - - - - - -\n");//������ �� �ִ� ���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%14s%s%14s\n" ," ", "* �����մϴ� *", " ");//�����մϴٿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      System.out.printf("%39s\n" , "ǥ��V2.08_20200212");//ǥ��V2.08_20200212�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
      
   }

}