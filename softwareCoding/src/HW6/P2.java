package HW6;

public class P2 {//Ŭ���� ����
	
	static int k30_iStatic; //������ �������� k30_iStatic�� �����Ѵ�.
	
	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_iMain;//������ ���� k30_iMain�� �����Ѵ�.
		
		k30_iMain = 1;//���� k30_iMain�� ������ 1�� �����Ѵ�.
		k30_iStatic = 1;//���������� k30_iStatic�� ������ 1�� �����Ѵ�.
		
		System.out.printf("**************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� ->iStatic=[%d]\n", k30_iStatic);//������ ó�� ������ ���� 1�� ȭ�鿡 ��µȴ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� ->iMain=[%d]\n", k30_iMain);//������ ó�� ������ ���� 1�� ȭ�鿡 ��µȴ�.
		System.out.printf("**************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		
		add(k30_iMain);//�Լ� add�� k30_iMain�Ķ���ͷ� �ҷ��´�.
		
		System.out.printf("**************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� ->iStatic=[%d]\n", k30_iStatic);//���������� Ŭ���� ��ü�� ���Ǳ� ������ ������ ���� ���� 2�� �״�� ��µȴ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� ->iMain=[%d]\n", k30_iMain);//���������� mainŬ���� ������ ���Ǳ� ������ ������ ���� 1�� �״�� ��µȴ�.
		System.out.printf("**************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		
		k30_iMain = add2(k30_iMain);//�޼ҵ� add2�� k30_iMain�Ķ���ͷ� �ҷ��ͼ� �ٽ� k30_iMain�� �����Ѵ�.
		
		System.out.printf("**************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� ->iStatic=[%d]\n", k30_iStatic);//���������� Ŭ���� ��ü�� ���Ǳ� ������ ������ ���� ���� 2�� �״�� ��µȴ�.
		System.out.printf("�޼ҵ�ȣ���� ���ο��� ->iMain=[%d]\n", k30_iMain);//���������� return������ �޾ƿͼ� �ٽ� �����߱⶧���� 2�� ��µȴ�.
		System.out.printf("**************************\n");//*���� �ٹٲ��� ȭ�鿡 ����Ѵ�.
	}
	
	public static void add(int k30_i) {//add �޼ҵ带 �����ϰ� �Ķ���͸� ������ ���� i�� �޴´�.
		k30_iStatic++;//������ �������� k30_iStatic�� 1�� ������Ų��.
		k30_i++;//������ ���� i�� 1�� ������Ų��.
		System.out.printf("add�޼ҵ忡�� -> iStatic=[%d]\n", k30_iStatic);//�޼ҵ� ������ 1�� ������ 2�� ��µȴ�.
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n", k30_i);//�޼ҵ� ������ 1�� ������ 2�� ��µȴ�.
	}
	
	public static int add2(int k30_i) {//add2 �޼ҵ带 �����ϰ� �Ķ���͸� ������ ���� i�� �޴´�.
		k30_iStatic++;//������ �������� k30_iStatic�� 1�� ������Ų��.
		k30_i++;//������ ���� i�� 1�� ������Ų��.
		System.out.printf("add�޼ҵ忡�� -> iStatic=[%d]\n", k30_iStatic);//�޼ҵ� ������ 1�� ������ 3�� ��µȴ�.
		System.out.printf("add�޼ҵ忡�� -> i=[%d]\n", k30_i);//�޼ҵ� ������ 1�� ������ 2�� ��µȴ�.
		return k30_i;//���ϰ����� k30_i�� �޴´�.
	}

}
