package HW6;

public class TvRemocon {
	int k30_limit_up_Vol = 5;//������ �������� k30_limit_up_Vol�� �����ϰ� ���� 5�� �ʱ�ȭ�Ѵ�.
	int k30_limit_down_Vol = 0;//������ �������� k30_limit_down_Vol�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
	int k30_Vol = 0;//������ �������� k30_Vol�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
	int k30_limit_up_Channel = 10;//������ �������� k30_limit_up_Channel�� �����ϰ� ���� 10�� �ʱ�ȭ�Ѵ�.
	int k30_limit_down_Channel = 0;//������ �������� k30_limit_down_Channel�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
	int k30_Channel = 0;//������ �������� k30_limit_Channel�� �����ϰ� ���� 0�� �ʱ�ȭ�Ѵ�.
	String k30_help;//���ڿ��� �������� k30_help�� �����Ѵ�


	void VolUp() {//VolUp�̶�� �Լ� ����
		if(k30_Vol == k30_limit_up_Vol) {//���� ���� floor�� �ִ뺼���� limit_up_Vol�� �������ٸ�
			k30_help = "���̻� ������ �ø� �� �����ϴ�!";//���� help�� ���̻� ������ �ø� �� �����ϴ�!�� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_Vol++;//���� Vol�� 1 ������Ų��.
			k30_help = String.format("���� ������ %d�Դϴ�.", k30_Vol);//���� help�� Vol�� string���� ����ȯ�� ���� ������ %d�Դϴٸ� ������ �����Ѵ�. 
		}
	}
	
	void VolDn() {//VolDn�̶�� �Լ� ����
		if(k30_Vol == k30_limit_down_Vol) {//���� ���� floor�� ���������� limit_down_Vol�� �������ٸ�
			k30_help = "���̻� ������ ���� �� �����ϴ�!";//���� help�� ���̻� ������ ���� �� �����ϴ�!�� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_Vol--;//���� Vol�� 1 ���ҽ�Ų��.
			k30_help = String.format("���� ������ %d�Դϴ�.", k30_Vol);//���� help�� Vol�� string���� ����ȯ�� ���� ������ %d�Դϴٸ� ������ �����Ѵ�. 
		}
	}
	
	void ChannelUp() {//ChannelUp�̶�� �Լ� ����
		if(k30_Channel == k30_limit_up_Channel) {//���� ���� floor�� �ִ�ä���� limit_up_Vol�� �������ٸ�
			k30_help = "���̻� ä���� �����ϴ�!";//���� help�� ���̻� ä���� �����ϴ�!�� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_Channel++;//���� Channel�� 1 ������Ų��.
			k30_help = String.format("���� ä���� %d���Դϴ�.", k30_Channel);//���� help�� Channel�� string���� ����ȯ�� ���� ä���� %d���Դϴ�.�� ������ �����Ѵ�. 
		}
	}
	
	void ChannelDn() {//ChannelDn�̶�� �Լ� ����
		if(k30_Channel == k30_limit_down_Channel) {//���� ���� floor�� ����ä���� limit_down_Vol�� �������ٸ�
			k30_help = "���̻� ä���� �����ϴ�!";//���� help�� ���̻� ä���� �����ϴ�!�� ������ �����Ѵ�. 
		} else {//if������ �������� �ʴ� �����
			k30_Channel--;//���� Channel�� 1 ���ҽ�Ų��.
			k30_help = String.format("���� ä���� %d���Դϴ�.", k30_Channel);//���� help�� Channel�� string���� ����ȯ�� ���� ä���� %d���Դϴ�.�� ������ �����Ѵ�. 
		}
	}

}
