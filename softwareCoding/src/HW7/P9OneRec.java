package HW7;

public class P9OneRec {//Ŭ���� ����
	
	private int k30_student_id;//������ �������� student_id�� private���� �����Ѵ�.
	private String k30_name;//���ڿ��� �������� name�� private���� �����Ѵ�.
	private int k30_kor;//������ �������� k30_kor�� private���� �����Ѵ�.
	private int k30_eng;//������ �������� k30_eng�� private���� �����Ѵ�.
	private int k30_mat;//������ �������� k30_mat�� private���� �����Ѵ�.
	
	public P9OneRec(int k30_student_id, String k30_name, int k30_kor, int k30_eng, int k30_mat) {//������ P6classScore�� �����ϰ� �Ķ���ͷ� ������������ �־���.
		this.k30_student_id = k30_student_id;//this�� �̿��Ͽ� k30_student_id�� �����ִ� �������� k30_student_id��� �˷��־���.
		this.k30_name = k30_name;//this�� �̿��Ͽ� k30_name�� �����ִ� �������� k30_name�̶�� �˷��־���.
		this.k30_kor = k30_kor;//this�� �̿��Ͽ� k30_kor�� �����ִ� �������� k30_kor�̶�� �˷��־���.
		this.k30_eng = k30_eng;//this�� �̿��Ͽ� k30_eng�� �����ִ� �������� k30_eng�̶�� �˷��־���.
		this.k30_mat = k30_mat;//this�� �̿��Ͽ� k30_mat�� �����ִ� �������� k30_mat�̶�� �˷��־���.
	}
	public int student_id() {return this.k30_student_id;}; //student_id�Լ��� �����ϰ� ���ϰ����� �������� k30_student_id�� �־���.
	public String name() {return this.k30_name;}; //name�Լ��� �����ϰ� ���ϰ����� �������� k30_name�� �־���.
	public int kor() {return this.k30_kor;}; //kor�Լ��� �����ϰ� this�� �̿��Ͽ� k30_kor�� �����ִ� �������� k30_kor�̶�� �˷��ְ� ���ϰ����� �������� k30_kor�� �־���.
	public int eng() {return this.k30_eng;}; //eng�Լ��� �����ϰ� this�� �̿��Ͽ� k30_eng�� �����ִ� �������� k30_eng�̶�� �˷��ְ� ���ϰ����� �������� k30_eng�� �־���.
	public int mat() {return this.k30_mat;}; //mat�Լ��� �����ϰ� this�� �̿��Ͽ� k30_mat�� �����ִ� �������� k30_mat�̶�� �˷��ְ� ���ϰ����� �������� k30_mat�� �־���.
	public int sum() {return this.k30_kor + this.k30_eng + this.k30_mat;}; //sum�Լ��� �����ϰ�  this�� �̿��Ͽ� �����������̶�� �˷��ְ� 3���� ���������� ���� ���ϰ����� �־���.
	public double avg() {return this.sum() / 3.0;}; //avg�Լ��� �����ϰ� ���ϰ����� sum�Լ��� ���ϰ� ������ 3�� �Ͽ���.

}
