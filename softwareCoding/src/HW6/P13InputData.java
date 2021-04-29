package HW6;

public class P13InputData {//Ŭ���� ����
	String[] k30_name;//���ڿ��� �迭 k30_name�� �����Ѵ�.
	int[] k30_kor;//������ �迭 k30_kor�� �����Ѵ�.
	int[] k30_eng;//������ �迭 k30_eng�� �����Ѵ�.
	int[] k30_mat;//������ �迭 k30_mat�� �����Ѵ�.
	int[] k30_sum;//������ �迭 k30_sum�� �����Ѵ�.
	double[] k30_avg;//������ �迭 k30_avg�� �����Ѵ�.

	
	public P13InputData(int k30_iPerson) {//P13InputData��� �Լ� �����ϰ� �Ķ���͸� ������ ���� k30_iPerson���� �޴´�.
		k30_name = new String[k30_iPerson];//���� k30_iPerson��ŭ�� �迭�� ����� ���� k30_name�� �����Ѵ�.
		k30_kor = new int[k30_iPerson];//���� k30_iPerson��ŭ�� �迭�� ����� ���� k30_kor�� �����Ѵ�.
		k30_eng = new int[k30_iPerson];//���� k30_iPerson��ŭ�� �迭�� ����� ���� k30_eng�� �����Ѵ�.
		k30_mat = new int[k30_iPerson];//���� k30_iPerson��ŭ�� �迭�� ����� ���� k30_mat�� �����Ѵ�.
		k30_sum = new int[k30_iPerson];//���� k30_iPerson��ŭ�� �迭�� ����� ���� k30_sum�� �����Ѵ�.
		k30_avg = new double[k30_iPerson];//���� k30_iPerson��ŭ�� �迭�� ����� ���� k30_avg�� �����Ѵ�.
	}

	public void SetData(int k30_i, String k30_name, int k30_kor, int k30_eng, int k30_mat) {
		//P13InputData��� �Լ� �����ϰ� �Ķ���͸� ������ k30_i, k30_name, k30_kor, k30_eng, k30_mat���� �޴´�.
		this.k30_name[k30_i] = k30_name;//������� �迭�� k30_i�ε����� ���� k30_name�� �����Ѵ�.
		this.k30_kor[k30_i] = k30_kor;//������� �迭�� k30_i�ε����� ���� k30_kor�� �����Ѵ�.
		this.k30_eng[k30_i] = k30_eng;//������� �迭�� k30_i�ε����� ���� k30_eng�� �����Ѵ�.
		this.k30_mat[k30_i] = k30_mat;//������� �迭�� k30_i�ε����� ���� k30_mat�� �����Ѵ�.
		this.k30_sum[k30_i] = k30_kor + k30_eng + k30_mat;//������� �迭�� k30_i�ε����� k30_kor + k30_eng + k30_mat�� �����Ѵ�.
		this.k30_avg[k30_i] = ((k30_kor + k30_eng + k30_mat) / 3.0);//������� �迭�� k30_i�ε����� ((k30_kor + k30_eng + k30_mat) / 3)�� �����Ѵ�.
				
	}
	
}
