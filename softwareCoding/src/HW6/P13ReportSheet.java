package HW6;

public class P13ReportSheet {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		
		int k30_iPerson = 10;//������ ���� iPerson�� �����ϰ� ���� 10���� �ʱ�ȭ�Ѵ�.
		
		P13InputData k30_inData = new P13InputData(k30_iPerson);//P13InputData Ŭ������ �Ķ���͸� inPerson���� �ش��� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� k30_iPerson���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			String k30_name = String.format("ȫ��%02d", k30_i);//���� k30_name�� k30_i�� string���� ����ȯ�� ���� ȫ��%02d�� ������ �����Ѵ�. 
			int k30_kor = (int)(Math.random() * 100);//���� k30_kor�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_eng = (int)(Math.random() * 100);//���� k30_eng�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_mat = (int)(Math.random() * 100);//���� k30_mat�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			k30_inData.SetData(k30_i, k30_name, k30_kor, k30_eng, k30_mat);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� P13InputDataŬ������ SetData�Լ��� �����Ѵ�.
		}

		
		for(int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iPerson���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.

			System.out.printf("��ȣ:%d, �̸�:%s, ����:%2d, ����:%2d, ����:%2d, ����:%3d, ���:%f\n",//�������� ������� ȭ�鿡 ����Ѵ�.
					k30_i, k30_inData.k30_name[k30_i], k30_inData.k30_kor[k30_i], k30_inData.k30_eng[k30_i], 
					k30_inData.k30_mat[k30_i], k30_inData.k30_sum[k30_i], k30_inData.k30_avg[k30_i]);
		}
	}

}
