package HW7;

public class P1hanglecount {//Ŭ���� ����

	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ�abcd", 15));//�Լ� HanBlankForeword�� �Ķ���͸� �ѱ�abcd�� 15�� �־ ȭ�鿡 ����Ѵ�.
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword("�ѱ��ѱ�aa", 15));//�Լ� HanBlankForeword�� �Ķ���͸� �ѱ��ѱ�aa�� 15�� �־ ȭ�鿡 ����Ѵ�.
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ�aa", 15));//�Լ� HanBlankBackword�� �Ķ���͸� �ѱ�aa�� 15�� �־ ȭ�鿡 ����Ѵ�.
		System.out.printf("HanBlankBackword[%s]\n", HanBlankBackword("�ѱ��ѱ�aa", 15));//�Լ� HanBlankBackword�� �Ķ���͸� �ѱ��ѱ�aa�� 15�� �־ ȭ�鿡 ����Ѵ�.
		System.out.printf("�ѱ��� [%s]��\n", HanCount("�ѱ��ѱ�aa"));//�Լ� HanCount�� �Ķ���͸� �ѱ��ѱ�aa�� �־ ȭ�鿡 ����Ѵ�.
	}
	
	public static String HanBlankForeword(String k30_word, int k30_length) {// HanBlankForeword�̶�� �Լ� �����ϰ� �Ķ���͸� ���ڿ� k30_word�� ������ k30_length�� �־���. 
		byte[] k30_wdcount = k30_word.getBytes();//getBytes�� �̿��Ͽ� k30_word�� ����Ʈ������ �޾� ����Ʈ�迭 k30_wdcount�� �����Ͽ���.
		int k30_byteleng = k30_wdcount.length;//������ ���� k30_byteleng�� �����ϰ� ������ k30_wdcount�� ���̸� �����Ͽ���.
		String k30_ret_str = "";// ���ڿ��� ���� k30_ret_str�� �����ϰ� ���� �ʱ�ȭ�Ͽ���.
		for(int k30_i = 0; k30_i < (k30_length - k30_byteleng); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� (k30_length - k30_byteleng)���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_ret_str = k30_ret_str + " ";//���� k30_ret_str�� �ݺ����ϴ� ��ŭ�� ������ �ִ´�.
		}
		k30_ret_str = k30_ret_str + k30_word;//���� k30_ret_str�� �ٽ� ������ ���� k30_word�� �ڷ� �߰��Ѵ�.
		return k30_ret_str;//���ϰ��� ���� k30_ret_str�� �޴´�.
		
	}
	
	public static String HanBlankBackword(String k30_word, int k30_length) {// HanBlankBackword�̶�� �Լ� �����ϰ� �Ķ���͸� ���ڿ� k30_word�� ������ k30_length�� �־���. 
		byte[] k30_wdcount = k30_word.getBytes();//getBytes�� �̿��Ͽ� k30_word�� ����Ʈ������ �޾� ����Ʈ�迭 k30_wdcount�� �����Ͽ���.
		int k30_byteleng = k30_wdcount.length;//������ ���� k30_byteleng�� �����ϰ� ������ k30_wdcount�� ���̸� �����Ͽ���.
		String k30_ret_str = "";// ���ڿ��� ���� k30_ret_str�� �����ϰ� ���� �ʱ�ȭ�Ͽ���.
		for(int k30_i = 0; k30_i < (k30_length - k30_byteleng); k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� (k30_length - k30_byteleng)���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			k30_ret_str = k30_ret_str + " ";//���� k30_ret_str�� �ݺ����ϴ� ��ŭ�� ������ �ִ´�.
		}
		k30_ret_str = k30_word + k30_ret_str;//���� k30_ret_str�� �ٽ� ������ ���� k30_word�� ������ �߰��Ѵ�.
		return k30_ret_str;//���ϰ��� ���� k30_ret_str�� �޴´�.
		
	}
	
	public static int HanCount(String k30_word) {// HanCount��� �Լ� �����ϰ� �Ķ���͸� ���ڿ� k30_word�� �־���. 
		byte[] k30_wdcount = k30_word.getBytes();//getBytes�� �̿��Ͽ� k30_word�� ����Ʈ������ �޾� ����Ʈ�迭 k30_wdcount�� �����Ͽ���.
		int k30_count = k30_wdcount.length - k30_word.length();//������ ���� k30_count�� �����ϰ� k30_wdcount.length - k30_word.length()���� �����Ͽ���.
		return k30_count;//���ϰ��� ���� k30_count�� �޴´�.
	}

}
