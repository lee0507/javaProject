package HW6;

public class TvRemocon2 {
	int k30_limit_up_Vol;//������ �������� k30_limit_up_Vol�� �����Ѵ�.
	int k30_limit_down_Vol;//������ �������� k30_limit_down_Vol�� �����Ѵ�.
	int k30_Vol;//������ �������� k30_Vol�� �����Ѵ�.
	int k30_limit_up_Channel;//������ �������� k30_limit_up_Channel �� �����Ѵ�.
	int k30_limit_down_Channel;//������ �������� k30_limit_up_Vol�� �����Ѵ�.
	int k30_Channel;//������ �������� k30_limit_up_Vol�� �����Ѵ�.
	String k30_help;//������ �������� k30_limit_up_Vol�� �����Ѵ�.
	String k30_help2;//������ �������� k30_limit_up_Vol�� �����Ѵ�.
	
	TvRemocon2() {
		k30_limit_up_Vol = 10;//������ �������� k30_limit_up_Vol�� �����ϰ� ���� 5�� �ʱ�ȭ�Ѵ�.
		k30_limit_down_Vol = 0;//������ �������� k30_limit_down_Vol�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
		k30_Vol = 0;//������ �������� k30_Vol�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
		k30_limit_up_Channel = 10;//������ �������� k30_limit_up_Channel�� �����ϰ� ���� 10�� �ʱ�ȭ�Ѵ�.
		k30_limit_down_Channel = 0;//������ �������� k30_limit_down_Channel�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
		k30_Channel = 0;//������ �������� k30_limit_Channel�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.

	}
	
	TvRemocon2(int k30_a) {
		k30_limit_up_Vol = 10;//������ �������� k30_limit_up_Vol�� �����ϰ� ���� 5�� �ʱ�ȭ�Ѵ�.
		k30_limit_down_Vol = 0;//������ �������� k30_limit_down_Vol�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
		k30_Vol = 0;//������ �������� k30_Vol�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
		k30_limit_up_Channel = 10;//������ �������� k30_limit_up_Channel�� �����ϰ� ���� 10�� �ʱ�ȭ�Ѵ�.
		k30_limit_down_Channel = 0;//������ �������� k30_limit_down_Channel�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
		k30_Channel = 0;//������ �������� k30_limit_Channel�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
		System.out.printf("TV ������ �׽��ϴ�[%d]\n", k30_a);//���� k30_a�� ����Ѵ�.
		
		if(k30_a > 0) {//���� ���� k30_a�� 0���� ũ�ٸ�
			for (int k30_i = 0; k30_i < k30_a; k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� k30_a���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
				this.VolUp();//Ŭ���� ���� VolUp�޼ҵ带 �����Ѵ�.
			}
			if (k30_a > 0) {//���� ���� k30_a�� 0���� ũ�ٸ�
				for (int k30_j = 0; k30_j < k30_a; k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� k30_a���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
					this.ChannelUp();//Ŭ���� ���� ChannelUp�޼ҵ带 �����Ѵ�.
				}
			} else if (k30_a < 0) {//���� ���� k30_a�� 0���� �۴ٸ�
				for (int k30_j = 0; k30_j < (k30_a * -1); k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� k30_a���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
					this.ChannelDn();//Ŭ���� ���� ChannelDn�޼ҵ带 �����Ѵ�.
				}
			}
			
		} else if (k30_a < 0) {//���� ���� k30_a�� 0���� �۴ٸ�
			for (int k30_i = 0; k30_i < (k30_a * -1); k30_i++) {//for�ݺ����� k30_i�� 1���� k30_i�� k30_a���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
				this.VolDn();//Ŭ���� ���� VolDn�޼ҵ带 �����Ѵ�.
			}
			if (k30_a > 0) {//���� ���� k30_a�� 0���� ũ�ٸ�
				for (int k30_j = 0; k30_j < k30_a; k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� k30_a���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
					this.ChannelUp();//Ŭ���� ���� ChannelUp�޼ҵ带 �����Ѵ�.
				}
			} else if (k30_a < 0) {//���� ���� k30_a�� 0���� �۴ٸ�
				for (int k30_j = 0; k30_j < (k30_a * -1); k30_j++) {//for�ݺ����� k30_j�� 1���� k30_j�� k30_a���� ���� ������ k30_j�� 1�� ������Ű�鼭 �����Ѵ�.
					this.ChannelDn();//Ŭ���� ���� ChannelDn�޼ҵ带 �����Ѵ�.
				}
			}
		}

	}
	

	void VolUp() {//VolUp�̶�� �Լ� ����
		if(k30_Vol == k30_limit_up_Vol) {//���� ���� floor�� �ִ뺼���� limit_up_Vol�� �������ٸ�
			k30_help = "���̻� ������ �ø� �� �����ϴ�!";//���� help�� ���̻� ������ �ø� �� �����ϴ�!�� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_Vol++;//���� Vol�� 1 ������Ų��.
			k30_help = String.format("���� ������ %d�Դϴ�.", k30_Vol);//���� help�� Vol�� string���� ����ȯ�� ���� ������ %d�Դϴٸ� ������ �����Ѵ�.
		}
	}
	
	void VolDn() {//VolDn�̶�� �Լ� ����
		if(k30_Vol == k30_limit_down_Vol) {//���� ���� floor�� ���������� limit_up_Vol�� �������ٸ�
			k30_help = "���̻� ������ ���� �� �����ϴ�!";//���� help�� ���̻� ������ ���� �� �����ϴ�!�� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_Vol--;//���� Vol�� 1 ���ҽ�Ų��.
			k30_help = String.format("���� ������ %d�Դϴ�.", k30_Vol);
		}
	}
	
	void ChannelUp() {//ChannelUp�̶�� �Լ� ����
		if(k30_Channel == k30_limit_up_Channel) {//���� ���� floor�� �ִ�ä���� limit_up_Vol�� �������ٸ�
			k30_help2 = "���̻� ä���� �����ϴ�!";//���� help�� ���̻� ä���� �����ϴ�!�� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_Channel++;//���� Channel�� 1 ������Ų��.
			k30_help2 = String.format("���� ä���� %d���Դϴ�.", k30_Channel);//���� help�� Channel�� string���� ����ȯ�� ���� ä���� %d���Դϴ�.�� ������ �����Ѵ�. 
		}
	}
	
	void ChannelDn() {//ChannelUp�̶�� �Լ� ����
		if(k30_Channel == k30_limit_down_Channel) {//���� ���� floor�� ����ä���� limit_down_Vol�� �������ٸ�
			k30_help2 = "���̻� ä���� �����ϴ�!";//���� help�� ���̻� ä���� �����ϴ�!�� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_Channel--;//���� Channel�� 1 ���ҽ�Ų��.
			k30_help2 = String.format("���� ä���� %d���Դϴ�.", k30_Channel);//���� help�� Channel�� string���� ����ȯ�� ���� ä���� %d���Դϴ�.�� ������ �����Ѵ�. 
		}
	}
}
