package HW6;

public class P11remotecontrol {//Ŭ���� ����

	
	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		
		TvRemocon2 tvVolUp = new TvRemocon2(10);//tvVolUP Ŭ������ �Ķ���͸� 10���� �ش��� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		System.out.printf("MSG tvVolUp[%s]\n\n", tvVolUp.k30_help2);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemocon2Ŭ������ ���� help2�� ȭ�鿡 ����Ѵ�.
		
		TvRemocon2 tvVolDn = new TvRemocon2(-10);//tvVolDn Ŭ������ �Ķ���͸� -10���� �ش��� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		System.out.printf("MSG tvVolDn[%s]\n\n", tvVolDn.k30_help2);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemocon2Ŭ������ ���� help2�� ȭ�鿡 ����Ѵ�.
		
		TvRemocon2 tvChannelUp = new TvRemocon2(5);//tvChannelUP Ŭ������ �Ķ���͸� 5���� �ش��� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		System.out.printf("MSG tvChannelUp[%s]\n\n", tvChannelUp.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemocon2Ŭ������ ���� help�� ȭ�鿡 ����Ѵ�.
		
		TvRemocon2 tvChannelDn = new TvRemocon2(-5);//tvChannelDn Ŭ������ �Ķ���͸� -5���� �ش��� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		System.out.printf("MSG tvChannelDn[%s]\n", tvChannelDn.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemocon2Ŭ������ ���� help�� ȭ�鿡 ����Ѵ�.
		
		TvRemoconX tvremotX = new TvRemoconX(); //tvremotX Ŭ���� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� �����Ѵ�.
		tvremotX.Repair();//tvremotX�� �Լ� Repair�� �����Ѵ�.
		System.out.printf("MSG fixX[%s]\n", tvremotX.k30_help);//�Ʊ� �޾ƿ� ��ü�� ����Ͽ� TvRemoconXŬ������ ���� help�� ȭ�鿡 ����Ѵ�.
		
		
		
	}

}
