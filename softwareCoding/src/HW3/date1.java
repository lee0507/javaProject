package HW3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class date1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		Calendar k30_calt = Calendar.getInstance();//Calendar �޼ҵ� ��������
		SimpleDateFormat k30_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");// SimpleDateFormat�̶�� �޼ҵ� �����ͼ� ������ ���� �����ϱ�
		System.out.printf("��������ð�: %s\n", k30_sdt.format(k30_calt.getTime()));// ��������ð��� calt.getTime()���� ����ð��� �������� �տ� sdt.format���� �������� �ð��� ���¸� ������ �� ����ϱ�
		System.out.printf("******************************");
	}

}
