package HW4;

public class if1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_score = 100;//������ ���� k30_score�� �����ϰ� ���� 100���� �ʱ�ȭ�Ѵ�.
		
		if (k30_score > 60) {//���� k30_score�� 60���� ũ�ٸ�
			System.out.println("�հ��Դϴ�!");//�հ��Դϴٸ� ȭ�鿡 ����Ѵ�.
		}
		
		if (k30_score < 60)//���� k30_score�� 60���� ũ�ٸ�
			System.out.println("�հ��Դϴ�");//�հ��Դϴٸ� ȭ�鿡 ����Ѵ�.
		
		k30_score = 40;//k30_score�� ���� 40�� �����Ѵ�.
		if (k30_score > 60) {//���� k30_score�� 60���� ũ�ٸ�
			System.out.println("�հ��Դϴ�");//�հ��Դϴٸ� ȭ�鿡 ����Ѵ�.
		} else {//���� if�� ������ �������� �ʴ´ٸ�
			System.out.println("���հ��Դϴ�");//���հ��Դϴٸ� ȭ�鿡 ����Ѵ�.
		}
		
		int k30_num = 1;// ������ ���� k30_num�� �����ϰ� ���� 1�� �ʱ�ȭ�Ѵ�.
		if (k30_num > 0) {//���� k30_num�� 0���� ũ�ٸ�
			System.out.println("����Դϴ�!");//����Դϴٸ� ȭ�鿡 ����Ѵ�.
		} else if (k30_num < 0) {//���� k30_num�� 0���� �۴ٸ�
			System.out.println("�����Դϴ�!");//�����Դϴٸ� ȭ�鿡 ����Ѵ�.
		} else {//���� ���� ���ǵ��� �������� �ʴ´ٸ�
			System.out.println("0�Դϴ�!");//0�Դϴٸ� ȭ�鿡 ����Ѵ�.
		}
		
		k30_score = 70;// ������ ���� k30_score�� ���� 70���� �����Ѵ�.
		if (k30_score >= 90) {//���� k30_score�� 90�� ���ų� ũ�ٸ�
			System.out.println("A���");//A����� ȭ�鿡 ����Ѵ�.
		} else if(k30_score >= 80 && k30_score < 90) {//���� k30_score�� 80�� ���ų� ũ��, 90���� ������
			System.out.println("B���");//B����� ȭ�鿡 ����Ѵ�.
		} else if(k30_score >= 70 && k30_score < 80) {//���� k30_score�� 70�� ���ų� ũ��, 80���� ������
			System.out.println("C���");//C����� ȭ�鿡 ����Ѵ�.
		} else {//���� ���� ���ǵ��� �������� �ʴ´ٸ�
			System.out.println("F���");//F����� ȭ�鿡 ����Ѵ�.
		}
	}

}
