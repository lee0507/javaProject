package HW7;

public class P9OneRec {//클래스 선언
	
	private int k30_student_id;//숫자형 전역변수 student_id를 private으로 정의한다.
	private String k30_name;//문자열형 전역변수 name를 private으로 정의한다.
	private int k30_kor;//숫자형 전역변수 k30_kor를 private으로 정의한다.
	private int k30_eng;//숫자형 전역변수 k30_eng를 private으로 정의한다.
	private int k30_mat;//숫자형 전역변수 k30_mat를 private으로 정의한다.
	
	public P9OneRec(int k30_student_id, String k30_name, int k30_kor, int k30_eng, int k30_mat) {//생성자 P6classScore를 정의하고 파라미터로 전역변수들을 주었다.
		this.k30_student_id = k30_student_id;//this를 이용하여 k30_student_id가 위에있는 전역변수 k30_student_id라고 알려주었다.
		this.k30_name = k30_name;//this를 이용하여 k30_name이 위에있는 전역변수 k30_name이라고 알려주었다.
		this.k30_kor = k30_kor;//this를 이용하여 k30_kor이 위에있는 전역변수 k30_kor이라고 알려주었다.
		this.k30_eng = k30_eng;//this를 이용하여 k30_eng이 위에있는 전역변수 k30_eng이라고 알려주었다.
		this.k30_mat = k30_mat;//this를 이용하여 k30_mat이 위에있는 전역변수 k30_mat이라고 알려주었다.
	}
	public int student_id() {return this.k30_student_id;}; //student_id함수를 생성하고 리턴값으로 전역변수 k30_student_id를 주었다.
	public String name() {return this.k30_name;}; //name함수를 생성하고 리턴값으로 전역변수 k30_name을 주었다.
	public int kor() {return this.k30_kor;}; //kor함수를 생성하고 this를 이용하여 k30_kor이 위에있는 전역변수 k30_kor이라고 알려주고 리턴값으로 전역변수 k30_kor을 주었다.
	public int eng() {return this.k30_eng;}; //eng함수를 생성하고 this를 이용하여 k30_eng이 위에있는 전역변수 k30_eng이라고 알려주고 리턴값으로 전역변수 k30_eng을 주었다.
	public int mat() {return this.k30_mat;}; //mat함수를 생성하고 this를 이용하여 k30_mat이 위에있는 전역변수 k30_mat이라고 알려주고 리턴값으로 전역변수 k30_mat을 주었다.
	public int sum() {return this.k30_kor + this.k30_eng + this.k30_mat;}; //sum함수를 생성하고  this를 이용하여 전역변수들이라고 알려주고 3가지 전역변수의 합을 리턴값으로 주었다.
	public double avg() {return this.sum() / 3.0;}; //avg함수를 생성하고 리턴값으로 sum함수의 리턴값 나누기 3을 하였다.

}
