package HW6;

public class Elevator {//Ŭ���� ����
	int k30_limit_up_floor = 10;// ������ �������� limit_up_floor�� �����ϰ� ���� 10���� �ʱ�ȭ�Ѵ�.
	int k30_limit_down_floor = 0;// ������ �������� limit_down_floor�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
	int k30_floor = 1;// ������ �������� floor�� �����ϰ� ���� 1���� �ʱ�ȭ�Ѵ�.
	String k30_help;// ���ڿ��� �������� help�� �����Ѵ�.
	
	void up() {//up�̶�� �Լ� ����
		if (k30_floor == k30_limit_up_floor) {//���� ���� floor�� �ֻ������� limit_up_floor�� �������ٸ�
			k30_help = "���������Դϴ�";//���� help�� ���������Դϴٸ� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_floor++;//���� floor�� 1 ������Ų��.
			k30_help = String.format("%d���Դϴ�", k30_floor);//���� help�� floor�� string���� ����ȯ�� %d���Դϴٸ� ������ �����Ѵ�. 
			
		}

	}
	
	void down() {//down�̶�� �Լ� ����
		if (k30_floor == k30_limit_down_floor) {//���� ���� floor�� ���������� limit_down_floor�� �������ٸ�
			k30_help = "ó�����Դϴ�";//���� help�� ó�����Դϴٸ� ������ �����Ѵ�.
		} else {//if������ �������� �ʴ� �����
			k30_floor--;//���� floor�� 1 ���ҽ�Ų��.
			k30_help = String.format("%d���Դϴ�", k30_floor);//���� help�� floor�� string���� ����ȯ�� %d���Դϴٸ� ������ �����Ѵ�. 
		}
	}

}
