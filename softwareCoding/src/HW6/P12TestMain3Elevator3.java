package HW6;

public class P12TestMain3Elevator3 {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		Elevator3 k30_elev3;//Elevator Ŭ������ �޾Ƽ� ��ü�� �����.
		
		k30_elev3 = new Elevator3();//�ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_elev3.up();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Elevator3Ŭ������ up�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG elev3[%s]\n", k30_elev3.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Elevator3Ŭ������ ���� help�� ȭ�鿡 ����Ѵ�.
		}
		
		for(int k30_i = 0; k30_i < 10; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_elev3.down();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Elevator3Ŭ������ down�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG elev3[%s]\n", k30_elev3.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Elevator3Ŭ������ ���� help�� ȭ�鿡 ����Ѵ�.
		}
		k30_elev3.Repair();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Elevator3Ŭ������ Repair�޼ҵ带 �����Ѵ�.
		System.out.printf("MSG elev3[%s]\n", k30_elev3.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� Elevator3Ŭ������ ���� help�� ȭ�鿡 ����Ѵ�.
	}

}
