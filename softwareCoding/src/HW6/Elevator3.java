package HW6;

public class Elevator3 extends Elevator2 {//Ŭ������ �����ϰ� Elevator2�� ��ӹ޴´�.
	void Repair() {//Repair��� �Լ� ����
		k30_help = String.format("�������Դϴ�");//���� help�� floor�� string���� ����ȯ�� �������Դϴٸ� ������ �����Ѵ�. 
	}
	
	void up() {//up�̶�� �Լ� ����
		if (k30_floor == k30_limit_up_floor) {//���� ���� floor�� �ֻ������� limit_up_floor�� �������ٸ�
			k30_help = "���������Դϴ�";//���� help�� ���������Դϴٸ� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_floor = k30_floor + 2;//���� floor�� 2 ������Ų��.
			k30_help = String.format("%d���Դϴ�", k30_floor);//���� help�� floor�� string���� ����ȯ�� %d���Դϴٸ� ������ �����Ѵ�. 
		}
		this.down();//this�� ���� Ŭ������ down�� �ǹ��ϰ�
	}
	
	void down() {//down�̶�� �Լ� ����
		super.down();//super�� �ڱ� �θ� �ִ� down�� �ǹ��Ѵ�.
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.k30_help);//���� help�� floor�� string���� ����ȯ�� %d���Դϴٸ� ������ �����Ѵ�. 
	}
}
