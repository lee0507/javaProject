package HW6;

public class P8elevator2 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		Elevator k30_elev;//Elevator Ŭ������ �޾Ƽ� ��ü�� �����.
		k30_elev = new Elevator();//�ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		for (int i = 0; i < 10; i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_elev.up();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� ElevatorŬ������ up�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG[%s]\n", k30_elev.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� ElevatorŬ������ ���� help�� ȭ�鿡 ����Ѵ�.
		}
		
		for (int i = 0; i < 10; i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_elev.down();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� ElevatorŬ������ down�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG[%s]\n", k30_elev.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� ElevatorŬ������ ���� help�� ȭ�鿡 ����Ѵ�.
		}
		System.out.println();//�ٹٲ��� ȭ�鿡 ����Ѵ�.
		
		Elevator2 elevUP = new Elevator2(5);//elevUP Ŭ������ �Ķ���͸� 5�� �ش��� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		System.out.printf("MSG elevUP[%s]\n", elevUP.k30_help);
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Elevator2Ŭ������ ���� help�� ȭ�鿡 ����Ѵ�.
		
		Elevator2 elevDN = new Elevator2(-5);//elevDN Ŭ������ �޾Ƽ� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		System.out.printf("MSG elevDN[%s]\n", elevDN.k30_help);
		//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Elevator2Ŭ������ ���� help�� ȭ�鿡 ����Ѵ�.
	}

}
