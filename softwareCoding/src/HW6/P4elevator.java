package HW6;

public class P4elevator {//Ŭ���� ����
	
	static int k30_inVal;//������ �������� inVal�� �����Ѵ�.
	
	public static void up() {//up ��� �Լ� ����
		k30_inVal++;//���� inVal�� 1 ������Ų��.
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k30_inVal);//���� inVal�� ȭ�鿡 ����Ѵ�.
	}
	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		
		k30_inVal = 0;//Ŭ���� ������ ���� inVal�� ���� 0���� �����Ѵ�.
		Elevator k30_elev;//Elevator Ŭ������ �޾Ƽ� ��ü�� �����.
		k30_elev = new Elevator();//�ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		up();// Ŭ���� ������ �޼ҵ带 up�� �����Ѵ�.
		
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_elev.up();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� ElevatorŬ������ up�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG[%s]\n", k30_elev.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� ElevatorŬ������ ���� help�� ȭ�鿡 ����Ѵ�.
		}
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_elev.down();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� ElevatorŬ������ down�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG[%s]\n", k30_elev.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� ElevatorŬ������ ���� help�� ȭ�鿡 ����Ѵ�.
		}
		
	}
	
}
