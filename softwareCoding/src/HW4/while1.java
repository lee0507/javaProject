package HW4;

public class while1 {//클래스 선언
	
	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		int k30_i = 2;//숫자형 변수 k30_i를 정의하고 값을 2로 초기화한다.
		while (k30_i < 9) {//while 반복문의 조건을 k30_i < 9로 설정하여 k30_i의 값이 9보다 작으면 반복문이 수행되도록 한다.
			int k30_j = 1;//숫자형 변수 k30_j를 정의하고 값을 1로 초기화한다.
			while (k30_j <= 9) {//while 반복문의 조건을 k30_i <= 9로 설정하여 k30_i의 값이 9와 같거나 작으면 반복문이 수행되도록 한다.
				System.out.println(k30_i + " * " + k30_j + " = " + k30_i * k30_j);//변수 k30_i, k30_j, k30_i와 k30_j를 곱한 값을 화면에 출력한다.
				k30_j++;//변수 k30_j의 값을 1 증가시킨다.
			}
			k30_i++;//변수 k30_i의 값을 1 증가시킨다.
		}
	}

}
