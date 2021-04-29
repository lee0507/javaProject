package HW7;

public class P6classScore {//Ŭ���� ����
	
	private String k30_name;//���ڿ��� �������� name�� private���� �����Ѵ�.
	private int k30_kor;//������ �������� k30_kor�� private���� �����Ѵ�.
	private int k30_eng;//������ �������� k30_eng�� private���� �����Ѵ�.
	private int k30_mat;//������ �������� k30_mat�� private���� �����Ѵ�.
	
	public P6classScore(String k30_name, int k30_kor, int k30_eng, int k30_mat) {//������ P6classScore�� �����ϰ� �Ķ���ͷ� ������������ �־���.
		this.k30_name = k30_name;//this�� �̿��Ͽ� k30_name�� �����ִ� �������� k30_name�̶�� �˷��־���.
		this.k30_kor = k30_kor;//this�� �̿��Ͽ� k30_kor�� �����ִ� �������� k30_kor�̶�� �˷��־���.
		this.k30_eng = k30_eng;//this�� �̿��Ͽ� k30_eng�� �����ִ� �������� k30_eng�̶�� �˷��־���.
		this.k30_mat = k30_mat;//this�� �̿��Ͽ� k30_mat�� �����ִ� �������� k30_mat�̶�� �˷��־���.
	}
	
	public String name() {return this.k30_name;}; //name�Լ��� �����ϰ� ���ϰ����� �������� k30_name�� �־���.
	public int kor() {return this.k30_kor;}; //kor�Լ��� �����ϰ� this�� �̿��Ͽ� k30_kor�� �����ִ� �������� k30_kor�̶�� �˷��ְ� ���ϰ����� �������� k30_kor�� �־���.
	public int eng() {return this.k30_eng;}; //eng�Լ��� �����ϰ� this�� �̿��Ͽ� k30_eng�� �����ִ� �������� k30_eng�̶�� �˷��ְ� ���ϰ����� �������� k30_eng�� �־���.
	public int mat() {return this.k30_mat;}; //mat�Լ��� �����ϰ� this�� �̿��Ͽ� k30_mat�� �����ִ� �������� k30_mat�̶�� �˷��ְ� ���ϰ����� �������� k30_mat�� �־���.
	public int sum() {return this.k30_kor + this.k30_eng + this.k30_mat;}; //sum�Լ��� �����ϰ�  this�� �̿��Ͽ� �����������̶�� �˷��ְ� 3���� ���������� ���� ���ϰ����� �־���.
	public double avg() {return this.sum() / 3.0;}; //avg�Լ��� �����ϰ� ���ϰ����� sum�Լ��� ���ϰ� ������ 3�� �Ͽ���.
	
	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		int k30_iPerson = 5;// ������ ���� k30_iPerson�� �����ϰ� ���� 5�� �ʱ�ȭ�Ͽ���.
		
		P6classScore[] k30_inData = new P6classScore[k30_iPerson];//P13InputData Ŭ������ �Ķ���͸� inPerson���� �ش��� �迭��ü�� ����� �ν��Ͻ��� �����Ͽ��� �迭��ü�� �����Ѵ�.
		

		
		for (int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iPerson�� ���̺��� ������ ���� k30_i�� 1�� ������Ű�� �����Ѵ�.
			String k30_name = String.format("ȫ��%02d", k30_i);//���� k30_name�� k30_i�� string���� ����ȯ�� ���� ȫ��%02d�� ������ �����Ѵ�. 
			int k30_kor = (int)(Math.random() * 100);//���� k30_kor�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_eng = (int)(Math.random() * 100);//���� k30_eng�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			int k30_mat = (int)(Math.random() * 100);//���� k30_mat�� ���������� ����ȯ�� (Math.random() * 100)�� ������ �����Ѵ�.
			k30_inData[k30_i] = new P6classScore(k30_name, k30_kor, k30_eng, k30_mat);//k30_inData�� �ε��� k30_i���� name, kor, eng, mat���� �����Ѵ�.
		}
		
		for(int k30_i = 0; k30_i < k30_inData.length; k30_i++) {//for�ݺ����� k30_i�� 0���� k30_i�� k30_iPerson���� ���� ������ k30_i�� 1�� ������Ű�鼭 �����Ѵ�.
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%2d, ����:%2d, ����:%2d, ����:%3d, ���:%f\n",//�������� ������� ȭ�鿡 ����Ѵ�.
					k30_i, k30_inData[k30_i].k30_name, k30_inData[k30_i].k30_kor, k30_inData[k30_i].k30_eng, 
					k30_inData[k30_i].k30_mat, k30_inData[k30_i].sum(), k30_inData[k30_i].avg());//����� k30_inData�� k30_i�ε����� ������� �Լ����� �ҷ��� ȭ�鿡 ����Ѵ�.
		}
	}
}
