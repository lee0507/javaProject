package HW6;

public class P7methodoverloading {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		Calc7 k30_cc = new Calc7();//Calc7 Ŭ������ �޾Ƽ� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		String k30_name = "������";//���ڿ��� ���� k30_name�� �����ϰ� ���� "������"���� �ʱ��Ѵ�.
		int k30_kor = 100;//������ ���� k30_kor�� �����ϰ� ���� 100���� �ʱ�ȭ�Ѵ�.
		int k30_eng = 100;//������ ���� k30_eng�� �����ϰ� ���� 100���� �ʱ�ȭ�Ѵ�.
		int k30_mat = 100;//������ ���� k30_mat�� �����ϰ� ���� 100���� �ʱ�ȭ�Ѵ�.
		int k30_sci = 100;//������ ���� k30_sci�� �����ϰ� ���� 100���� �ʱ�ȭ�Ѵ�.
		int k30_soc = 100;//������ ���� k30_soc�� �����ϰ� ���� 100���� �ʱ�ȭ�Ѵ�.
		
		System.out.printf("3�� ����ǥ\n");
		System.out.printf("================================================\n");
		System.out.printf("%2s  %2s  %2s  %2s  %2s  %2s\n", "�̸�", "����", "����", "����", "����", "���");
		System.out.printf("================================================\n");
		System.out.printf("%3s %3d   %3d   %3d   %3d  %3d\n", k30_name, k30_kor, k30_eng, k30_mat, 
				k30_cc.k30_sum(k30_kor, k30_eng, k30_mat), k30_cc.k30_avg(k30_kor, k30_eng, k30_mat));
		//���� k30_name, k30_kor, k30_eng, k30_mat, k30_cc.k30_sum, k30_cc.k30_avg(k30_kor, k30_eng, k30_mat));
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Calc7Ŭ������ sum�޼ҵ�� avg�޼ҵ��� �Ķ���͸� kor, eng, mat�� �ְ� ������ ���� ȭ�鿡 ����Ѵ�.
		System.out.println();
		System.out.printf("4�� ����ǥ\n");
		System.out.printf("================================================\n");
		System.out.printf("%2s  %2s  %2s  %2s  %2s  %2s  %2s\n", "�̸�", "����", "����", "����", "����", "����", "���");
		System.out.printf("================================================\n");
		System.out.printf("%3s %3d   %3d   %3d   %3d  %3d   %3d\n", k30_name, k30_kor, k30_eng, k30_mat, k30_sci,  
				k30_cc.k30_sum(k30_kor, k30_eng, k30_mat, k30_sci), k30_cc.k30_avg(k30_kor, k30_eng, k30_mat, k30_sci));
		//���� k30_name, k30_kor, k30_eng, k30_mat, k30_sci, k30_cc.k30_sum, k30_cc.k30_avg(k30_kor, k30_eng, k30_mat));
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Calc7Ŭ������ sum�޼ҵ�� avg�޼ҵ��� �Ķ���͸� kor, eng, mat, sci�� �ְ� ������ ���� ȭ�鿡 ����Ѵ�.
		System.out.println();
		System.out.printf("5�� ����ǥ\n");
		System.out.printf("================================================\n");
		System.out.printf("%2s  %2s  %2s  %2s  %2s  %2s  %2s  %2s\n", "�̸�", "����", "����", "����", "����", "��ȸ", "����", "���");
		System.out.printf("================================================\n");
		System.out.printf("%3s %3d   %3d   %3d   %3d  %3d   %3d   %3d\n", k30_name, k30_kor, k30_eng, k30_mat, k30_sci, k30_soc,  
				k30_cc.k30_sum(k30_kor, k30_eng, k30_mat, k30_sci, k30_soc), k30_cc.k30_avg(k30_kor, k30_eng, k30_mat, k30_sci, k30_soc));
		//���� k30_name, k30_kor, k30_eng, k30_mat, k30_sci, k30_soc, k30_cc.k30_sum, k30_cc.k30_avg(k30_kor, k30_eng, k30_mat));
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Calc7Ŭ������ sum�޼ҵ�� avg�޼ҵ��� �Ķ���͸� kor, eng, mat, sci, soc�� �ְ� ������ ���� ȭ�鿡 ����Ѵ�.
	}

}
