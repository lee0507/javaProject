package HW2;

public class P6 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		byte k30_b = 1; //������ ���� k30_b�� �����ϰ� 1�� �ʱ�ȭ
		short k30_s = 2; //������ ���� k30_s�� �����ϰ� 2�� �ʱ�ȭ
		char k30_c = 'A'; //������ ���� k30_c�� �����ϰ� A�� �ʱ�ȭ
		
		int k30_finger = 10; //������ ���� k30_finger�� �����ϰ� 10���� �ʱ�ȭ
		long k30_big = 1000000000000L; //������ ���� k30_big�� �����ϰ� 100000000000���� �ʱ�ȭ(���� L�� �ٿ��� ���Ͽ����� �߻����� ����)
		long k30_hex = 0xFFFFFFFFFFFFFFFFL; //������ ���� k30_hex�� �����ϰ� 0xFFFFFFFFFFFFFFFF���� �ʱ�ȭ(���� L�� �ٿ��� ���Ͽ����� �߻����� ����)
		//16������ 0x�� �����ϰ� 0 ~ 9�� A,B,C,D,E,F�� �����ȴ�.
		int k30_octNum = 010;//������ ���� k30_octNum�� �����ϰ� 010���� �ʱ�ȭ
		//8������ 0���� �����ϰ� 0 ~ 7�� �����ȴ�.
		int k30_hexNum = 0x10;//������ ���� k30_hexNum�� �����ϰ� 0x10���� �ʱ�ȭ
		int k30_binNum = 0b10;//������ ���� k30_binNum�� �����ϰ� 0b10���� �ʱ�ȭ
		//2������ 0b�� �����ϰ� 0�� 1�� �����ȴ�
		
		System.out.printf("b=%d\n", k30_b);//k30_b������ ȭ�鿡 ����Ѵ�.
		System.out.printf("s=%d\n", k30_s);//k30_s������ ȭ�鿡 ����Ѵ�.
		System.out.printf("c=%c, %d \n", k30_c, (int)k30_c);//k30_c������ ���������� ����ȯ�� k30_c�� ȭ�鿡 ����Ѵ�.
		System.out.printf("finger=[%5d]\n", k30_finger);//k30_finger������ ȭ�鿡 ����Ѵ�.(%5d�� 5�ڸ��� �Ҵ��ϰ� ������ �����ؼ� ����Ѵ�)
		System.out.printf("finger=[%-5d]\n", k30_finger);//k30_finger������ ȭ�鿡 ����Ѵ�.(%-5d�� 5�ڸ��� �Ҵ��ϰ� ���� �����ؼ� ����Ѵ�)
		System.out.printf("finger=[%05d]\n", k30_finger);//k30_finger������ ȭ�鿡 ����Ѵ�.(%05d�� 5�ڸ��� �Ҵ��ϰ� ������ �����ϰ� �������� 0���� ����Ѵ�)
		System.out.printf("big=%d\n", k30_big);//k30_big������ ȭ�鿡 ����Ѵ�.
		System.out.printf("hex=%#x\n", k30_hex);//k30_hex������ ȭ�鿡 ����Ѵ�.(%x�� 16���� ����� �ǹ��Ѵ�)
		System.out.printf("octNum=%o, %d\n", k30_octNum, k30_octNum);//k30_octNum������ %o�� ����ϰ� k30_octNum������ %d�� ȭ�鿡 ����Ѵ�.(%o�� 8���� ����� �ǹ��Ѵ�)
		System.out.printf("hexNum=%x, %d\n", k30_hexNum, k30_hexNum);//k30_hexNum������ %x�� ����ϰ� k30_hexNum������ %d�� ȭ�鿡 ����Ѵ�.(%x�� 16���� ����� �ǹ��Ѵ�)
		System.out.printf("binNum=%s, %d\n", Integer.toBinaryString(k30_binNum), k30_binNum);//10������ 2������ ����ȯ�� k30_octNum������ %s�� ����ϰ� k30_octNum������ %d�� ȭ�鿡 ����Ѵ�.(%s�� ���ڿ� ����� �ǹ��Ѵ�)
		//16���� toHexString���� 8������ toOctalString���� ��ȯ�Ѵ�.
	}

}
