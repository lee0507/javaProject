package HW2;

public class P12 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		int k30_i = 91234567;// ������ ���� k30_i�� �����ϰ� 91234567������ �ʱ�ȭ
		float k30_f = (float)k30_i;// �Ǽ��� ���� k30_f�� �����ϰ� �Ǽ������� ����ȯ�� k30_i������ �ʱ�ȭ
		int k30_i2 = (int)k30_f;// ������ ���� k30_i2�� �����ϰ� ���������� ����ȯ�� k30_f�� �ʱ�ȭ
		
		double k30_d = (double)k30_i;// �Ǽ��� ���� k30_d�� �����ϰ� �Ǽ������� ����ȯ�� k30_i������ �ʱ�ȭ
		int k30_i3 = (int)k30_d;//������ ���� k30_i3�� �����ϰ� ���������� ����ȯ�� k30_d������ �ʱ�ȭ
		
		float k30_f2 = 1.666f;//�Ǽ��� ���� k30_f2�� �����ϰ� 1.666������ �ʱ�ȭ
		int k30_i4 = (int)k30_f2;//������ ���� k30_i4�� �����ϰ� ���������� ����ȯ�� k30_f2������ �ʱ�ȭ
		
		System.out.printf("i=%d\n", k30_i);//k30_i������ ȭ�鿡 ����Ѵ�.
		System.out.printf("f=%f i2=%d\n", k30_f, k30_i2);//k30_f������ k30_i2�� ȭ�鿡 ����Ѵ�.
		System.out.printf("d=%f i3=%d\n", k30_d, k30_i3);//k30_d������ k30_i3�� ȭ�鿡 ����Ѵ�.
		System.out.printf("(int)%f=%d\n", k30_f2, k30_i4);//k30_f2������ k30_i4�� ȭ�鿡 ����Ѵ�.

	}

}