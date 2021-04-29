package HW6;

public class P13InputData {//클래스 선언
	String[] k30_name;//문자열형 배열 k30_name을 정의한다.
	int[] k30_kor;//숫자형 배열 k30_kor을 정의한다.
	int[] k30_eng;//숫자형 배열 k30_eng을 정의한다.
	int[] k30_mat;//숫자형 배열 k30_mat을 정의한다.
	int[] k30_sum;//숫자형 배열 k30_sum을 정의한다.
	double[] k30_avg;//숫자형 배열 k30_avg을 정의한다.

	
	public P13InputData(int k30_iPerson) {//P13InputData라는 함수 생성하고 파라미터를 숫자형 변수 k30_iPerson으로 받는다.
		k30_name = new String[k30_iPerson];//변수 k30_iPerson만큼의 배열을 만들고 변수 k30_name에 저장한다.
		k30_kor = new int[k30_iPerson];//변수 k30_iPerson만큼의 배열을 만들고 변수 k30_kor에 저장한다.
		k30_eng = new int[k30_iPerson];//변수 k30_iPerson만큼의 배열을 만들고 변수 k30_eng에 저장한다.
		k30_mat = new int[k30_iPerson];//변수 k30_iPerson만큼의 배열을 만들고 변수 k30_mat에 저장한다.
		k30_sum = new int[k30_iPerson];//변수 k30_iPerson만큼의 배열을 만들고 변수 k30_sum에 저장한다.
		k30_avg = new double[k30_iPerson];//변수 k30_iPerson만큼의 배열을 만들고 변수 k30_avg에 저장한다.
	}

	public void SetData(int k30_i, String k30_name, int k30_kor, int k30_eng, int k30_mat) {
		//P13InputData라는 함수 생성하고 파라미터를 변수를 k30_i, k30_name, k30_kor, k30_eng, k30_mat으로 받는다.
		this.k30_name[k30_i] = k30_name;//만들어진 배열의 k30_i인덱스에 변수 k30_name을 저장한다.
		this.k30_kor[k30_i] = k30_kor;//만들어진 배열의 k30_i인덱스에 변수 k30_kor을 저장한다.
		this.k30_eng[k30_i] = k30_eng;//만들어진 배열의 k30_i인덱스에 변수 k30_eng을 저장한다.
		this.k30_mat[k30_i] = k30_mat;//만들어진 배열의 k30_i인덱스에 변수 k30_mat을 저장한다.
		this.k30_sum[k30_i] = k30_kor + k30_eng + k30_mat;//만들어진 배열의 k30_i인덱스에 k30_kor + k30_eng + k30_mat을 저장한다.
		this.k30_avg[k30_i] = ((k30_kor + k30_eng + k30_mat) / 3.0);//만들어진 배열의 k30_i인덱스에 ((k30_kor + k30_eng + k30_mat) / 3)을 저장한다.
				
	}
	
}
