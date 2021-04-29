package HW6;

public class Elevator2 {
	int k30_limit_up_floor;// ������ �������� limit_up_floor�� �����Ѵ�.
	int k30_limit_down_floor;// ������ �������� limit_down_floor�� �����Ѵ�.
	int k30_floor;// ������ �������� floor�� �����Ѵ�.
	String k30_help;// ���ڿ��� �������� k30_help�� �����Ѵ�.
	
	Elevator2() {//Elevator2��� �Լ� ����
		k30_limit_up_floor = 10;// ������ �������� limit_up_floor�� �����ϰ� ���� 10���� �ʱ�ȭ�Ѵ�.
		k30_limit_down_floor = 0;// ������ �������� limit_down_floor�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		k30_floor = 1;// ������ �������� floor�� �����ϰ� ���� 1���� �ʱ�ȭ�Ѵ�.
		System.out.printf("���������� �ذ��Ϸ�\n");
	}
	
	Elevator2(int k30_a) {//Elevator2��� �Լ� �����ϰ� ������ ���� a�� �Ķ���ͷ� �޴´�.
		k30_limit_up_floor = 10;// ������ �������� limit_up_floor�� �����ϰ� ���� 10���� �ʱ�ȭ�Ѵ�.
		k30_limit_down_floor = 0;// ������ �������� limit_down_floor�� �����ϰ� ���� 0���� �ʱ�ȭ�Ѵ�.
		k30_floor = 1;// ������ �������� floor�� �����ϰ� ���� 1���� �ʱ�ȭ�Ѵ�.
		System.out.printf("���������� �ذ��Ϸ�[%d]\n", k30_a);
		
		if(k30_a > 0) {//���� a�� 0���� ũ�ٸ�
			for (int k30_i = 0; k30_i < k30_a; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
				this.up();//Ŭ���� ���� up�޼ҵ带 �����Ѵ�.
			}
		} else if (k30_a < 0) {//if������ �������� �ʴ� �����
			for (int k30_i = 0; k30_i < (k30_a * -1); k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� 10���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
				this.down();//Ŭ���� ���� down�޼ҵ带 �����Ѵ�.
			}
		}
	}
	
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
