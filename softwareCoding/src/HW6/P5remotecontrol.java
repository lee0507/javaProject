package HW6;

public class P5remotecontrol {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub

		TvRemocon k30_remot;//TvRemocon Ŭ������ �޾Ƽ� ��ü�� �����.
		k30_remot = new TvRemocon();//�ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		
		for(int k30_i = 0; k30_i < 11; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� 11���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_remot.ChannelUp();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemoconŬ������ ChannelUp�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG[%s]\n", k30_remot.k30_help);
		}
		for(int k30_i = 0; k30_i < 11; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� 11���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_remot.ChannelDn();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemoconŬ������ ChannelDn�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG[%s]\n", k30_remot.k30_help);
		}
		for(int k30_i = 0; k30_i < 6; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� 6���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_remot.VolUp();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemoconŬ������ VolUp�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG[%s]\n", k30_remot.k30_help);
		}
		for(int k30_i = 0; k30_i < 6; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� 6���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_remot.VolDn();//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemoconŬ������ VolDn�޼ҵ带 �����Ѵ�.
			System.out.printf("MSG[%s]\n", k30_remot.k30_help);
		}
		
	}

}
