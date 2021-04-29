package HW7;

public class P6classScore {//클래스 선언
	
	private String k30_name;//문자열형 전역변수 name를 private으로 정의한다.
	private int k30_kor;//숫자형 전역변수 k30_kor를 private으로 정의한다.
	private int k30_eng;//숫자형 전역변수 k30_eng를 private으로 정의한다.
	private int k30_mat;//숫자형 전역변수 k30_mat를 private으로 정의한다.
	
	public P6classScore(String k30_name, int k30_kor, int k30_eng, int k30_mat) {//생성자 P6classScore를 정의하고 파라미터로 전역변수들을 주었다.
		this.k30_name = k30_name;//this를 이용하여 k30_name이 위에있는 전역변수 k30_name이라고 알려주었다.
		this.k30_kor = k30_kor;//this를 이용하여 k30_kor이 위에있는 전역변수 k30_kor이라고 알려주었다.
		this.k30_eng = k30_eng;//this를 이용하여 k30_eng이 위에있는 전역변수 k30_eng이라고 알려주었다.
		this.k30_mat = k30_mat;//this를 이용하여 k30_mat이 위에있는 전역변수 k30_mat이라고 알려주었다.
	}
	
	public String name() {return this.k30_name;}; //name함수를 생성하고 리턴값으로 전역변수 k30_name을 주었다.
	public int kor() {return this.k30_kor;}; //kor함수를 생성하고 this를 이용하여 k30_kor이 위에있는 전역변수 k30_kor이라고 알려주고 리턴값으로 전역변수 k30_kor을 주었다.
	public int eng() {return this.k30_eng;}; //eng함수를 생성하고 this를 이용하여 k30_eng이 위에있는 전역변수 k30_eng이라고 알려주고 리턴값으로 전역변수 k30_eng을 주었다.
	public int mat() {return this.k30_mat;}; //mat함수를 생성하고 this를 이용하여 k30_mat이 위에있는 전역변수 k30_mat이라고 알려주고 리턴값으로 전역변수 k30_mat을 주었다.
	public int sum() {return this.k30_kor + this.k30_eng + this.k30_mat;}; //sum함수를 생성하고  this를 이용하여 전역변수들이라고 알려주고 3가지 전역변수의 합을 리턴값으로 주었다.
	public double avg() {return this.sum() / 3.0;}; //avg함수를 생성하고 리턴값으로 sum함수의 리턴값 나누기 3을 하였다.
	
	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_iPerson = 5;// 숫자형 변수 k30_iPerson을 정의하고 값을 5로 초기화하였다.
		
		P6classScore[] k30_inData = new P6classScore[k30_iPerson];//P13InputData 클래스에 파라미터를 inPerson으로 준다음 배열객체를 만들고 인스턴스를 생성하여서 배열객체에 연결한다.
		

		
		for (int k30_i = 0; k30_i < k30_iPerson; k30_i++) {//for반복문은 k30_i는 0부터 k30_i가 k30_iPerson의 길이보다 작을때 까지 k30_i를 1씩 증가시키며 수행한다.
			String k30_name = String.format("홍길%02d", k30_i);//변수 k30_name에 k30_i를 string으로 형변환한 현재 홍길%02d를 값으로 저장한다. 
			int k30_kor = (int)(Math.random() * 100);//변수 k30_kor에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_eng = (int)(Math.random() * 100);//변수 k30_eng에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			int k30_mat = (int)(Math.random() * 100);//변수 k30_mat에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장한다.
			k30_inData[k30_i] = new P6classScore(k30_name, k30_kor, k30_eng, k30_mat);//k30_inData의 인덱스 k30_i값에 name, kor, eng, mat값을 저장한다.
		}
		
		for(int k30_i = 0; k30_i < k30_inData.length; k30_i++) {//for반복문을 k30_i는 0부터 k30_i가 k30_iPerson보다 작을 때까지 k30_i를 1씩 증가시키면서 수행한다.
			System.out.printf("번호:%d, 이름:%s, 국어:%2d, 영어:%2d, 수학:%2d, 총점:%3d, 평균:%f\n",//변수들을 순서대로 화면에 출력한다.
					k30_i, k30_inData[k30_i].k30_name, k30_inData[k30_i].k30_kor, k30_inData[k30_i].k30_eng, 
					k30_inData[k30_i].k30_mat, k30_inData[k30_i].sum(), k30_inData[k30_i].avg());//저장된 k30_inData의 k30_i인덱스의 변수들과 함수들을 불러서 화면에 출력한다.
		}
	}
}
