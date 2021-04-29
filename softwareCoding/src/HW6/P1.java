package HW6;

public class P1 {//클래스 선언

	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		P1.iamMethod();//원래는 이것처럼 클래스명.메소드명이 원칙이다.
		iamMethod();//자기 클래스안에 함수를 정의하면 함수이름만으로 불러올수 있다.
	}
	public static void iamMethod() {//iamMethod 라는 함수 생성
		System.out.printf("메소드라 불러줘요~~\n");//"메소드라 불러줘요와 줄바꿈을 출력한다.
	}

}
