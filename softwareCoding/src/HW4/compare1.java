package HW4;

public class compare1 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_iI;//������ ���� k30_iI�� �����Ѵ�.
		double k30_iD;//�Ǽ��� ���� k30_iD�� �����Ѵ�.
		
		k30_iI = 10 / 3;//������ ���� k30_iI�� 10 / 3�� ���� �����Ѵ�. (/�� ���� ���� ���� �ǹ��Ѵ�.) 
		k30_iD = 10 / 3.0;//�Ǽ��� ���� k30_iD�� 10 / 3�� ���� �����Ѵ�. (/�� ���� ���� ���� �ǹ��Ѵ�.) 
		
		if (k30_iI == k30_iD) {//���� k30_iI�� k30_iD�� ���ٸ�
			System.out.printf("equal\n");//equal�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		} else {//k30_iI�� k30_iD�� ���� �ʴٸ�
			System.out.printf("Not equal[%f][%f]\n", (double)k30_iI, k30_iD);
		}//Not equal�� �Ǽ������� ����ȯ�� k30_iI�� �Ǽ��� ���� k30_iD�� ����Ѵ�.
		
		if (k30_iD == 3.333333) {//���� k30_iD�� 3.333333�� ���ٸ�
			System.out.printf("equal\n");//equal�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		} else {//���� k30_iD�� 3.333333�� ���� �ʴٸ�
			System.out.printf("Not equal[3.33333][%f]\n", k30_iD);
		}//Not equal�� �Ǽ��� ���� k30_iD�� ����Ѵ�.
		
		k30_iD = (int)k30_iD;//�Ǽ������� k30_iD�� ���������� ����ȯ�� k30_iD�� ���� �����Ѵ�.
		if (k30_iI == k30_iD)  System.out.printf("equal\n");//���� k30_iI�� k30_iD�� ���ٸ� equal�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		else System.out.printf("Not equal[%f][%f]\n", (double)k30_iI, k30_iD);
		//k30_iI�� k30_iD�� ���� �ʴٸ� Not equal�� �Ǽ������� ����ȯ�� k30_iI�� �Ǽ��� ���� k30_iD�� ����Ѵ�.
		
		System.out.printf("int�� �μ�[%d][%f]\n", k30_iI, k30_iD);//������ ���� k30_iI�� �Ǽ������� k30_iD�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("double�� �μ�[%f][%f]\n", (double)k30_iI, k30_iD);//�Ǽ������� ����ȯ�� k30_iI�� �Ǽ������� k30_iD�� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		
		char k30_a = 'c';//���� ���� k30_a�� �����ϰ� c��� ���� �����Ѵ�.
		if (k30_a == 'b') System.out.printf("a�� b�̴�.\n");// ���� k30_a�� b��� a�� b�̴ٿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		if (k30_a == 'c') System.out.printf("a�� c�̴�.\n");// ���� k30_a�� c��� a�� c�̴ٿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		if (k30_a == 'd') System.out.printf("a�� d�̴�.\n");// ���� k30_a�� d��� a�� d�̴ٿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		
		String k30_aa = "abcd";//���ڿ��� ���� k30_aa�� �����ϰ� abcd��� ���� �����Ѵ�.
		if(k30_aa.equals("abcd")) System.out.printf("aa�� abcd�̴�\n");// ���� k30_aa�� abcd��� aa�� abcd�̴ٿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		else System.out.printf("aa�� abcd�� �ƴϴ�\n");// ���� k30_aa�� abcd�� �ƴ϶�� aa�� abcd�� �ƴϴٿ� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		
		boolean k30_bb = true;//�Ҹ����� ���� k30_bb�� �����ϰ� true�� ���� �����Ѵ�.
		if(!!k30_bb) System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		//���� k30_bb�� true��� bb�� �ƴϰ� �ƴϸ� ���̴ٿ� �ٹٲ��� ����Ѵ�.(!�� ������ �ǹ��ϰ� !!�� ������ �����̶� �ٽ� ������ �ȴ�)
		else System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�.\n");
		//���� k30_bb�� false��� bb�� �ƴϰ� �ƴϸ� �����̴ٿ� �ٹٲ��� ����Ѵ�.

	}

}
